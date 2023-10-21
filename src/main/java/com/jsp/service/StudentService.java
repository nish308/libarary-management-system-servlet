package com.jsp.service;

import java.util.List;

import com.jsp.dao.BookDao;
import com.jsp.dao.StudentDao;
import com.jsp.dto.Book;
import com.jsp.dto.Librarian;
import com.jsp.dto.Student;

public class StudentService {
	StudentDao studentDao = new StudentDao();
	BookDao bookDao = new BookDao();
	Book book = new Book();

	public Student insertData(Student student) {
		return studentDao.insertData(student);
	}

	public boolean deleteStudent(int id) {
		return studentDao.deleteStudent(id);
	}

	public Student updateData(int id, int year) {
		Student student = studentDao.getStudentById(id);
		if (student != null) {
			return studentDao.updateData(id, year);
		}
		return null;
	}

	public Student getStudentById(int id) {
		return studentDao.getStudentById(id);
	}

	public List<Student> getAllRes() {
		return studentDao.getAllRes();
	}

	public Book returnBookById(int bookid) {
		Book book = bookDao.getBookById(bookid);
		if (book != null && book.getStatus().equalsIgnoreCase("Issued")) {
			Student student = book.getStudent();
			Librarian librarian = book.getLibrarian();

			if (student != null && librarian != null) {
				book.setStatus("Available");
				book.setIssueDate(null);
				book.setStudent(null);
				book.setLibrarian(null);
				return bookDao.returnBook(book);
			}
		}
		return book;
	}

	public boolean loginStudent(String user, String pass) {
		List<Student> students = studentDao.getAllRes();
		for (Student s : students) {
			if (s.getUsername().equals(user) && s.getPassword().equals(pass)) {
				return true;
			}
		}
		return false;
	}

}

package com.jsp.service;

import java.util.List;

import com.jsp.dao.BookDao;
import com.jsp.dto.Book;

public class BookService {
	BookDao bookDao = new BookDao();

	public Book insertData(Book book) {
		book.setStatus("Avaliable");
		return bookDao.insertData(book);
	}

	public boolean deleteData(int id) {
		return bookDao.deleteData(id);
	}

	public Book updateData(int id, String name) {
		return bookDao.updateData(id, name);
	}

	public Book getBookById(int id) {
		return bookDao.getBookById(id);
	}

	public List<Book> getAllRes() {
		return bookDao.getAllRes();
	}

}

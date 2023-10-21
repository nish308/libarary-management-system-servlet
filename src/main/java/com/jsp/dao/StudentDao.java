package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Student;

public class StudentDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("nish");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Student insertData(Student student) {
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
		return student;
	}

	public boolean deleteStudent(int id) {
		Student student = entityManager.find(Student.class, id);
		entityTransaction.begin();
		entityManager.remove(student);
		entityTransaction.commit();
		return true;
	}

	public Student updateData(int id, int year) {
		Student student = entityManager.find(Student.class, id);
		student.setYear(year);
		entityTransaction.begin();
		entityManager.merge(student);
		entityTransaction.commit();
		return student;
	}

	public Student getStudentById(int id) {
		Student student = entityManager.find(Student.class, id);
		return student;
	}

	public List<Student> getAllRes() {
		String sql = "SELECT r FROM Student r";
		Query query = entityManager.createQuery(sql);
		return query.getResultList();
		

	}

}

package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.jsp.dto.Book;

public class BookDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("nish");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Book insertData(Book book) {
		entityTransaction.begin();
		entityManager.persist(book);
		entityTransaction.commit();
		return book;
	}

	public boolean deleteData(int id) {
		Book book = entityManager.find(Book.class, id);
		if(book!= null) {
		entityTransaction.begin();
		entityManager.remove(book);
		entityTransaction.commit();
		return true;
	}
		return false;
	}

	public Book updateData(int id, String name) {
		Book book = entityManager.find(Book.class, id);
		book.setBook_name(name);
		entityTransaction.begin();
		entityManager.merge(book);
		entityTransaction.commit();
		return book;
	}

	public Book getBookById(int id) {
		Book book = entityManager.find(Book.class, id);
		return book;

	}

	public List<Book> getAllRes() {
		String sql = "SELECT r FROM Book r";
		TypedQuery<Book> query = entityManager.createQuery(sql, Book.class);
		List<Book> bookall = query.getResultList();
		return bookall;

	}

	public Book issue(Book book) {
		entityTransaction.begin();
		entityManager.merge(book);
		entityTransaction.commit();
		return book;

	}

	public Book returnBook(Book book) {
		entityTransaction.begin();
		entityManager.merge(book);
		entityTransaction.commit();
		return book;
	}

}

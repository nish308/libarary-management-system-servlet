package com.jsp.dao;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.jsp.dto.BookHistory;

public class BookHistoryDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("nish");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public BookHistory issueBook(BookHistory bookhistory) {
		entityTransaction.begin();
		entityManager.persist(bookhistory);
		entityTransaction.commit();
		return bookhistory;
	}

	public BookHistory returnBook(int bookId) {
		List<BookHistory> bookHistoryList = entityManager
				.createQuery("SELECT b FROM BookHistory b WHERE b.book_id = :bookId", BookHistory.class)
				.setParameter("bookId", bookId).getResultList();

		if (!bookHistoryList.isEmpty()) {
			BookHistory bookhistory = bookHistoryList.get(0);
			entityTransaction.begin();
			bookhistory.setReturnDate(LocalDate.now());
			entityManager.merge(bookhistory);
			entityTransaction.commit();
			return bookhistory;
		}

		return null;
	}

	public List<BookHistory> getAllBookHistory() {
		String sql = "SELECT b FROM BookHistory b";
		TypedQuery<BookHistory> query = entityManager.createQuery(sql, BookHistory.class);
		List<BookHistory> bookHistories = query.getResultList();
		return bookHistories;
	}

}

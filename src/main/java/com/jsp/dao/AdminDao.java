package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.jsp.dto.Admin;

public class AdminDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("nish");

	EntityManager entityManager = entityManagerFactory.createEntityManager();

	EntityTransaction entityTransaction = entityManager.getTransaction();

	// To Save Admin
	public Admin saveAdmin(Admin admin) {
		entityTransaction.begin();
		entityManager.persist(admin);
		entityTransaction.commit();
		return admin;
	}

	// To Delete Admin
	public boolean deleteAdmin(int id) {
		Admin admin = entityManager.find(Admin.class, id);
		if (admin!= null) {
			entityTransaction.begin();
			entityManager.remove(admin);
			entityTransaction.commit();
			return true;
		}
		return false;
	}

	// To Update Admin's Email
	public boolean updateadminpass(int id, String pass) {
		Admin admin = entityManager.find(Admin.class, id);
		admin.setAdmin_pass(pass);
		entityTransaction.begin();
		entityManager.merge(admin);
		entityTransaction.commit();
		return true;
	}
    
	//TO GET ADMIN DETAILS BY ID
	public Admin getAdmin(int id) {
		Admin admin = entityManager.find(Admin.class, id);
		return admin;
	}

	//TO GET ALL ADMIN
	public List<Admin> getAllres() {
		String sql = "SELECT a FROM Admin a";
		TypedQuery<Admin> query = entityManager.createQuery(sql, Admin.class);
		List<Admin> adminall = query.getResultList();
		return adminall;
	}
}

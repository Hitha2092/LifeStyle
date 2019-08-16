package com.LifeStyle.Services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.LifeStyle.DAO.User_LoginDAOI;
import com.LifeStyle.Entitymodels.User_Login;

public class User_LoginServices implements User_LoginDAOI {

	@Override
	public boolean addUser(User_Login user) {
		boolean result = true;
		EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("LifeStyle");
		EntityManager entitymanager = entitymanagerfactory.createEntityManager();
		try {
			entitymanager.getTransaction().begin();
			entitymanager.persist(user);
			entitymanager.getTransaction().commit();
		} catch (PersistenceException e) {
			e.getMessage();
			result = false;
		} finally {
			entitymanager.close();
			entitymanagerfactory.close();
		}
		return result;
	}

	@Override
	public User_Login validateUser(User_Login user) {

		User_Login userfound = null;

		EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("LifeStyle");
		EntityManager entitymanager = entitymanagerfactory.createEntityManager();

//		userfound = entitymanager.find(User_Login.class, user.getEmail());

		try {
			userfound = entitymanager.find(User_Login.class, user.getEmail());
			if (userfound == null) {
				System.out.println("no such email in the list");
				return null;
			} else {

				if (userfound.equals(user)) {
					return userfound;
				} else {
					return userfound;
				}
			}

		} catch (NullPointerException e) {
			e.getMessage();
			return null;
		} finally {
			entitymanager.close();
			entitymanagerfactory.close();
			if (userfound == null) {
				userfound = null;
			}

		}

	}

}

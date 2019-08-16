package com.LifeStyle.Services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.LifeStyle.Entitymodels.UserPersonal;
import com.LifeStyle.Entitymodels.UserProfile;
import com.LifeStyle.Entitymodels.User_Login;

public class UserPersonalServices {
	
	public boolean addPersonalinfo(UserPersonal personal , User_Login user) {
		boolean result = true;
		EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("LifeStyle");
		EntityManager entitymanager = entitymanagerfactory.createEntityManager();
		
		UserPersonal userp = new UserPersonal();
		
		userp= personal;
		userp.setUser(user);
		
		try {
			entitymanager.getTransaction().begin();
			entitymanager.persist(personal);
			entitymanager.getTransaction().commit();
		} catch(PersistenceException e) {
			e.getMessage();
			result = false;
		}
		finally {
			entitymanager.close();
			entitymanagerfactory.close();
		}
		return result;
	}

}

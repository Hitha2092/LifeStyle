package com.LifeStyle.Services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import com.LifeStyle.DAO.UserExerciseDAOI;
import com.LifeStyle.Entitymodels.UserExercise;
import com.LifeStyle.Entitymodels.UserPersonal;
import com.LifeStyle.Entitymodels.User_Login;

public class UserExerciseServices implements UserExerciseDAOI {

	@Override
	public boolean addUserExercise(UserExercise uexercise) {
		boolean result = true;
		EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("LifeStyle");
		EntityManager entitymanager = entitymanagerfactory.createEntityManager();

		try {
			entitymanager.getTransaction().begin();
			entitymanager.persist(uexercise);
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

	public double getMetValue(String sEmail, String date) {
		EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("LifeStyle");
		EntityManager entitymanager = entitymanagerfactory.createEntityManager();
		Double usermetvalue = new Double(0.);

		Query tQueryx = entitymanager.createNativeQuery("Select SUM(el.metValue * ue.duration) as total "
				+ "from  lifestyle.EXERCISELIST el join lifestyle.USEREXERCISE ue on (el.ID = ue.EXERCISE_ID)"
				+ "								join lifestyle.USERPROFILE up on ( up.ID = ue.PROFILE_ID )"
				+ "								WHERE up.USER_EMAIL = '" + sEmail + "' and ue.DATE = '" + date + "'");

		tQueryx.setParameter("up.USER_EMAIL", sEmail);
		tQueryx.setParameter("ue.DATE", date);
		try {
			usermetvalue = (Double) tQueryx.getSingleResult();
		} catch (NoResultException e) {
			System.out.println("NoResultException");
			usermetvalue = 0.;
		}

		System.out.println("UserMetValue : " + usermetvalue);
		entitymanager.close();
		entitymanagerfactory.close();
		if (usermetvalue == null) {
			usermetvalue = 0.;
		}
		System.out.println(usermetvalue);
		return usermetvalue;
	}

}

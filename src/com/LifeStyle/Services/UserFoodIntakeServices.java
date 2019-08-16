package com.LifeStyle.Services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import com.LifeStyle.DAO.UserExerciseDAOI;
import com.LifeStyle.DAO.UserFoodIntakeDAOI;
import com.LifeStyle.Entitymodels.UserFoodIntake;
import com.LifeStyle.Entitymodels.User_Login;

public class UserFoodIntakeServices implements UserFoodIntakeDAOI {

	@Override
	public boolean addFoodIntake(UserFoodIntake ufoodintake) {
		boolean result = true;
		EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("LifeStyle");
		EntityManager entitymanager = entitymanagerfactory.createEntityManager();
		try {
			entitymanager.getTransaction().begin();
			entitymanager.persist(ufoodintake);
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

	public double getTotalCals(String sEmail, String date) {
		EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("LifeStyle");
		EntityManager entitymanager = entitymanagerfactory.createEntityManager();
		Double totalcals = new Double(0.);

		Query tQueryx = entitymanager.createNativeQuery("Select SUM(fl.CALORIES * ufi.SERVINGS) as total "
				+ "from  lifestyle.USERPROFILE up JOIN lifestyle.USERFOODINTAKE ufi on ( up.ID = ufi.PROFILE_ID )"
				+ "								JOIN lifestyle.FOODLIST fl on (fl.ID = ufi.FOOD_ID)"
				+ "								WHERE up.USER_EMAIL = '" + sEmail + "' and ufi.DATE = '" + date + "'");

		tQueryx.setParameter("up.USER_EMAIL", sEmail);
		tQueryx.setParameter("ue.DATE", date);
		try {
			totalcals = (Double) tQueryx.getSingleResult();
		} catch (NoResultException e) {
			System.out.println("NoResultException");
			totalcals = 0.;
		}

		System.out.println("totalcals = " + (totalcals == null ? "null" : "not null"));
		System.out.println("Usertotalcals : " + totalcals);
		entitymanager.close();
		entitymanagerfactory.close();
		if (totalcals == null) {
			totalcals = 0.;
		}
		System.out.println(totalcals);
		return totalcals;
	}

	public double getTotalProtein(String sEmail, String date) {
		EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("LifeStyle");
		EntityManager entitymanager = entitymanagerfactory.createEntityManager();
		Double totalprotein = new Double(0.);

		Query tQueryx = entitymanager.createNativeQuery("Select SUM(fl.PROTEIN * ufi.SERVINGS) as total "
				+ "from  lifestyle.USERPROFILE up JOIN lifestyle.USERFOODINTAKE ufi on ( up.ID = ufi.PROFILE_ID )"
				+ "								JOIN lifestyle.FOODLIST fl on (fl.ID = ufi.FOOD_ID)"
				+ "								WHERE up.USER_EMAIL = '" + sEmail + "' and ufi.DATE = '" + date + "'");

		tQueryx.setParameter("up.USER_EMAIL", sEmail);
		tQueryx.setParameter("ue.DATE", date);
		try {
			totalprotein = (Double) tQueryx.getSingleResult();
		} catch (NoResultException e) {
			System.out.println("NoResultException");
			totalprotein = 0.;
		}

		System.out.println("Usertotalcals : " + totalprotein);
		entitymanager.close();
		entitymanagerfactory.close();
		if (totalprotein == null) {
			totalprotein = 0.;
		}

		return totalprotein;
	}

	public double getTotalCarbs(String sEmail, String date) {
		EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("LifeStyle");
		EntityManager entitymanager = entitymanagerfactory.createEntityManager();
		Double totalcarbs = new Double(0.);

		Query tQueryx = entitymanager.createNativeQuery("Select SUM(fl.CARBS* ufi.SERVINGS) as total "
				+ "from  lifestyle.USERPROFILE up JOIN lifestyle.USERFOODINTAKE ufi on ( up.ID = ufi.PROFILE_ID )"
				+ "								JOIN lifestyle.FOODLIST fl on (fl.ID = ufi.FOOD_ID)"
				+ "								WHERE up.USER_EMAIL = '" + sEmail + "' and ufi.DATE = '" + date + "'");

		tQueryx.setParameter("up.USER_EMAIL", sEmail);
		tQueryx.setParameter("ue.DATE", date);
		try {
			totalcarbs = (Double) tQueryx.getSingleResult();
		} catch (NoResultException e) {
			System.out.println("NoResultException");
			totalcarbs = 0.;
		}

		System.out.println("Usertotalcals : " + totalcarbs);
		entitymanager.close();
		entitymanagerfactory.close();
		if (totalcarbs == null) {
			totalcarbs = 0.;
		}

		return totalcarbs;
	}

	public double getTotalFat(String sEmail, String date) {
		EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("LifeStyle");
		EntityManager entitymanager = entitymanagerfactory.createEntityManager();
		Double totalfat = new Double(0.);

		Query tQueryx = entitymanager.createNativeQuery("Select SUM(fl.FAT* ufi.SERVINGS) as total "
				+ "from  lifestyle.USERPROFILE up JOIN lifestyle.USERFOODINTAKE ufi on ( up.ID = ufi.PROFILE_ID )"
				+ "								JOIN lifestyle.FOODLIST fl on (fl.ID = ufi.FOOD_ID)"
				+ "								WHERE up.USER_EMAIL = '" + sEmail + "' and ufi.DATE = '" + date + "'");

		tQueryx.setParameter("up.USER_EMAIL", sEmail);
		tQueryx.setParameter("ue.DATE", date);

		try {
			totalfat = (Double) tQueryx.getSingleResult();
		} catch (NoResultException e) {
			System.out.println("NoResultException");
			totalfat = 0.;
		}

		System.out.println("Usertotalcals : " + totalfat);
		entitymanager.close();
		entitymanagerfactory.close();
		if (totalfat == null) {
			totalfat = 0.;
		}

		return totalfat;
	}

}

package com.LifeStyle.Services;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import com.LifeStyle.DAO.UserExerciseDAOI;
import com.LifeStyle.DAO.UserProfileDAOI;
import com.LifeStyle.Entitymodels.Activity;
import com.LifeStyle.Entitymodels.UserProfile;
import com.LifeStyle.Entitymodels.User_Login;

public class UserProfileServices implements UserProfileDAOI {

	@Override
	public boolean Registration(UserProfile uprofile, User_Login user) {

		boolean result = true;
		EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("LifeStyle");
		EntityManager entitymanager = entitymanagerfactory.createEntityManager();

		UserProfile userp = new UserProfile();

		userp = uprofile;
		userp.setUser(user);
		try {
			entitymanager.getTransaction().begin();
			entitymanager.persist(uprofile);
			System.out.println(uprofile);
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

	public UserProfile findProfile(int id) {
		UserProfile profilefound = null;

		EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("LifeStyle");
		EntityManager entitymanager = entitymanagerfactory.createEntityManager();
		try {
			profilefound = entitymanager.find(UserProfile.class, id);
		} catch (PersistenceException e) {
			e.getMessage();
		} finally {
			entitymanager.close();
			entitymanagerfactory.close();
		}
		return profilefound;
	}

	public int getProfileId(String email) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("LifeStyle");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		User_Login tuser = new User_Login();
		tuser.setEmail(email);

		// Query query = entityManager.createQuery("SELECT p FROM UserProfile p WHERE
		// p.user = :pEmail");

		Query query = entityManager.createNamedQuery("queryProfbyEmail");
		query.setParameter("pEmail", tuser);

		UserProfile profilefound = (UserProfile) query.getSingleResult();
		int profileId = profilefound.getId();

		entityManager.close();
		entityManagerFactory.close();

		return profileId;
	}

	public double findWeight(int id) {
		UserProfile profilefound = null;
		double weight = 0;

		EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("LifeStyle");
		EntityManager entitymanager = entitymanagerfactory.createEntityManager();
		try {
			profilefound = entitymanager.find(UserProfile.class, id);
			weight = profilefound.getWeight();
		} catch (PersistenceException e) {
			e.getMessage();
		} finally {
			entitymanager.close();
			entitymanagerfactory.close();
		}
		return weight;
	}

	public double getBmrByEmail(String email) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("LifeStyle");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		double bmr;
		User_Login tuser = new User_Login();
		tuser.setEmail(email);

		// Query query = entityManager.createQuery("SELECT p FROM UserProfile p WHERE
		// p.user = :pEmail");
		Query query = entityManager.createNamedQuery("queryProfbyEmail");
		query.setParameter("pEmail", tuser);
		UserProfile profilefound = (UserProfile) query.getSingleResult();
		if (profilefound.getGender() == "male") {
			bmr = (66 + (6.2 * profilefound.getWeight()) + (12.7 * profilefound.getHeight())
					- (6.76 * profilefound.getAge()));
		} else {
			bmr = (655.1 + (4.35 * profilefound.getWeight()) + (4.7 * profilefound.getHeight())
					- (4.7 * profilefound.getAge()));
		}

		entityManager.close();
		entityManagerFactory.close();

		return bmr;
	}

	public double getBmr(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("LifeStyle");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		double bmr;

		UserProfile profilefound = entityManager.find(UserProfile.class, id);

		if (profilefound.getGender() == "male") {
			bmr = (66 + (6.2 * profilefound.getWeight()) + (12.7 * profilefound.getHeight())
					- (6.76 * profilefound.getAge()));
		} else {
			bmr = (655.1 + (4.35 * profilefound.getWeight()) + (4.7 * profilefound.getHeight())
					- (4.7 * profilefound.getAge()));
		}

		entityManager.close();
		entityManagerFactory.close();

		return bmr;
	}

	public double getTdee(int id) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("LifeStyle");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		double tdee = 0;
		double bmr = 0;
		try {

			UserProfileServices uprofileservices = new UserProfileServices();
			bmr = uprofileservices.getBmr(id);

			UserProfile profilefound = entityManager.find(UserProfile.class, id);
			Activity actvty = profilefound.getActivity();
			{
				if (actvty == Activity.Sedentary) {
					tdee = bmr * 1.2;
				} else if (actvty == Activity.Light_Exercise) {
					tdee = bmr * 1.37;
				} else if (actvty == Activity.Moderate_Exercise) {
					tdee = bmr * 1.55;
				} else if (actvty == Activity.Heavy_Exercise) {
					tdee = bmr * 1.725;
				} else {
					tdee = bmr * 1.9;
				}
			}
		} catch (PersistenceException e) {
			e.getMessage();
		} finally {
			entityManager.close();
			entityManagerFactory.close();
		}
		return tdee;

	}

//	@Override
	public boolean updateProfile(UserProfile uprofile) {
		boolean result = true;
		EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("LifeStyle");
		EntityManager entitymanager = entitymanagerfactory.createEntityManager();
		try {
			entitymanager.getTransaction().begin();
			UserProfile profilefound = entitymanager.find(UserProfile.class, uprofile.getId());
			profilefound.setAge(uprofile.getAge());
			profilefound.setWeight(uprofile.getWeight());
			profilefound.setDesiredweight(uprofile.getDesiredweight());
			profilefound.setGender(uprofile.getGender());
			profilefound.setHeight(uprofile.getHeight());
			profilefound.setActivity(uprofile.getActivity());
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

	public int estimateWeeks(int id) {
		UserProfile profilefound = null;
		int goalweeks = 0;

		EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("LifeStyle");
		EntityManager entitymanager = entitymanagerfactory.createEntityManager();
		try {
			profilefound = entitymanager.find(UserProfile.class, id);
			double weight = profilefound.getWeight();
			double target = profilefound.getDesiredweight();
			double netwt = weight - target;

			goalweeks = Math.abs((int) netwt);

		} catch (PersistenceException e) {
			e.getMessage();
		} finally {
			entitymanager.close();
			entitymanagerfactory.close();
		}
		return goalweeks;
	}

	public double estimatedDailyCals(int id) {
		UserProfile profilefound = null;
		double estimatecals = 0;

		EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("LifeStyle");
		EntityManager entitymanager = entitymanagerfactory.createEntityManager();
		try {
			profilefound = entitymanager.find(UserProfile.class, id);
			double weight = profilefound.getWeight();
			double target = profilefound.getDesiredweight();

			UserProfileServices uprofileservices = new UserProfileServices();
			double tdee = uprofileservices.getTdee(id);

			if (weight > target) {
				estimatecals = tdee - 500;
			} else {
				estimatecals = tdee + 500;
			}

		} catch (PersistenceException e) {
			e.getMessage();
		} finally {
			entitymanager.close();
			entitymanagerfactory.close();
		}
		return estimatecals;
	}

}

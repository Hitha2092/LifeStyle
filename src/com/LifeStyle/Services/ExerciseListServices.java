package com.LifeStyle.Services;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import com.LifeStyle.DAO.ExerciseListDAOI;
import com.LifeStyle.Entitymodels.ExerciseList;
import com.LifeStyle.Entitymodels.FoodList;

public class ExerciseListServices implements ExerciseListDAOI {

	@Override
	public boolean insertExercise(ExerciseList eItems) {
		boolean result = true;
		EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("CaseStudy");
		EntityManager entitymanager = entitymanagerfactory.createEntityManager();
		try {
			entitymanager.getTransaction().begin();
			entitymanager.persist(eItems);
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
	public List<ExerciseList> getByExerciseName(String exercise) {
		List<ExerciseList> exerciselist = new ArrayList<>();
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("LifeStyle");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		String likeParam = "%" + exercise + "%";
		Query query = entityManager.createQuery("SELECT e FROM ExerciseList e WHERE e.exercise LIKE :name ");
		query.setParameter("name", likeParam);

		exerciselist = query.getResultList();
		System.out.println("exerciselist" + exerciselist);

		entityManager.close();
		entityManagerFactory.close();

		return exerciselist;
	}

	@Override
	public ExerciseList findExercise(int id) {
		// TODO Auto-generated method stub

		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		ExerciseList returnExercislist = null;

		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("LifeStyle");
			entityManager = entityManagerFactory.createEntityManager();
			returnExercislist = entityManager.find(ExerciseList.class, id);
		} catch (PersistenceException e) {
			e.getMessage();
		} finally {
			entityManager.close();
			entityManagerFactory.close();
		}
		return returnExercislist;
	}

}

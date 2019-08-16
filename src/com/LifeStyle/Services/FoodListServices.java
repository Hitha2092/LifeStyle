package com.LifeStyle.Services;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import com.LifeStyle.DAO.FoodListDAOI;
import com.LifeStyle.Entitymodels.ExerciseList;
import com.LifeStyle.Entitymodels.FoodList;

public class FoodListServices implements FoodListDAOI {

	@Override
	public boolean insertFoodItems(FoodList food) {
		boolean result = true;
		EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("LifeStyle");
		EntityManager entitymanager = entitymanagerfactory.createEntityManager();
		try {
			entitymanager.getTransaction().begin();
			entitymanager.persist(food);
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
	public List<FoodList> getByFoodName(String menu) {
		List<FoodList> foodlist = new ArrayList<>();
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("LifeStyle");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

//		Query query = entityManager.createQuery("SELECT f FROM FoodList f WHERE f.menu = :pMenu");

		String likeParam = "%" + menu + "%";
		Query query = entityManager.createQuery("SELECT f FROM FoodList f WHERE f.menu LIKE :name ");
		query.setParameter("name", likeParam);

		foodlist = query.getResultList();

		entityManager.close();
		entityManagerFactory.close();

		return foodlist;
	}

//	@Override
	public List<FoodList> getByFoodmenu(String foodname) {
		List<FoodList> foodlist = new ArrayList<>();
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("LifeStyle");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		String likeParam = "%" + foodname + "%";
		Query query = entityManager.createQuery("SELECT f FROM FoodList f WHERE f.menu LIKE :name ");
		query.setParameter("name", likeParam);

//		Query query = entityManager.createQuery("SELECT f FROM FoodList f WHERE f.menu LIKE ':name'");
//		query.setParameter("name", "%foodname%");

//		@Query(value="SELECT f FROM FoodList f WHERE f.menu like %:keyword%" , nativeQuery=true)
//		List<FoodList> findfoodByKeyword(@Param("keyword") String keyword);

		foodlist = query.getResultList();

		entityManager.close();
		entityManagerFactory.close();

		return foodlist;
	}

	@Override
	public List<FoodList> getAllFoodItems() {
		EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("LifeStyle");
		EntityManager entitymanager = entitymanagerfactory.createEntityManager();
//		Query query = entitymanager.createQuery("SELECT f FROM FoodList f");
		Query query = entitymanager.createNamedQuery("queryfoodAll");
		List<FoodList> foodlist = query.getResultList();
		return foodlist;

	}

	@Override
	public FoodList findFoodItems(int id) {
		// TODO Auto-generated method stub

		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		FoodList returnfoodlist = null;

		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("LifeStyle");
			entityManager = entityManagerFactory.createEntityManager();
			returnfoodlist = entityManager.find(FoodList.class, id);
		} catch (PersistenceException e) {
			e.getMessage();
		} finally {
			entityManager.close();
			entityManagerFactory.close();
		}
		return returnfoodlist;
	}

}

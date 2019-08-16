package com.LifeStyle.DAO;

import java.util.List;

import com.LifeStyle.Entitymodels.FoodList;

public interface FoodListDAOI {

	FoodList findFoodItems(int id);

	boolean insertFoodItems(FoodList food);

	List<FoodList> getByFoodName(String menu);

	List<FoodList> getAllFoodItems();

}

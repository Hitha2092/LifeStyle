package com.LifeStyle.Entitymodels;


import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import com.LifeStyle.Entitymodels.FoodList;

@Entity
@Table
@NamedQueries ({
@NamedQuery (query="SELECT f FROM FoodList f", name="queryfoodAll"),
@NamedQuery (query="SELECT f FROM FoodList f WHERE f.menu = :pMenu", name="queryByFoodItem")
})
public class FoodList {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Basic
	@Column
	private String menu;
	
	
	@Basic
	@Column
	private double calories;
	
	@Basic
	@Column
	private double carbs;
	
	@Basic
	@Column
	private double protein;
	
	@Basic
	@Column
	private double fat;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}


	public double getCalories() {
		return calories;
	}

	public void setCalories(double calories) {
		this.calories = calories;
	}

	public double getCarbs() {
		return carbs;
	}

	public void setCarbs(double carbs) {
		this.carbs = carbs;
	}

	public double getProtein() {
		return protein;
	}

	public void setProtein(double protein) {
		this.protein = protein;
	}

	public double getFat() {
		return fat;
	}

	public void setFat(double fat) {
		this.fat = fat;
	}

	public FoodList(int id, String menu, int servings, double calories, double carbs, double protein, double fat) {
		super();
		this.id = id;
		this.menu = menu;
		this.calories = calories;
		this.carbs = carbs;
		this.protein = protein;
		this.fat = fat;
	}
	

	public FoodList(String menu, int servings, double calories, double carbs, double protein, double fat) {
		super();
		this.menu = menu;
		this.calories = calories;
		this.carbs = carbs;
		this.protein = protein;
		this.fat = fat;
	}

	public FoodList() {
		super();
		
	}

	@Override
	public String toString() {
		return "FoodList [id=" + id + ", menu=" + menu + ", calories=" + calories
				+ ", carbs=" + carbs + ", protein=" + protein + ", fat=" + fat + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(calories);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(carbs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(fat);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + id;
		result = prime * result + ((menu == null) ? 0 : menu.hashCode());
		temp = Double.doubleToLongBits(protein);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FoodList other = (FoodList) obj;
		if (Double.doubleToLongBits(calories) != Double.doubleToLongBits(other.calories))
			return false;
		if (Double.doubleToLongBits(carbs) != Double.doubleToLongBits(other.carbs))
			return false;
		if (Double.doubleToLongBits(fat) != Double.doubleToLongBits(other.fat))
			return false;
		if (id != other.id)
			return false;
		if (menu == null) {
			if (other.menu != null)
				return false;
		} else if (!menu.equals(other.menu))
			return false;
		if (Double.doubleToLongBits(protein) != Double.doubleToLongBits(other.protein))
			return false;
		return true;
	}
	

	
}


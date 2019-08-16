package com.LifeStyle.Entitymodels;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.LifeStyle.Entitymodels.FoodList;
import com.LifeStyle.Entitymodels.MealType;
import com.LifeStyle.Entitymodels.UserFoodIntake;
import com.LifeStyle.Entitymodels.UserProfile;

@Entity
@Table

public class UserFoodIntake {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	private UserProfile profile;
	
	@OneToOne
	private FoodList food;
	
	@Basic
	@Column
//	@Temporal(TemporalType.DATE)
	private String date;
	
	@Basic
	@Column
	private  MealType type;
	
	@Basic
	@Column
	private int servings;
	

	public int getId() {
		return id;
	}
	
	public UserProfile getProfile() {
		return profile;
	}

	public void setProfile(UserProfile profile) {
		this.profile = profile;
	}

	public FoodList getFood() {
		return food;
	}

	public void setFood(FoodList food) {
		this.food = food;
	}

	public String getdate() {
		return date;
	}

	public void setdate(String date) {
		this.date = date;
	}

	public MealType getType() {
		return type;
	}

	public void setType(MealType type) {
		this.type = type;
	}
	
	
	public int getServings() {
		return servings;
	}

	public void setServings(int servings) {
		this.servings = servings;
	}

	public void setId(int id) {
		this.id = id;
	}

	public UserFoodIntake() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserFoodIntake(int id, UserProfile profile, FoodList food, String date, MealType type, int servings) {
		super();
		this.id = id;
		this.profile = profile;
		this.food = food;
		this.date = date;
		this.type = type;
		this.servings = servings;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((food == null) ? 0 : food.hashCode());
		result = prime * result + id;
		result = prime * result + ((profile == null) ? 0 : profile.hashCode());
		result = prime * result + servings;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		UserFoodIntake other = (UserFoodIntake) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (food == null) {
			if (other.food != null)
				return false;
		} else if (!food.equals(other.food))
			return false;
		if (id != other.id)
			return false;
		if (profile == null) {
			if (other.profile != null)
				return false;
		} else if (!profile.equals(other.profile))
			return false;
		if (servings != other.servings)
			return false;
		if (type != other.type)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "UserFoodIntake [id=" + id + ", profile=" + profile + ", food=" + food + ", date=" + date + ", type="
				+ type + ", servings=" + servings + "]";
	}


}

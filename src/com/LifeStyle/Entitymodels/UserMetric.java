package com.LifeStyle.Entitymodels;

public class UserMetric {
	
	double bmr;
	double tdee;
	double totalcals;
	double foodcals;
	double exercisecals;
	double totalprotein;
	double totalfat;
	double totalcarbs;
	
	
	public double getBmr() {
		return bmr;
	}
	public void setBmr(double bmr) {
		this.bmr = bmr;
	}
	public double getTdee() {
		return tdee;
	}
	public void setTdee(double tdee) {
		this.tdee = tdee;
	}
	public double getTotalcals() {
		return totalcals;
	}
	public void setTotalcals(double totalcals) {
		this.totalcals = totalcals;
	}
	public double getFoodcals() {
		return foodcals;
	}
	public void setFoodcals(double foodcals) {
		this.foodcals = foodcals;
	}
	public double getExercisecals() {
		return exercisecals;
	}
	public void setExercisecals(double exercisecals) {
		this.exercisecals = exercisecals;
	}
	public double getTotalprotein() {
		return totalprotein;
	}
	public void setTotalprotein(double totalprotein) {
		this.totalprotein = totalprotein;
	}
	public double getTotalfat() {
		return totalfat;
	}
	public void setTotalfat(double totalfat) {
		this.totalfat = totalfat;
	}
	public double getTotalcarbs() {
		return totalcarbs;
	}
	public void setTotalcarbs(double totalcarbs) {
		this.totalcarbs = totalcarbs;
	}
	public UserMetric(double bmr, double tdee, double totalcals, double foodcals, double exercisecals,
			double totalprotein, double totalfat, double totalcarbs) {
		super();
		this.bmr = bmr;
		this.tdee = tdee;
		this.totalcals = totalcals;
		this.foodcals = foodcals;
		this.exercisecals = exercisecals;
		this.totalprotein = totalprotein;
		this.totalfat = totalfat;
		this.totalcarbs = totalcarbs;
	}
	public UserMetric() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}

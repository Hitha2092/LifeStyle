package com.LifeStyle.Entitymodels;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.LifeStyle.Entitymodels.UserProfile;
import com.LifeStyle.Entitymodels.User_Login;
import com.LifeStyle.Entitymodels.Activity;


@Entity
@Table(uniqueConstraints=@UniqueConstraint(columnNames="user"))
@NamedQueries ({
@NamedQuery (query="SELECT p FROM UserProfile p", name="queryprofileAll"),
@NamedQuery (query="SELECT p FROM UserProfile p WHERE p.user = :pEmail", name="queryProfilebyEmail"),
@NamedQuery (query="SELECT p FROM UserProfile p WHERE p.user = :pEmail" , name ="queryProfbyEmail")
})
public class UserProfile {
	


@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private	int id;

@Basic
@Column
private	int age;

@Basic
@Column
private String gender;

@Basic
@Column
private	double height;

@Basic
@Column
private	double weight;

@Basic
@Column
private	double desiredweight;

@Basic
@Column
private  Activity activity;

//@Id

//@JoinColumn(name = "email")
//@Column(unique = true)

@OneToOne
private User_Login user;

public int getId() {
	return id;
}



public void setId(int id) {
	this.id = id;
}



public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public double getHeight() {
	return height;
}

public void setHeight(double height) {
	this.height = height;
}


public double getWeight() {
	return weight;
}

public void setWeight(double weight) {
	this.weight = weight;
}

public double getDesiredweight() {
	return desiredweight;
}

public void setDesiredweight(double desiredweight) {
	this.desiredweight = desiredweight;
}

public User_Login getUser() {
	return user;
}

public void setUser(User_Login user) {
	this.user = user;
}



public Activity getActivity() {
	return activity;
}

public void setActivity(Activity activity) {
	this.activity = activity;
}

public UserProfile() {
	super();
	// TODO Auto-generated constructor stub
}

public UserProfile(int id, int age, String gender, double height, double weight, double desiredweight,
		Activity activity, User_Login user) {
	super();
	
	this.age = age;
	this.gender = gender;
	this.height = height;
	this.weight = weight;
	this.desiredweight = desiredweight;
	this.activity = activity;
	this.user = user;
}

@Override
public String toString() {
	return "UserProfile [id=" + id + ", age=" + age + ", gender=" + gender + ", height=" + height + ", weight=" + weight
			+ ", desiredweight=" + desiredweight + ", activity=" + activity + ", user=" + user + "]";
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((activity == null) ? 0 : activity.hashCode());
	result = prime * result + age;
	long temp;
	temp = Double.doubleToLongBits(desiredweight);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + ((gender == null) ? 0 : gender.hashCode());
	temp = Double.doubleToLongBits(height);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + id;
	result = prime * result + ((user == null) ? 0 : user.hashCode());
	temp = Double.doubleToLongBits(weight);
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
	UserProfile other = (UserProfile) obj;
	if (activity != other.activity)
		return false;
	if (age != other.age)
		return false;
	if (Double.doubleToLongBits(desiredweight) != Double.doubleToLongBits(other.desiredweight))
		return false;
	if (gender == null) {
		if (other.gender != null)
			return false;
	} else if (!gender.equals(other.gender))
		return false;
	if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height))
		return false;
	if (id != other.id)
		return false;
	if (user == null) {
		if (other.user != null)
			return false;
	} else if (!user.equals(other.user))
		return false;
	if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
		return false;
	return true;
}


}

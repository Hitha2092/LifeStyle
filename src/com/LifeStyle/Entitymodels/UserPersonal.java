package com.LifeStyle.Entitymodels;


import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = "user"))
public class UserPersonal {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Basic
	@Column
	private String name;

	@Basic
	@Column
	private long phone;

	@Basic
	@Column
	private String city;

	@OneToOne
	private User_Login user;

	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public User_Login getUser() {
		return user;
	}

	public void setUser(User_Login user) {
		this.user = user;
	}

	public UserPersonal(int id, String name, long phone, String city, User_Login user) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.city = city;
		this.user = user;
	}
	
	

	public UserPersonal(String name, long phone, String city, User_Login user) {
		super();
		this.name = name;
		this.phone = phone;
		this.city = city;
		this.user = user;
	}

	public UserPersonal() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "UserPersonal [id=" + id + ", name=" + name + ", phone=" + phone + ", city=" + city + ", user=" + user
				+ "]";
	}

	
}



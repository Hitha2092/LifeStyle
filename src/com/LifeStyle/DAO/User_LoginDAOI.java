package com.LifeStyle.DAO;

import com.LifeStyle.Entitymodels.User_Login;

public interface User_LoginDAOI {

	boolean addUser(User_Login user);

	User_Login validateUser(User_Login user);

}

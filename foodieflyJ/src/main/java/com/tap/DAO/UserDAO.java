package com.tap.DAO;

import java.util.List;

import com.tap.Models.User;

public interface UserDAO {

	void addUser(User user);
	
	User getUser(int userId);
	
	int updateUser(User user);
	
	void deleteUser(int userId);
	
	List<User> getAllUsers();
	
}

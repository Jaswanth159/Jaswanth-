package com.tap.Utility;

import com.tap.DAOImpl.UserDAOImpl;
import com.tap.Models.User;

public class Demo {

	public static void main(String[] args) {
		
		UserDAOImpl userDAOImpl = new UserDAOImpl();
		
		User userbyEmail = userDAOImpl.getUserbyEmail("jaswanthjasse@gmail.com");
		
		System.out.println(userbyEmail);

	}

}

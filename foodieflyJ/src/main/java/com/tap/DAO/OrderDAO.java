package com.tap.DAO;

import java.util.List;

import com.tap.Models.Order;

public interface OrderDAO {

	int addOrder(Order order);
	
	Order getOrder(int orderId);
	
	void updateOrder(Order order);
	
	void deleteorder(int orderId);
	
	List<Order> getAllUsers();
	
}

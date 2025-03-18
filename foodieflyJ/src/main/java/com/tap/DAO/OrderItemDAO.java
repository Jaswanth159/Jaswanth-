package com.tap.DAO;

import java.util.List;

import com.tap.Models.OrderItem;

public interface OrderItemDAO {

	void addOrderItem(OrderItem orderitem);
	
	OrderItem getOrderItem(int orderItemId);
	
	void updateOrderItem(OrderItem orderItem);
	
	void deleteOrderItem(int orderItemId);
	
	List<OrderItem> getAllOrderItems();
	
}

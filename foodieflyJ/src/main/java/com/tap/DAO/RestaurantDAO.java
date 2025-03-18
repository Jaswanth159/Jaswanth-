package com.tap.DAO;

import java.util.List;

import com.tap.Models.Restaurant;

public interface RestaurantDAO {

	void addRestaurant(Restaurant restaurant);
	
	Restaurant getRestaurant(int restaurantId);
	
	void updateRestaurant(Restaurant restaurant);
	
	void deleteRestaurant(int RestaurantId);
	
	List<Restaurant> getAllRestaurants();
	
}

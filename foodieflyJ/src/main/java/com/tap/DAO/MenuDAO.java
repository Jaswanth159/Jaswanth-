package com.tap.DAO;

import java.util.ArrayList;
import java.util.List;

import com.tap.Models.Menu;

public interface MenuDAO {

	void addMenu(Menu menu);
	
	List<Menu> getRestaurantMenu(int restaurantId);
	
	Menu getMenu(int menuId);
	
	void UpdateMenu(Menu menu);
	
	void DeleteMenu(int menuId);
	
	List<Menu> getAllMenus();
	
}

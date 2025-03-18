package com.tap.Servlet;

import java.io.IOException;
import java.util.List;

import com.tap.DAOImpl.MenuDAOImpl;
import com.tap.DAOImpl.RestaurantDAOImpl;
import com.tap.Models.Menu;
import com.tap.Models.Restaurant;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/menuServlet")
public class MenuServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession();
		int restaurantId = Integer.parseInt(req.getParameter("restaurantId"));
		session.setAttribute("restaurantId", restaurantId);
		
		RestaurantDAOImpl restaurantImpl = new RestaurantDAOImpl();
		
		Restaurant restaurant = restaurantImpl.getRestaurant(restaurantId);
		
		req.setAttribute("restaurant", restaurant);
		
		MenuDAOImpl menu = new MenuDAOImpl();
		
		List<Menu> restaurantMenu = menu.getRestaurantMenu(restaurantId);
		
		req.setAttribute("restaurantMenu", restaurantMenu);
		
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("menu.jsp");
		
		requestDispatcher.forward(req, resp);
		
	}
	
}

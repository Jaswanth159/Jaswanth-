<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List,com.tap.Models.Restaurant" %>
    
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Home - Foodiefly</title>
    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;600&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
    <link rel="stylesheet" href="home.css">
    <link rel="icon" type="image/x-icon" href="images\favicon.ico">
    
</head>
<body>
    <header>
        <nav>
            <div class="logo">
                <img src="images/foodieFlyU.jpg" alt="Logo">
            </div>
            <div class="nav-items">
                <div class="location">
                    <span>Location</span>
                    <p>Bangalore, Karnataka, India</p>
                </div>
                <div class="nav-links">
                    <a href="#"><i class="fas fa-search"></i> Search</a>
                    <a href="#"><i class="fas fa-percent"></i> Offers</a>
                    <div class="dropdown">
                    	<a href="#"><i class="fas fa-user"></i> Account</a>
                        <div class="dropdown-content">
                            <a href="profile.jsp">Profile</a>
                            <a href="#">Orders</a>
                            <a href="#">Favorites</a>
                            <a href="#">Settings</a>
                            <a href="signin.jsp">Log out</a>
                        </div>
                    </div>
                    <a href="cart.jsp"><i class="fas fa-shopping-cart"></i> Cart</a>
                </div>
            </div>
        </nav>
    </header>

    <main>
        <div class="filters">
            <h2>Restaurants</h2>
            <div class="filter-options">
                <button>Filter</button>
                <button>Sort By</button>
                <button>Fast Delivery</button>
                <button>New</button>
                <button>Rating 4.0+</button>
            </div>
        </div>

        <div class="restaurant-grid">
            
	<%
	
		List<Restaurant> restaurants = (List<Restaurant>) request.getAttribute("allRestaurants");
	
		for(Restaurant r : restaurants) {
			
	%>
            
       <a href="menuServlet?restaurantId=<%= r.getRestaurantId() %> ">
       
       <div class="restaurant-card">
	                <div class="restaurant-img">
	                    <img src="<%= r.getImagePath() %>" alt="<%= r.getName() %>">
	                    <span class="offer"><%= r.getOffers() %></span>
	                </div>
	                <div class="restaurant-info">
	                    <h3><%= r.getName() %></h3>
	                    <div class="rating">
	                        <span> <%= r.getRating() %> ★</span>
	                        <span>•</span>
	                        <span><%= r.getDeliveryTime() %> - <%= r.getDeliveryTime() + 5 %> mins</span>
	                    </div>
	                    <p><%= r.getCuisineType() %></p>
	                    <p class="location"><%= r.getAddress() %></p>
	                </div>
            </div>
       </a>
            
	<%	} %>
        </div>
    </main>
    
    <footer>
        <div class="footer-content">
            <div class="footer-section">
                <h3>Company</h3>
                <ul>
                    <li><a href="#">About Us</a></li>
                    <li><a href="#">Team</a></li>
                    <li><a href="#">Careers</a></li>
                    <li><a href="#">Blog</a></li>
                </ul>
            </div>
            <div class="footer-section">
                <h3>Contact</h3>
                <ul>
                    <li><a href="#">Help & Support</a></li>
                    <li><a href="#">Partner with Us</a></li>
                    <li><a href="#">Ride with Us</a></li>
                </ul>
            </div>
            <div class="footer-section">
                <h3>Legal</h3>
                <ul>
                    <li><a href="#">Terms & Conditions</a></li>
                    <li><a href="#">Privacy Policy</a></li>
                    <li><a href="#">Cookie Policy</a></li>
                </ul>
            </div>
            <div class="footer-section">
                <h3>Follow Us</h3>
                <div class="social-links">
                    <a href="#"><i class="fab fa-facebook"></i></a>
                    <a href="#"><i class="fab fa-twitter"></i></a>
                    <a href="#"><i class="fab fa-instagram"></i></a>
                    <a href="#"><i class="fab fa-linkedin"></i></a>
                </div>
            </div>
        </div>
        <div class="footer-bottom">
            <p>&copy; 2024 Foodie Fly. All rights reserved.</p>
        </div>
    </footer>
</body>
</html>
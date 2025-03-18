package com.tap.Models;

public class Restaurant {

	private int restaurantId;
    private String name;
    private String address;
    private String phone;
    private String cuisineType;
    private int deliveryTime;
    private int adminUserId;
    private float rating;
    private String isActive;
    private String imagePath;
    private String offers;

    // Default Constructor
    public Restaurant() {
    }
    
    // Parameterized Constructor
    public Restaurant(int restaurantId, String name, String address, String phone, 
    		String cuisineType , Integer deliveryTime, String offers,
    		int adminUserId, float rating, String isActive, String imagePath) {
    	this.restaurantId = restaurantId;
    	this.name = name;
    	this.address = address;
    	this.phone = phone;
    	this.cuisineType = cuisineType;
    	this.deliveryTime = deliveryTime;
    	this.offers = offers;
    	this.adminUserId = adminUserId;
    	this.rating = rating;
    	this.isActive = isActive;
    	this.imagePath = imagePath;
    }
    
    public int getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCuisineType() {
		return cuisineType;
	}

	public void setCuisineType(String cuisineType) {
		this.cuisineType = cuisineType;
	}

	public int getDeliveryTime() {
		return deliveryTime;
	}

	public void setDeliveryTime(int deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	public int getAdminUserId() {
		return adminUserId;
	}

	public void setAdminUserId(int adminUserId) {
		this.adminUserId = adminUserId;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public String getOffers() {
		return offers;
	}

	public void setOffers(String offers) {
		this.offers = offers;
	}

	@Override
	public String toString() {
		return "Restaurant [restaurantId=" + restaurantId + ", name=" + name + ", address=" + address + ", phone="
				+ phone + ", cuisineType=" + cuisineType + ", deliveryTime=" + deliveryTime + ", adminUserId="
				+ adminUserId + ", rating=" + rating + ", isActive=" + isActive + ", imagePath=" + imagePath
				+ ", offers=" + offers + "]";
	}
	
}

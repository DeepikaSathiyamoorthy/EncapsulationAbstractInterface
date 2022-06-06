package com.vstl.javaAbstractClass;

//Abstract class
public abstract class FoodOrderingApp {
	//Abstract method
	public abstract void selectFood(String stringFood, String stringOuantity);
	
	public FoodOrderingApp() {
		
		System.out.println("Welcome to Food Delivery App");
	}
	
	public void orderFood(String stringFood, String stringQuanity) {
		
		if(stringFood!=null)
			System.out.println("Order is placed for Items: " +stringFood+ " "+stringQuanity+ " Plates" );
		else
			System.out.println("Food is not Selected from the Menu");
	}
	
	
}

package com.vstl.javaAbstractClass;

public class TestAbstractFoodordering {

	public static void main(String[] args) {
		
		FoodOrderingApp objFoodOrderingApp = new FiveStarHotel();
		objFoodOrderingApp.selectFood("Biriyani", "2");
		objFoodOrderingApp.orderFood("Biriyani", "2");
		
		System.out.println("--------------------------------");
		
		FoodOrderingApp objFoodOrdering = new ThreeStarHotel();
		objFoodOrdering.selectFood("Chapati", "4");
		objFoodOrdering.orderFood("Chapati", "4");
		
		System.out.println("--------------------------------");
		
	}

}

package com.vstl.javaAbstractClass;

public class ThreeStarHotel extends FoodOrderingApp{

	public ThreeStarHotel() {
		//Constructor call its super class by compiler even if super keyword is not given
		System.out.println("Welcome to ThreeStar Hotel");
	} 

	@Override
	public void selectFood(String stringFood, String stringOuantity) {
		
		if(stringFood!=null && stringOuantity !=null)
			System.out.println("ThreeStar Hotel Food Order is placed for : " +stringFood + " " +stringOuantity+ " plates");
		else
			System.out.println("Food is not Selected from the Menu");
		
	}

}

package com.vstl.javaAbstractClass;

public class FiveStarHotel extends FoodOrderingApp{

	public FiveStarHotel() {
		System.out.println("Welcome to FiveStarHotel");
	}

	@Override
	public void selectFood(String stringFood, String stringOuantity) {
		
		if(stringFood!=null && stringOuantity !=null)
			System.out.println("FiveStar Hotel Food Order is placed for : " +stringFood + " "+stringOuantity+ " plates");
		else
			System.out.println("Food is not Selected from the Menu");
		
	}

}

package com.vstl.javaEncapsulation;

public class TestEncapsulation {

	public static void main(String[] args) {
		
		EncapsulationforAppSignUp objEncap = new EncapsulationforAppSignUp();
		objEncap.setStrUserName("Bose");
		System.out.println("UserName : " +objEncap.getStrUserName());
		
		objEncap.setStrEmailID("boseconnect@gmail.com");
		System.out.println("Email ID : " +objEncap.getStrEmailID());
		
		objEncap.setIntAge(25);
		System.out.println("User Age : " +objEncap.getIntAge());

		objEncap.setLongMobileNumber(854333562);
		System.out.println("Mobile Number: " +objEncap.getLongMobileNumber());
		
		objEncap.setStrGender("Female");
		System.out.println("User Gender " +objEncap.getStrGender());
		
	}

}

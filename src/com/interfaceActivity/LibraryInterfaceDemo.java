package com.interfaceActivity;

public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KidUsers k=new KidUsers();
		k.age=10;
		k.bookType="Kids";
		System.out.println("Test case 1:");
		k.registerAccount();
		k.requestBook();
		k.age=18;
		k.bookType="Fiction";
		System.out.println("Test Case 2:");
		k.registerAccount();
		k.requestBook();
		AdultUser a=new AdultUser();
		a.age=5;
		a.bookType="Kids";
		System.out.println("Test Case 3:");
		a.registerAccount();
		a.requestBook();
		a.age=23;
		a.bookType="Fiction";
		System.out.println("Test Case 4:");
		a.registerAccount();
		a.requestBook();

	}

}

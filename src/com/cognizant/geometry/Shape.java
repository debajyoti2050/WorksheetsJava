package com.cognizant.geometry;
import java.util.Scanner;

import com.cognizant.shapes.*;

class Shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c=new Circle();
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the Radius :");
			Float radius=sc.nextFloat();
			double result=c.CalculateCircumference(radius);
			System.out.println("The Circumference is :"+ result);
		}
		
	}

}

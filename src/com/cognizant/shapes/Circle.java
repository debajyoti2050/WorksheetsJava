package com.cognizant.shapes;

public class Circle {

	private float radius;
	float pi=3.5f;
	
	public Circle(){
		radius=1.5f;
	}
	public Circle(float radius){
		this.radius=radius;
		Circle c2=new Circle();
	}
	public Circle(float radius,float pi) {
		this.radius=radius;
		this.pi=3.5f;
		
	}
	
	double CalculateCircleArea(float radius) {
		float area;
		area=pi*radius*radius;
		return area;
			
	}
	public double CalculateCircumference(float radius) {
		float circumference;
		System.out.println(pi+radius);
		circumference=2*pi*radius;
		return circumference;
		
	}
	
	
}

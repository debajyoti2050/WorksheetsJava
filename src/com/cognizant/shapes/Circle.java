package com.cognizant.shapes;

public class Circle {

	private float radius;
	float pi;
	
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
	double CalculateCircumference(float radius) {
		float circumference;
		circumference=2*pi*radius;
		return circumference;
		
	}
	
	
}

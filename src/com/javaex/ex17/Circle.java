package com.javaex.ex17;

//import com.javaex.ex15.Shape;

public class Circle extends Shape {

//	private int width;
//	private int height;
	protected double Radius;
	
	public Circle() {
		super();
	}
	
	public Circle(String lineColor, String fillColor, double radius) {	
		super(lineColor, fillColor);			
		this.Radius = radius;		
	}
	
	
//	메서드 gs
	public final double getRadius() {
		return Radius;
	}

	public final void setRadius(double radius) {
		Radius = radius;
	}


	
	
	
	@Override
	
	
	
	public void draw() {
		System.out.println("선색:"+super.getLineColor()+" 면색:"+super.getFillColor()+" 원형이 만들어졌습니다.");
	}
	
	
	public double area() {
		double result = Radius * Radius * 3.14;
		return result;
	}
	
}

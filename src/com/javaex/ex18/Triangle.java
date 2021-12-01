package com.javaex.ex18;

//import com.javaex.ex17.Shape;

public class Triangle extends Shape implements Drawable{

	private int width;
	private int height;
	
	
	
	public Triangle() {	
	}
	
	public Triangle(String lineColor, String fillColor, int width, int height) {
		super(lineColor, fillColor);
		this.width = width;
		this.height = height;
	}
	
	
	
	public final int getWidth() {
		return width;
	}
	public final void setWidth(int width) {
		this.width = width;
	}
	public final int getHeight() {
		return height;
	}
	public final void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height + ", getLineColor()=" + getLineColor()
				+ ", getFillColor()=" + getFillColor() + "]";
	}
	
	
	public void draw() {
		System.out.println("선색:"+super.getLineColor()+" 면색:"+super.getFillColor()+" 가로:"+width+" 세로:"+height+" 삼각형이 만들어졌습니다.");
	}
	
	
	public double area() {
		double result = (width * height) /2;
		return result;
	}
	
	
	
	
}

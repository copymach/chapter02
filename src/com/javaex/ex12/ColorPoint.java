package com.javaex.ex12;

public class ColorPoint extends Point {

//	필드
	private String color;
	private String ColorPoint;
	
//	생성자
	
	public ColorPoint(String color, String ColorPoint) {
		this.color = color;
		this.ColorPoint = ColorPoint;
	}
	
	
	public void Point (String color) {
		this.color = color;		
	}
	
	public void ColorPoint (int x, int y , String color) {
		this.color = color;
		this.x = x;
		this.y = y;
	}
		
	
	private final void setColor(String color) {
		this.color = color;
	}
	
	
	
//	매서드 gs
	private final String getColorPoint() {
		return ColorPoint;
	}


	private final void setColorPoint(String ColorPoint) {
		this.ColorPoint = ColorPoint;
	}

	
	
	
	
	
//	매서드 일반
	

	@Override
	public String toString() {
		return "ColorPoint [color=" + color + ", x=" + x + ", y=" + y + "]";
	}

	public void showInfo2 () {
		System.out.println("==============");
		System.out.println(x + y);
		System.out.println("==============");
	}

	
	
	
	
	
}

package com.javaex.ex13;

public class Circle {

	
//	필드
	private String lineColor;
	private String fillColor;
	private int radius;
	
	
//	생성자 컨스트럭터
	public Circle() {
	}
	
	
	public Circle(String lineColor, String fillColor, int radius) {
		this.lineColor = lineColor;
		this.fillColor = fillColor;
		this.radius = radius;
	}
	
	
	
//	메서드 gs
	public final String getLineColor() {
		return lineColor;
	}
	public final void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	public final String getFillColor() {
		return fillColor;
	}
	public final void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	public final int getRadius() {
		return radius;
	}
	public final void setRadius(int radius) {
		this.radius = radius;
	}
	
	
//	메서드 일반
	@Override
	public String toString() {
		return "Circle [lineColor=" + lineColor + ", fillColor=" + fillColor + ", radius=" + radius + "]";
	}
	
	
	public void draw() {
		System.out.println("선색 :" +lineColor+"면색 :"+fillColor+"둘레 :"+radius+"원형을 그렸습니다.");
	}
	
	
	

	
}

package com.javaex.ex13;

public class Rectangle {

//	필드
	private String lineColor;
	private String fillColor;
	private int width;
	private int height;
	
	
//	생성자	
	public Rectangle() {
	}

	public Rectangle(String lineColor, String fillColor, int width, int height) {
		this.lineColor = lineColor;
		this.fillColor = fillColor;
		this.width = width;
		this.height = height;
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

	
	
//	메서드 일반
	
	@Override
	public String toString() {
		return "Rectangle [lineColor=" + lineColor + ", fillColor=" + fillColor + ", width=" + width + ", height="
				+ height + "]";
	}


	public void draw() {
		System.out.println("선색 :" +lineColor+"면색 :"+fillColor+"가로 :"+width+"세로 :"+height+"사각형을 그렸습니다.");
//		System.out.println("선색 :" +this.lineColor);
	}
	

	
	
}

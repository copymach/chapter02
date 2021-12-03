package com.javaex.ex15;

//import com.javaex.ex15.Shape;

public class Rectangle extends Shape {

//	필드
	private int width;
	private int height;
	
	
//	생성자 컨스트럭터
	public Rectangle() {
		super(); //부모쪽의 기본 생성자 Shape();
	}
	
	public Rectangle(String lineColor, String fillColor, int width, int height) {
		
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

	
	
//	@Override
	public String toString2() {
		return "Rectangle [width=" + width + ", height=" + height + ", getLineColor()=" + getLineColor()
				+ ", getFillColor()=" + getFillColor() + "]";
	}
	
	public void draw() {
		System.out.println("선색:"+super.getFillColor()+" 면색:"+super.getFillColor()+" 가로:"+this.width+" 세로:"+this.height+" 사각형을 그렸습니다.");
	}
	
	
	
	

}

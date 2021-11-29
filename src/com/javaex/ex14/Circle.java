package com.javaex.ex14;

public class Circle extends Shape {

	private int width;
	private int height;

	
	public Circle() {
		super();
	}
	
	public Circle(String lineColor, String fillColor, int width, int height) {	
		super(lineColor, fillColor);
		
		/* 아래 코드를 썼더니 Shape에서 값을 못가져온다
		super.getLineColor();
		super.getFillColor();
		*/
		
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
		return "Circle [width=" + width + ", height=" + height + "]";
	}
	
	
	
	
	public void drawC() {
		System.out.println("선색:"+super.getLineColor()+" 면색:"+super.getFillColor()+" 가로:"+width+" 세로:"+height+" 원형이 만들어졌습니다.");
	}
	
}

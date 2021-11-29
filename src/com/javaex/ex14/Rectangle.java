package com.javaex.ex14;

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

		
		/*
		부모쪽의 필드가 private 라서 못 가져오는 경우 해결법
		1. 부모쪽 private를 public 으로 바꾼다 -> 비추
		2. 부모쪽 필드를 private 를 protected 로 변경 -> 비추
		3. setter 를 사용 super.setLineColor (lineColor);
		4. 부모쪽의 생성자 사용 super(lineColor, fillColor);
		
		super.fillColor = fillColor;
		this.fillColor = fillColor;
		
		super.setLineColor (lineColor);
		
		*/
						
		
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

	
//	toString 에서 상속 부분에서 linecolor fillcolor 가져옴
//	부모쪽에도 똑같은 메소드가 있다. 동일 메소드 존재 하면 자식의 메소드를 사용, 부모 메소드 사용불가 재정의
//	@Override
	public String toString2() {
		return "Rectangle [width=" + width + ", height=" + height + ", getLineColor()=" + getLineColor()
				+ ", getFillColor()=" + getFillColor() + "]";
	}
	
	public void draw() {
		System.out.println("선색:"+super.getFillColor()+" 면색:"+super.getFillColor()+" 가로:"+this.width+" 세로:"+this.height+" 사각형을 그렸습니다.");
	}
	
	
	
	

}

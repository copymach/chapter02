package com.javaex.ex12;

public class Point {

//	필드
	protected int x;
	protected int y;
	
	
//	생성자
	public Point () {		
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
//	메소드 g/s
	
	private final int getX() {
		return x;
	}
	private final void setX(int x) {
		this.x = x;
	}
	private final int getY() {
		return y;
	}
	private final void setY(int y) {
		this.y = y;
	}
	
	
	
//	메소드 일반
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	
	public void showInfo() {
		System.out.println(x + y);
	}
	
	
	
}

package com.javaex.ex18;

public class Point implements Drawable {

//		drawable에 구현

	private int x;
	private int y;
	
	
	
	
//	생성자
	public Point() {
	}	

	public Point(int x, int y) {	
		this.x = x;
		this.y = y;
	}
	
	
//	메서드 gs
	public final int getX() {
		return x;
	}
	public final void setX(int x) {
		this.x = x;
	}
	public final int getY() {
		return y;
	}
	public final void setY(int y) {
		this.y = y;
	}
	
	
//	메서드 일반
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

//	인터페이스 메소드 구현 (implements 때문에 반드시 구현)
	public void draw () {
		System.out.println("x는 "+x+" y는 "+y+" 점을 그렸습니다.");
	}

	
	
}

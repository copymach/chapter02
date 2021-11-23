package com.javaex.ex02;

public class PointApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		틀에서 받아온 시나리오
		
		Point p01 = new Point(3, 6);
//		p01.setX(3);		
//		p01.setY(6);		
//		p01.draw();
		
		System.out.println(p01.getX());
		
		
		Point p02 = new Point();
		p02.setX(7);
//		p02.setY(8);
		p02.draw();
		
		System.out.println(p02.getX());
		
		
//		Point p03 = new Point(3, 2);
		
	}

}

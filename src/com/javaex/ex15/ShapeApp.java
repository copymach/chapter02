package com.javaex.ex15;

public class ShapeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape rr01 = new Rectangle("노랑", "빨강", 5, 4);
//		s01.getWidth();
		
		
		Rectangle rr011 = new Rectangle("파랑", "연두", 4, 5);
//		s001.get
		
		Shape cc01 = new Circle("파랑", "연두", 4, 5);
		cc01.draw();
		
		Shape[] sArray = new Shape[3];
		
		Shape r01 = new Rectangle("asd","asd",2,3);
		Shape c01 = new Circle("ddw","wdad", 5,8);
		Shape t01 = new Triangle("hj","dd",4,8);
		
		sArray[0] = r01;
		sArray[1] = c01;
		sArray[2] = t01;
		
		for (int i=0; i<sArray.length; i++) {
			sArray[i].draw();
		}
		
		
//		아래의 문법으로 Circle의 radius 를 가져올 수 있다.
//		((Circle)c01).getRadius
		
		
		
		
	}

}

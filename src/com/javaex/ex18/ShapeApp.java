package com.javaex.ex18;

public class ShapeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point p01 = new Point (5,8);
		
		p01.draw();
		System.out.println(p01.getX());
		
		
		
		Drawable p02 = new Point (645,916);
		p02.draw();
		((Point)p02).getX(); // 다운캐스팅을 이용해서 값을 불러온다
		System.out.println(((Point)p02).getX());
		
		System.out.println("====================");
		
		
		Drawable r01 = new Rectangle("노랑","파랑",4,3);
//		r01.get 해도 아무것도 안나온다 답은 다운캐스팅
//		((Rectangle)r01).getWidth()
		System.out.println(((Rectangle)r01).getWidth());
		
		System.out.println("====================");
		
		Drawable p03 = new Point (1,2);
		Drawable r02 = new Rectangle("노랑","파랑",4,3);
		Drawable c01 = new Circle("노랑","주황",4);
		Drawable t01 = new Triangle("검정","연두",4,3);
		
		Drawable[] dArray = new Drawable[4];
		
		dArray[0] = p03;
		dArray[1] = r02;
		dArray[2] = c01;
		dArray[3] = t01;
		
//		그리기
		for (int i=0; i<dArray.length; i++) {
			dArray[i].draw();
		}
		
//		면적출력
		for (int i=0; i<dArray.length; i++) {
//			((Shape)dArray[i]).area();
			if (dArray[i] instanceof Shape) { //지금 주소의 인스턴스 shape 틀에서 만들어진건가?
				System.out.println(((Shape)dArray[i]).area());
			}
			
			
		}
		
		
		
		/*
//		배열을 만들자
		Shape[] sArray = new Shape[3];
		
		
//		메모리에 도형을 만든다
		Rectangle r01 = new Rectangle("파랑", "연두", 4, 5);
		System.out.println(r01.area());
		
		
		Circle c01 = new Circle("노랑", "빨강", 5);
		System.out.println(c01.area());
		
		Triangle t01 = new Triangle	("파랑", "연두", 5, 2);
		System.out.println(t01.area());
		
		
		
		Shape sr01 = new Rectangle("주황", "검정", 5, 5);
		System.out.println(sr01.area());
		
		
//		배열에 도형을 담는다
		sArray[0] = r01;
		sArray[1] = c01;
		sArray[2] = t01;
		
		
//		모든 도형의 면적 구하기
		for (int i=0; i>sArray.length; i++) {
			System.out.println(sArray[i].area());
		}
		
//		Shape ss00 = new S  (ss00.area());
		
		/*
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
		
		
		
	*/	
	}

}

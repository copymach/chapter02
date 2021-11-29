package com.javaex.ex14;

public class ShapeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape s01 = new Shape ("빨강","빨강");
		System.out.println(s01.toString());
		
		
//		사각형 3개 만들기
		Rectangle r01 = new Rectangle ("빨강", "빨강", 5, 4);
		System.out.println(r01.toString()); //자식쪽에 재정의 된 메소드 사용
		System.out.println(r01.toString2());
		
		Rectangle r02 = new Rectangle ("노랑", "연두", 3, 9);
		Rectangle r03 = new Rectangle ("청록", "보라", 1, 5);
		
//		r01.draw();
//		r02.draw();
//		r03.draw();
		
//		사각형을 배열에 넣기
		Rectangle[] rArray = new Rectangle[3];
		
		rArray[0] = r01;
		rArray[1] = r02;
		rArray[2] = r03;
	
		
//		배열을 순회하면서 출력
		for (int i=0; i<rArray.length; i++) {
			rArray[i].draw();
		}
		
		
		System.out.println("===============================");
		
		Triangle t01 = new Triangle("빨강", "노랑", 34, 71);
		Triangle t02 = new Triangle("파랑", "초록", 43, 8);
		Triangle t03 = new Triangle("연두", "보라", 4, 91);
		
		Triangle[] tArray = new Triangle[3];
		tArray[0] = t01;
		tArray[1] = t02;
		tArray[2] = t03;
		
		
		for (int i=0;i>tArray.length; i++) {
			tArray[i].draw();
		}
	
		
		System.out.println("===============================");
		

		Circle c01 = new Circle("퍼플", "그린", 94, 45);
		Circle c02 = new Circle("블랙", "옐로", 63, 9);
		Circle c03 = new Circle("레드", "블루", 2, 7);
		
		Circle[] cArray = new Circle[3];
		cArray[0] = c01;
		cArray[1] = c02;
		cArray[2] = c03;
		
		
		for (int i=0;i>cArray.length; i++) {
			cArray[i].draw();
		}
		
		
		
		
	}

}

package com.javaex.ex13;

public class ShapeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		메모리가 움직이는 스토리
		
		
//		사각형3개를 만들어 메모리에 올린다
		Rectangle r01 = new Rectangle ("빨강", "노랑", 5, 5);				
		Rectangle r02 = new Rectangle ("파랑", "노랑", 10, 20);		
		Rectangle r03 = new Rectangle ("빨강", "빨강", 55, 77);	
		
		
//		사각형 관리를 위해서 배열을 만든다
		Rectangle[] rArray = new Rectangle[3];
		
//		사각형을 배열 주소에 넣어보자
		rArray[0] = r01;
		rArray[1] = r02;
		rArray[2] = r03;
		
		
//		모두 draw로 그려보자
		for (int i=0; i<rArray.length; i++) {
			rArray[i].draw();
		}
		
		
//		모든 사각형의 선 색상만 출력해보자
		for (int i=0; i<rArray.length; i++) {
			System.out.println(rArray[i].getLineColor());
//			위와 같은 방법으로 가로 길이만 출력도 가능
		}
		
//		가로의 합을 출력해보자
		int sum = 0;
		for (int i=0; i<rArray.length; i++) {
			
			System.out.println(rArray[i].getWidth());
			sum = sum + rArray[i].getWidth();
			
		}
		System.out.println("가로합 :"+sum);
		
				
		Circle c01 = new Circle ("보라", "빨강", 16);
		Circle c02 = new Circle ("노랑", "검정", 16);
		Circle c03 = new Circle ("연두", "갈색", 16);
		
		
//		원 관리할 배열
		Circle[] cArray = new Circle[3];
		
		cArray[0] = c01;
		cArray[1] = c02;
		cArray[2] = c03;
		

//		모두 draw로 그려보자
		for (int i=0; i<cArray.length; i++) {
			cArray[i].draw();
		}
		
		
		
		Triangle t01 = new Triangle();
		
		Triangle[] tArray = new Triangle[3];
		
		tArray[0]=t01;
//		tArray[1]=t02;
//		tArray[2]=t03;
		
				
		for (int i=0; i<tArray.length; i++) { 
			tArray[i].draw();					
		}
		
		
		
		
		/*
		r01.draw();
		r02.draw();
		r03.draw();
		
		
		System.out.println(r01.toString());
		System.out.println(r02.toString());
		System.out.println(r03.toString());
		
		*/
	}

}

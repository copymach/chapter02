package com.javaex.ex09;

public class MyMathApp {

//	필드 - 필요없음
	
	
//	생성자 -기본 생성자 사용
	
	
//	메소드 gs - 필드가 없으니 필요없다
	
//	메소드 일반
	
//	void 리턴 해줄 것이없다
	public static void main(String[] args) {

	MyMath myMath = new MyMath();
	
	int sum01 = myMath.plus(3, 6);
	System.out.println(sum01);
	
	double sum02 = myMath.plus(4.3, 5.5);
	System.out.println(sum02);
	
	double sum03 = myMath.plus (5.5, 9);
	System.out.println(sum03);
	
	double sum04 = myMath.plus(30, 87.99);
	System.out.println(sum04);
	
	
	double sum05 = MyMath.circleArea(5);
	System.out.println(sum05);
	
	
	
	
	/* 오버로딩 전...
	int sum01 = myMath.plusInt(3, 6);
	System.out.println(sum01);
	
	double sum02 = myMath.plusDouble(4.3, 5.5);
	System.out.println(sum02);
	
	double sum03 = myMath.plusDoubleInt (5.5, 9);
	System.out.println(sum03);
	
	double sum04 = myMath.plusIntDouble (30, 87.99);
	System.out.println(sum04);
	*/
	
}

	
	
	
	
	
	

}

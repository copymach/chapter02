package com.javaex.ex09;

public class MyMath {	
		
//		필드
	
//	파이값을 필드에 등록
//	필드의 스태틱 PI 값은 대문자로 쓰는게 관례
//	static double PI = 3.14159;
	
//		생성자 - 디폴트
		
//		메소드 gs
		
	
	
//	메소드 일반 - 오버로딩 이후 plus로 통일
	public int plus(int a, int b) {
	
	return a+b;		
//	int sum = a+b;
//	return sum;
	}	
	
	public double plus(double a, double b) {
//	double sum = a+b;		
	return a+b;
	}

	public double plus(double a, int b) {
//	double sum = a+b;
	return a+b;		
	}

	public double plus(int a, double b) {
//	double sum = a+b;
//	return sum;
	return a+b;
	}

	
	static double PI = 3.14159;
	
//	원의 넓이를 구하는 공식	
	public static double circleArea (int radius) {
//		double area = radius * radius * 3.14;
		return radius * radius * PI;
	}
	
//	원의 둘레  
	public static double circleRound (int radius) {
		return (radius + radius) * PI;
	}
	
	
	
	

	
		/*메소드 일반 - 오버로딩 전
	public int plusInt(int a, int b) {
		
		return a+b;		
//		int sum = a+b;
//		return sum;
		}	
		
	public double plusDouble(double a, double b) {
//		double sum = a+b;		
		return a+b;
		}
	
	public double plusDoubleInt (double a, int b) {
//		double sum = a+b;
		return a+b;		
		}
	
	public double plusIntDouble (int a, double b) {
//		double sum = a+b;
//		return sum;
		return a+b;
		}
		*/
	
	
}

package com.javaex.ex06;

public class Math {

//	필드
	
	
//	생성자
//	내용을 넣지않는다 = 기본 생성자 사용
//	public Math() { 	}
	
	
//	메소드 g/s
//	생략
	
//	메소드 일반
//	메소드 오버로드 plus 파라미터 하나로 다 계산해줌
	public int plus (int num01, int num02) {
		int sum = num01 + num02;
		return sum;
	}
		
	public double plus (double num01, double num02) {
		double sum = num01 + num02;
		return sum;	
		
	}
	
	public double plus (double num01, int num02) {
		double sum = num01 + num02;
		return sum;	
		
	}

	public double plus (int num01, double num02) {
		double sum = num01 + num02;
		return sum;	
		
	}

}

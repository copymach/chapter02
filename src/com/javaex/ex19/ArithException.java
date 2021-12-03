package com.javaex.ex19;

import java.util.Scanner;

//0을 입력하면 에러가 나는 프로그램
public class ArithException {

//	필드
	private double num;
	
	public static void main(String[] args) {

//		변수
		double result;
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		num= sc.nextInt();
		
		result = 100/num;
		System.out.println(result);
		
		
		sc.close();

	}

}

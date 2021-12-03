package com.javaex.ex19;

import java.util.Scanner;

//0을 입력하면 에러가 나는 프로그램
public class ArithException2 {

//	필드
	private double num;
	
	public static void main(String[] args) {

//		변수
		double result;
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		num= sc.nextInt();
		
//		0을 입력하면 에러 발생에 대응 try catch
		
		
		
		try {
			result = 100/num;
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println(e);
			System.out.println("catch영역 수학적오류 0으로 나눌 수 없습니다");
		} finally {
//			예외상황 유무 상관없이 처리되는 영역. 뺴고 써도 됨. 
			System.out.println("finally 영역");
		}
		
		
		
		
		
		sc.close();

	}

}

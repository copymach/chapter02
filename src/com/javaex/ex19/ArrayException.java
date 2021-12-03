package com.javaex.ex19;

public class ArrayException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		배열 에러 3번쨰 방 없는데 뭘 시키는 상황에서 발생한 에러
		
		
		int[] intArray = new int[3];
//		int[] intArray = new int[] {3,6,9};
		intArray[0] = 3;
		intArray[1] = 6;
		intArray[2] = 9;
		
	
		
		try {
			System.out.println(intArray[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
//			넘어간 범위를 알려줌
			System.out.println(e.toString());
//		다른 에러 발생시 잡아줌
		} catch(ArithmeticException err) {
			System.out.println(err);
		} finally {
			System.out.println("finally 영역");
		}
		
	}

}

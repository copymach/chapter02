package com.javaex.ex19;

public class NullPointException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = new String ("안녕하세요");
		
		try {
			str = null;
			System.out.println(str.toString());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("주소값이 없습니다");
		}
	}

}

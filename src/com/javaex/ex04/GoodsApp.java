package com.javaex.ex04;

public class GoodsApp {

		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Goods camera = new Goods ("니콘", 400000);
			System.out.println(camera.toString());
	
			
			Goods cup = new Goods();
			cup.setName("머그컵");
			cup.setPrice(2000);
			System.out.println(cup.toString());
	
	
	}	

}

package com.javaex.ex08;

public class GoodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Goods camera = new Goods("캐논", 40000);
		System.out.println(camera.toString());
		
		
		Goods cup = new Goods ();
		cup.setName("머그컵");
		cup.setPrice(3000);
		System.out.println(cup.toString());
		
		Goods computer = new Goods("LG그램", 900000);
		System.out.println(computer.toString());
		 
	}

}

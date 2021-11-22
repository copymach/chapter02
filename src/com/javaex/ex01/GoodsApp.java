package com.javaex.ex01;

public class GoodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		Goods camera = new Goods();
		camera.getName("니콘");
		camera.setPrice(400000);
		
		Goods notebook = new Goods();
		notebook.getName("LG그램");
		notebook.setPrice(900000);
		
		Goods cup = new Goods();
		cup.getName("머그컵");
		cup.setPrice(2000);
		
//		System.out.println(camera.getName());
//		System.out.println(camera.getPrice());
		
		camera.showInfo();
		notebook.showInfo();
		cup.showInfo();
		
	}
}	





			/*
//		필드
		private String name "니콘"
		private int price
		
//		생성자
		
		
//		메소드
		public void setName(String n) {
			name = n;
//			"|니콘"
		}
		
		public String getName() {
			return name;
		}
		
		
		
		
		Goods camera = new goods ();
		camera.setName("니콘");
		System.out.println(camera.getName());
	}
	
}
		*/
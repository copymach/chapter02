package com.javaex.ex04;

public class Goods {

//	필드 
	private String name;
	private int price;
	
	
//	생성자
//	메모리에 올리는 작업
//	alt shift s 누르고 - 컨스트럭트 유징 필드 (생성자 자동생성) super(); 는 걍지워
	public Goods() {
		System.out.println("디폴트 생성자");
	}
	
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
		System.out.println("Goods(String name, int price");
	}

	
//	메소드 g/s 게터세터
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
		
//	메소드 일반
	
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + "]";
	}

	
	

}

package com.javaex.ex08;

public class Goods {

//	필드
	private String name;
	private int price;
//	totalcount에 static 추가해서 통합 합산 가능
	private static int totalCount;
	
//	생성자 
	
	public Goods ( ) {
		this.totalCount++;
	}


	public Goods(String name, int price) {
		super();
		this.name = name;
		this.price = price;
//		totalCount 의 this는 안붙혀줘도 된다
		this.totalCount++ ; 
	}

	
//	메소드 g/s

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


	
	public int getTotalCount() {
		return totalCount;
	}


	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}



//	메소드 일반
	
	
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + ", totalCount=" + totalCount + "]";
	}	
	
	public void showInfo() {
		System.out.println(name);
		System.out.println(price);
		System.out.println("");
	}
	
}

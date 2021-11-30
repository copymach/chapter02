package com.javaex.ex16;

public class Person {

	private String name;
	private int age;
	
	
//	생성자 컨스트럭터
	public Person() {	
	}
	
	
	public Person(String name, int age) { 	
		this.name = name;
		this.age = age;
	}
	
	
//	메서드 g/s
	public final String getName() {
		return name;
	}
	public final void setName(String name) {
		this.name = name;
	}
	public final int getAge() {
		return age;
	}
	public final void setAge(int age) {
		this.age = age;
	}
	
	
//	메서드 일반
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	public void showInfo() {
		System.out.println("---------------------------");
		System.out.println("*이름 :"+ name+ "  *나이 :"+age);
		System.out.println("---------------------------");
	}	

}

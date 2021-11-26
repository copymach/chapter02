package com.javaex.ex11;

public class Person {

//	필드
	protected String name;
	private int age;

	
//	생성자 - 단축키 alt shift s 컨스트럭터
	public Person() {		
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Person2");
	}

	

	
//	메소드 gs


	
	
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
//		1살보다 어리게 입력되면 1살로 출력 -46살 -> 1살
		if (age<1) {			
			return 1;
		} else {
			return age;
		}
		
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	
//	메소드 일반
	
	

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	
		
	public void showInfo() {
//		this name 과 name의 차이 getname() this.getname()
//		메소드를 실행해서 불러들인 것 
//		get name을 써서 get에 if문 1살처리를 적용할 수 있다.
		System.out.println("이름(this.name) :"+this.getName());			
		System.out.println("나이(this.age) :"+this.getAge());
		
//		필드에서 직접 불러들인 것
		System.out.println("이름(name) :"+name);
		System.out.println("나이(age) :"+age);
		
	}
	
	

}

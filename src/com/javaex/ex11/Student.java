package com.javaex.ex11;

//extends Person 추가해서 상속
public class Student extends Person{


//	필드
//	private String name;
//	private int age;
//	person 에서 name age 상속 (가져온다) 
	private String shoolName;

	
	
//	생성자
	public Student() {
		System.out.println("Student()");
	}
	
	public Student(String shoolname) {
		this.shoolName = shoolname;
		System.out.println("Student1");
	}

	public Student (String name, int age, String schoolName) {
//		this 은 해당필드 super 는 부모필드		
//		super.name = name; name이 private 이라서 안보인다는 에러가 뜸
		
//		부모 쪽의 기본 생성자 실행 명확히 써주어야 함
		super();
		
//		2번쨰 생성자를 사용하는 것 super(); 함께 못쓴다
//		super(name, age);
		
		super.setName(name);
		super.setAge(age);
		
		
		
		
		
//		this 해당 필드의 학교이름
		this.shoolName = schoolName;
		System.out.println("Student3");
	}



//	메소드 gs
	
	public String getShoolname() {
		return shoolName;
	}



	public void setShoolname(String shoolname) {
		this.shoolName = shoolName;
	}


	
	
	

//	메소드 일반
	
	@Override
	public String toString() {
		return "Student [shoolName=" + shoolName + "]";
	}
	


	
	
	

	
	

}

package com.javaex.ex11;

public class PersonApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 
		
		
		Person p01 = new Person("정우성", 45);
		Person p02 = new Person();
		p02.setName("이정재");
		p02.setAge(46);
		
		System.out.println(p01.toString());
		System.out.println(p02.toString());
		
		
		p01.showInfo();
		p02.showInfo();
		
//		person 상속받은 student 
		Student s01 = new Student();
		s01.setName("강호동");
		s01.setAge(53);
		s01.setschoolName("서울고교");
		
		System.out.println(s01.getName());
		System.out.println(s01.getAge());
		System.out.println(s01.getschoolName());
		
		System.out.println(s01.toString());
		
			
		
		Student s02 = new Student ("서장훈", 50, "경기고교");
		Student s03 = new Student ("충북고교");
		
		
		s02.showInfo();
		s02.showInfo2();
	}

}

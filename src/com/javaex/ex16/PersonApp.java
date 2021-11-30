package com.javaex.ex16;

public class PersonApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p01 = new Person ("정우성",43);
		p01.showInfo();
		
		
		Student s01 = new Student ("강호동", 32, "화곡고등학교");
		s01.showInfo();
//		s01.get (스쿨네임까지 다된다)
		
		
		Person ps01 = new Student("이정재", 45, "발산고등학교");
//		ps01.get (스쿨네임이 안된다)
		
		ps01.showInfo();
		System.out.println(ps01.toString());
		
		
		
		
		
	}

}

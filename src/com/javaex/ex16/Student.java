package com.javaex.ex16;

class Student extends Person {

//	필드
	private String schoolName;
	
//	생성자
	public Student() {}
	
//	부모것 까지 고려해서 만든 생성자
	public Student(String name, int age, String schoolName) {
		super(name, age); //부모쪽 정의된것 사용하는 코드
		this.schoolName = schoolName;
		
	}
	
//	메서드gs
	public final String getSchoolName() {
		return schoolName;
	}

	public final void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	
//	tostring 생성시 inherited filed가안뜬다
	@Override
	public String toString() {
		return "Student [schoolName=" + schoolName + "]";
	}
	
	
	
	

}

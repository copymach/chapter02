package com.javaex.ex02;

public class Point {

	/* 객체지향 연습 - 틀에서 사용할 이름 지정
	draw() 메소드 작성
	setX()
	getX()
	
	setY()
	getY()
	*/
	
	
	
//	필드
	private int x;
	private int y;

	
//	생성자
	
//	우리가 작성하지 않아도 자동으로 생성되는 코드
//	해당 클래스를 메모리에 올려주는 일을 한다.
//	디폴트 생성자
	public Point() {
		System.out.println("Point()실행");
		//해당 클래스를 메모리에 올리는 일
	}
	
	public Point(int x) {
		this.x = x;
	}
		
//	다른 방식으로 x y 입력하는 생성자
//	이 생성자를 만들면 위의 생성자는 사라진다
//	2개 방식을 사용하고 싶으면 2개 모두작성해야함
	public Point (int x, int y) {
		this.x = x;
		this.y = y;

	}
	
	
	

//	메소드
//	void 를 넣어주는 이유 - return은 없다
	public void setX (int x) {
		this.x = x;
	}
	
	
//	값을 읽어오는 것 setX 가 아닌 getX	
	public int getX() {
		return x;
	}
	
	
	public void sedddtY (int y) {
		this.x = y;
	}
	
	public int getY () {
		return y;
	}	
	
	
	public void draw() {
		System.out.println("점 [x="+x+", y="+y+"]를 그렸습니다.");
		
	}
		
}



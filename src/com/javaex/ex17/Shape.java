package com.javaex.ex17;


//해당 코드에 abstract 를 쓰는게 있기 때문에 붙혀주기
public abstract class Shape {

//	공통되는 부분 나중에 private -> protected
	
	private String lineColor;
	private String fillColor;
	
	
//	생성자 컨스트럭터 
	public Shape() {
	}
	
	
	public Shape(String lineColor, String fillColor) {
		this.lineColor = lineColor;
		this.fillColor = fillColor;
	}
	
//	메서드gs
	public final String getLineColor() {
		return lineColor;
	}
	public final void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	public final String getFillColor() {
		return fillColor;
	}
	public final void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	
	
//	메서드 일반
	@Override
	public String toString() {
		return "Shape [lineColor=" + lineColor + ", fillColor=" + fillColor + "]";
	}
	
	public void draw() {
//		System.out.println("선색:"+lineColor+" 면색:"+fillColor+" 뭔가가 만들어졌습니다.");
	}
	
	
	/*area() 만들 수 없음
	public double area() {
		오버라이딩 (덮어쓰기) 하라고 임의의 숫자 0.0 을 넣어줌 
		return 0.0;
	}
	*/
	
	
	
	/*
	추상 메소드 (=가상메소드) 제목만 있고 오버라이드가 있을때만 완성이 되는 코드
	abstract가 있을때 클래스에 abstract 가 있어야 한다
	자기가 면적을 만들 수 없으니 자식의 면적을 가져와서 계산을 하겠다는 의미
	shape는 부모이기 때문에 어떤 도형이 올지 모른다.
	*/	
	
	public abstract double area();
	
	


}

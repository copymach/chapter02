package com.javaex.ex15;

public class Shape {

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
	
	
}

package com.javaex.ex03;

public class Song {

//	필드
	private String title;
	private String artist;
	private String album;
	private String composer;
	private String year;
	private int track;
	

//	생성자
	
	
//	CTRL SHIFT F 자동정렬
	
	/* 메소드 쉽게 입력하기 
	위에 privat string 만들고 나서 
	alt shift s 단축키
	generate getters and setters 선택 */
	
	
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public int getTrack() {
		return track;
	}
	public void setTrack(int track) {
		this.track = track;
	}
	
	
//	메소드 - 일반
	public void showInfo() {
		System.out.println(artist+", "+title+" ("+album+", "+year+", "+track+", "+composer+" 작곡)");
	}
	
	
//	alt shift s -> generate to String 하면 자동생성
//	개발용 안의 데이터를 확인 할 수 있음.	
	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", album=" + album + ", composer=" + composer + ", year="
				+ year + ", track=" + track + "]";
	}
	
	
	
	/*
	
//	메소드 - g/s
	public void setTitle(String title) {
		this.title = title;
		
	}
	
	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getTitle() {
		return title;
	}
	
	public String getArtist() {
		return artist;
	}
	
//	자료형을 맞춰줘야 하니까 void
	public void setTrack (int track) {
		this.track = track;
	}
	*/
	
	

	
	
	
	
}

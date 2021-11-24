package com.javaex.ex05;

public class Song {

		
//		필드
		private String title;
		private String artist;
		private String album;
		private String composer;
		private String year;
		private int track;
		
		
//		생성자
//		아무것도 없으면 디폴트 생성자
//		메모리에 올리는 일
		public Song() {
			System.out.println("Song(0)");
		}
		
//		따로 만든 생성자
		
//		5개 생성자
		public Song (String title, String album, String artist, String composer, String year) {
			this.title = title;
			this.album = album;
			this.artist = artist;
			this.composer = composer;
			this.year = year;
						
			System.out.println("Song(6)");
		}
		
		
		public Song(String title, String artist, String album, String composer, String year, int track) {
			
//			같은 클래스에 있는 다른 생성자. 위의 것과 분업
//			코드 중복을 피하는 기술. 갯수와 타입이 맞는 것과 분업
			this(title, artist, album, composer, year);
			
			this.track = track;
			
			System.out.println("Song(6)");
		}
		
		
		
//		메서드 g/s
		
		

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
		
		
		//메소드 일반
		public void showInfo( ) {
			System.out.println(artist+", "+title+" ("+album+", "+year+", "+track+", "+composer+" 작곡)");
		}
		
		
		@Override
		public String toString() {
			return "Song [title=" + title + ", artist=" + artist + ", album=" + album + ", composer=" + composer
					+ ", year=" + year + ", track=" + track + "]";
		}
		

		
		
		
		
	

}

package com.javaex.ex05;

public class SongApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		디폴트 생성자로 시도
		Song s01 = new Song();
		s01.setTitle("좋은날");
		s01.setArtist("아이유");
		s01.setAlbum("Real");
		s01.setComposer("이민수");
		s01.setYear("2010");
		s01.setTrack(3);
	
//		to string 으로 개발자가 원하는 정보가 나오는걸 확인했다
		System.out.println(s01.toString());
		
		
//		5개 생성자 초기화 트랙번호는 세터로 초기화
//		Song s02 = new Song("거짓말", "Bigbang", "Always", "gdragon", "2007", "2");
//		s02.setTrack(2);
//		System.out.println(s02.toString());
	
//		6개 모든 필드값 초기화 하는 생성자 사용
		Song s03 = new Song ("123", "456", "4342", "123", "asdasd");
		
//		Song s04 = new Song ("가나다", "라마바", "사바가", "나날이", "323", "1");
//		System.out.println(s04.toString());
				
				
		
		
//		System.out.printf("%s, %s ( %s, %d, %s번 track, %s 작곡 )\n", artist, title, album, year, track, composer);

		
		
//		아이유출력
		s01.showInfo();
		
//		빅뱅출력
//		s02.showInfo();
	}

}

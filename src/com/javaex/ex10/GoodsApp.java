package com.javaex.ex10;

public class GoodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		배열을 이용해서 관리하기 Goods.totalcounter
		
		Goods[] goodsArray = new Goods[3]; 
		
		Goods camera = new Goods("니콘", 300000);
		Goods cup = new Goods("머그컵", 2000);
		Goods computer = new Goods("LG그램", 800000);
		
		goodsArray[0] = camera;
		goodsArray[1] = cup;
		goodsArray[2] = computer;
		
		
		int count = 0;
//		아래의 for 문으로 goods가 몇개인지 알 수 있다
//		배열이 3개인데 2개인 경우 대응하는 코드
		for (int i=0; i<goodsArray.length; i++) {
			
			if(goodsArray[i] != null) {
				System.out.println(goodsArray[i].toString());
				count++;
			}
					
			System.out.println(goodsArray[i].toString());
			
		}
		System.out.println(count);
		
		
//		이름만 출력해보자
		for (int i=0; i<goodsArray.length; i++) {
//			System.out.print(goodsArray[i].showInfo());
			goodsArray[i].showInfo();
		}
		
		
		
		
		/* 출력 테스트 코드
		System.out.println("==============");
		System.out.println(camera.toString());
		System.out.println(goodsArray[0].toString());
		*/
		
		
		/* 배열 문법		
		int [] intArray = new int [3];
		intAraay[0] = 35;
		intAraay[1] = 79;
		*/		
		
	}

}

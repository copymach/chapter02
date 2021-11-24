package com.javaex.ex07;

public class Tv {

//		필드
//		모든 필드는 private으로 접근 제어
		private int channel;
		private int volume;
		private boolean power;
				
		
//		생성자1 기본형
		public Tv() {
			System.out.println("Tv(0)");
		}
		
//		생성자2  
		public Tv (int channel, int volume, boolean power) {
			this.channel = channel;
			this.volume = volume;
			this.power = power;
			
			System.out.println("Tv(3)");
		}

		
		
//		메소드 g/s
//		세터는 제외하고 게터만 이용 read-only
		
		public int getChannel() {
			return channel;
		}

		public int getVolume() {
			return volume;
		}

		public boolean isPower() {
			return power;
		}
				
		
//		메소드 일반
					
//		4) void power( boolean on ) 메소드 구현
		public void power() {
			if (true) {
				System.out.println("전원ON");
			} else {
				System.out.println("전원OFF");
			}
		}
		
//		5) void channel( int channel ) 메소드 구현 (1~255 유지)
//		6) void channel( boolean up ) 메소드 오버로딩 (1~255 유지, 1씩 증감)

		public void channel () {
			if (true) {
				channel = channel++;
			} else if (channel==256 && channel>255) {
				channel = 255;
			} else {
				channel = channel--;
			}
		}

//		7) void volume( int voluem ) 메소드 구현 ( 0 ~ 100 유지 )
//		8) void volume( boolean up ) 메소드 오버로딩 (0 ~ 100 유지, 1씩 증감)
		public void volume () {
			if (true) {
				volume = volume++;
			} else if (volume==101 && volume>100) {
				volume = 100;				
			} else {
				volume = volume--;
			}
		}
		
//		9) void status() 메소드 구현( TV 정보 출력)
		public void status() {
			System.out.println(channel+"-"+volume+"-"+power);
		}
		
		
		@Override
		public String toString() {
			return "Tv [channel=" + channel + ", volume=" + volume + ", power=" + power + "]";
		}
	
		
		

}

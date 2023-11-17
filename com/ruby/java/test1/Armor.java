package com.ruby.java.test1;

public class Armor { //클래스를 기술한 것

		// TODO Auto-generated method stub
			//필드
			private String name;
			public int height;
			private int speed;
			private String color;
			private boolean isFly;
			public void test(int ... v) {
				System.out.println("test(int... v) 호출");
				for (int x: v) {
				System.out.println(" " + x);
			}
//			public void test(int a) {	
//			System.out.println("test(int a) 호출");
//			}
//			public void test(int a, int b) {	
//				System.out.println("test(int a, int b) 호출");
//			}
//			public void test(int a, int b, int c) {	
//				System.out.println("test(int a, int b, int c) 호출");
//			}
//			public void show() {  //show()아래의 내용을 메인에서 가져온다.
//				System.out.println(speed); //같은 클래스 안에서는 사용가능하다는거 확인
//				System.out.println(name);
//				System.out.println(height);
//			}
//			public void speedUp(int value) {
//				speed += value;
//			}//메소드
			public int getSpeed() {
				return speed;
			}
			public void setName() {
				String value = "홍길동";
				name = value;
			}
			public void setHeight(int value) {
				if (value > 0)
				height = value;	//메인에서 맘대로 못바꾸게 하는 것. 
				else {
					System.out.println("음수 안돼");  
				}
			}
			public void takeOff() {
				System.out.println("비행하다");
			//	return; //여기 return이 있으면 아래의 sysout 실행안됨.
				System.out.println("아이언맨");
				return //void return = void(없음)??
			}
}

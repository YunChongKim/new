package com.ruby.java.test2;
import com.ruby.java.test1.*; //com.ruby.java.test1에 있는 걸 다 쓰겠다. or 파일이름 입력
public class Exam01 {
public static void main(String[] args) {
	Armor arm = new Armor(); //new = 객체를 만드는 행위 
	arm.setHeight(100);
	arm.height =99;
	arm.setHeight(55); //메소드 호출(arm.set())
	int result = arm.takeOff();
	System.out.println("result"+ result);
	arm.speedUp(100); //함수호출
	int speed= arm.getSpeed();
	//System.out.println(arm.height);
	System.out.println(arm.height);
	arm.show();
	arm.speedup(99);
	
}
}

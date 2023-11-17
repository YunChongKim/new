package Chap09;

import java.util.StringTokenizer;

public class Test14 {
	public static void main(String[] args) {
	
	String msg = " Although the world is full of suffering, it is full also of the overcoming of it";
	StringTokenizer st1 = new StringTokenizer(msg); //위의 msg문장을 ST인스턴스가 가지고 있음.
	System.out.println("단어 수 : " + st1.countTokens());
	while (st1.hasMoreTokens()) { //토큰이 존재하면 true
		System.out.println("남아있는 토큰 수 : " + st1.countTokens());//첫번째에 있는 토큰을 가르키고 다음 단어로 커서가 내려감.(=토큰이 하나 빠지므로 -1개 됨.)
		System.out.println(st1.nextToken()); //
	}
	     
	String s = "id=guest&name=Amy&pwd=1234";
	StringTokenizer st2 = new StringTokenizer(s,"&"); //&를 기준으로 토큰 분리 (s."=&")은 '='와 '&'를 기준으로 토큰 분리
	while (st2.hasMoreTokens()) { //토큰이 존재하면 true
		System.out.println("남아있는 토큰 수 : " + st2.countTokens());
		System.out.println(st2.nextToken()); //
	}
	
	}

}

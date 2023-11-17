package Chap10;

import java.util.ArrayList;
import java.util.Scanner;

public class StarArrayList {

	public static void main(String[] args) {
	//Scanner로 객체를 생성해서 반복값 입력.	
		int repeat = 5;
//		Scanner sc = new Scanner(System.in);
//		String star = sc.nextInt();
//		
	//ArrayList  객체생성
		ArrayList<String> list = new ArrayList<>();
		
	//for문으로 돌리는법
	 for(int i = 1; i <=repeat; i++) {
		 String s = "";
		 for(int j = 0; j<i; j++) {
			 s+= "*";
		 }
		 list.add(s);
		 }
		
		
		
	// 저장할 문자열을 생성해서 ArrayList에 저장
	//repeat 횟수만큼 반복 (for)
		
		
		for(int i = 1; i < repeat; i++ ) {
			list.add("*".repeat(i));
		}
		
		
	//ArrayList에 저장된 문자열을 출력	
		for(int i = 0; i < list.size(); i++ ) {
			System.out.println(list.get(i));
		}
		System.out.println("-".repeat(30));
		list.forEach(s -> System.out.println(s));
		
	
	
	}
	
	

}

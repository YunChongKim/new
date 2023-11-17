package Chap10;

import java.util.ArrayList;
import java.util.Random;

public class practice {
	
		public static void main(String[] args) {
	//값을 담을 리스트 변수 생성
		int sum = 0;
		int max = 0;
		int min = 999;
		int avg = 0;
					
	//1oo개의 정수를 랜덤하게 생성(0~100사이) 전체 값 출력, 평균, 합, 최대, 최소)
		Random rd = new Random();
		ArrayList<Integer> a = new ArrayList<>(100);
		for(int i = 0; i <= 100; i++) {
			a.add(rd.nextInt(100));	

			
			
			
		}	
	//100개의 정수값을 읽으면서 최대, 최소, 평균, 합을 구함
	// 값을 구하는것만 입력
		for(int i = 0;)
		
		
		
		
	//구한 값 출력			
		System.out.println("전 체 값 : ");			
		System.out.println("평 균 : ");			
		System.out.println("합 계 : ");			
		System.out.println("최 대  : ");			
		System.out.println("최 소  : ");			
	}

}

package Chap10;

import java.util.ArrayList;
import java.util.Random;

public class practice_p {
	
		public static void main(String[] args) {
			int sum = 0;
			int avg = 0;
			int min = Integer.MAX_VALUE;
			int max = Integer.MIN_VALUE;
			
			//값을 담을 리스트 변수 생성
			ArrayList<Integer> list = new ArrayList<>(100);
			Random rd = new Random();
			
					
	//1oo개의 정수를 랜덤으로 저장
			
			for(int i = 0; i < 100; i++) {
			list.add(rd.nextInt(101)); // random.nextInt() = 0~괄호안에 있는 수 안에서 랜덤하게 숫자를 뽑아냄.
		}	
	//100개의 정수값을 읽으면서 최대, 최소, 평균, 합을 구함
	// 값을 구하는것만 입력
	
			for(int i = 0;i < list.size(); i++) {
		//max = (max < list.get(i))?list.get(i):max;
			
			if (max < list.get(i)) max = list.get(i);
			if (min > list.get(i)) min = list.get(i);
			sum += list.get(i);
			
		
		}
		avg = sum /list.size();
		
			
	//구한 값 출력			
		System.out.println("평 균 : " + avg);			
		System.out.println("합 계 : " + sum);			
		System.out.println("최 대  : " + max);			
		System.out.println("최 소  : " + min);
		System.out.println(list);
		
	}

}

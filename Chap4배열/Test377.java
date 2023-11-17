package Chap4배열;

import java.util.Scanner;

public class Test377 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] score = {90,85,78,100,98}; //수의 배열 
		Scanner sc = new Scanner(System.in);
		int[] score = new int[5];
		
		for(int i = 0; i < score.length; i++ ) {
			System.out.println("점수:");
			score[i] = sc.nextInt(); // 여기까지가 배열에 들어갈 값 입력하는 식
		}
		
	
		int sum = 0; //총점
		double avg = 0.0; //평균
		int max = 0; //최댓값
		int min = 999; //최솟값
		
		for(int i = 0; i <score.length; i++) {
			sum +=score[i];
			if(max < score[i])
				max = score[i];
			if(min > score[i])
				min = score[i];
		
		}
		
		avg = sum/score.length;

		
		System.out.print("총 점 :"+ sum);
		System.out.print("평 균 :"+ avg);
		System.out.print("최댓값 :"+ max);
		System.out.print("최솟값 :"+ min);

	}
}
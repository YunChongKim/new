package Chap09;

import java.util.Arrays;
import java.util.Random;

public class Test15 {

	public static void main(String[] args) {

		Random r2 = new Random(); //r2 인스턴스 생성
		int[]data = new int[10];	//data 배열 생성
		for(int i =0; i<data.length; i++) { 
			data[i] = r2.nextInt(10);
		}
		
		for(int num: data)		//for(변수선언 : 배열 변수명 
			System.out.print(" " + num);
		System.out.println();
		Arrays.sort(data);
		for (int num: data)
			System.out.print(" " + num);
		System.out.println();
		System.out.println(Arrays.toString(data)); // tostring이 괄호랑 콤마 찍어줌.
		}
	}



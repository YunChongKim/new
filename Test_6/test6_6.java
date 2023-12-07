package Test_6;

import java.util.Random;
import java.util.Scanner;

class ShellSort{
	
	static void shellSort(int[]a, int n ) {
		int count =0;
		for(int h = n/2; h>0; h/=2)
			for(int i = h; i <n; i++) {
				int j;
				int tmp = a[i];
				for(j = i-h; j>=0 && a[j] >tmp; j-=h)
					a[j+h] = a[j];
				a[j+h] =tmp;
			}
	}
}




public class test6_6 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
			
		System.out.println("셸 정렬(버전1)");
		System.out.println("요솟수:");
		int nx = stdIn.nextInt();
		int[]x = new int[nx];
		Random rnd = new Random();
		for (int i =0; i <nx; i++) {
			x[i] = rnd.nextInt(200);
		}
		
		System.out.println("정렬 전:");
		for (int i =0; i <nx; i++) 
			System.out.println(""+x[i]);
		shellSort(x,nx);
		
		
		System.out.println("오름차순으로 정렬했습니다.");
		for(int i =0; i<nx; i++)
			System.out.println(i+x[i]);
	
	}

}

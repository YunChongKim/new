package Chap13;
import java.util.Random;
import java.util.Arrays;

public class 정수배열정렬 {

	public static void main(String[] args) {
		
		int [] data = new int[7];
//7개짜리 배열 선언 및 생성		
		Random rnd = new Random();
//rnd 랜덤 인스턴스 생성 및 호출
		for (int i = 0; i <data.length; i++)
//i=인덱스 i가 1씩 증가하면서 배열data의 길이만큼 돔			
			data[i] = rnd.nextInt(100);	
//배열 data의 값은 100까지 제한하여 값을 배열에 넣어라.		
		for (int i = 0; i <data.length; i++)
//for구문을 한 번 더 돌려서 배열을 출력해라 			
			System.out.print(data[i]+" ");
		System.out.println();
		
		Arrays.sort(data);	
		for (int i = 0; i <data.length; i++)
			System.out.print(data[i]+" ");
	}

}

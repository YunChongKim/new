package homework;
import java.util.Arrays;
import java.util.Random;




//void= 리턴값 없는거 =  set써야함? static = 정적

public class Array {
		public static void sortArray(int[] arr) {
			int up;
			for( int i = 0; i < 24; i++) {
				for (int j = i+1 ; j < 24; j++) {
					if(arr[i] > arr[j]) {
						up = arr[i];
					arr[i] = arr[j];
					arr[j] = up;
			
		}
				}
			}
		}
	
	public static void main(String[] args) {
		//•24개의 원소를 가지는 정수형 1차원 배열을 선언해서 랜덤으로 값을 입력
		// 데이터 생성
		Random rd = new Random();
		
		int[]array = new int[24];
		for(int i =0; i<24; i++) {
			array[i] = rd.nextInt(101);
		}
		System.out.println(Arrays.toString(array));

		//1.입력된 배열 출력 & 오름차순으로 정렬한 뒤 출력
		//배열 정렬 & 출력
		sortArray(array);
		System.out.println(Arrays.toString(array));
	
	
		//행렬생성
		Matrix mA = new Matrix(array, 0,3,4);
		mA.print();
		Matrix mB = new Matrix(array, 12,3,4);
		mB.print();
		
			//행렬합
		System.out.println("행렬 합을 출력합니다.");
		Matrix mC = Matrix.sum(mA, mB);
		if(mC != null) mC.print();
		
			//행렬곱
		System.out.println("행렬 곱을 출력합니다.");
		Matrix mF = Matrix.sum(mD, mE);
}
}
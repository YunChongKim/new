package Chap4배열;

public class Test40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]arr = new int[5][5];
		int num =1;
		// 배열의 값 설정
		for(int i = 0; i <arr.length; i++) {  //arr[i].length 열의 길이
			for(int j = 0; j <arr[i].length; j++) { 
				arr[i][j] = num++;
				// 배열에 설정된 값을 화면 출력
				
				
	}
		}
		
		for(int i = 0; i <arr.length; i++) {  //arr.length 행의 길이
			for(int j = 0; j <arr[i].length; j++) { //arr[i].length 열의 길이
				System.out.print(arr[i][j]);
				System.out.print("\t"); //tap 간격주는 기능
			}
			System.out.println("\n"); // 배열의 대각 합을 구해서 설정
		}
		int sum = 0;
		for(int i = 0 ; i <arr.length; i++) {
		for(int j = 0; j<=i;j++){
			sum =sum + arr [i][j];
		}
	}
		System.out.println("합계 :" +sum);
}
}
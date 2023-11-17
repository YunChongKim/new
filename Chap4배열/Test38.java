package Chap4배열;

public class Test38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]arr = new int[5][5];
		int num =1;
		for(int i = 0; i <arr.length; i++) {  //arr.length 행의 길이
			for(int j = 0; j <arr[i].length; j++) { //arr[i].length 열의 길이
				arr[i][j] = num++; // 이거 지우고 sysout (num++)or (arr[i][j]해줘도 들어감. 밑에 하지않고 
				
			}
		}
		
		for(int i = 0; i <arr.length; i++) {
			for(int j = 0; j <arr[i].length; j++) { 
				System.out.print(arr[i][j]); 
				System.out.print("\t"); //tap 간격주는 기능
			}
			System.out.println("\n"); // 
		}

	}

}

package homework;

public class Matrix {

	// 배열을 3by4 A1행렬과 3by4 B1행렬로 만들어서 행렬 합을 구한 뒤 출력
	int[][]max;
	
	public Matrix(int[] arr,int a, int b,int c) {	
		
	max = new int[b][c];


	for(int i = 0; i < max.length; i++) {
		for(int j = 0; j < max[i].length; j++) {
			max[i][j] = arr[a++];
		}
	}
	}
	public void print() {
		for(int i = 0; i < max.length; i++) {
			for(int j = 0; j < max[i].length; j++) {
		
				System.out.print(max[i][j]);
				System.out.print("\t");	
		}
			System.out.print("\n");
		}
			System.out.println("=============================");
			}
			}
		
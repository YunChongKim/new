package Test_6;

public class test6_4 {

	public static void main(String[] args) {

	static void slectionSort(int[]a , int n) {
		for (int i =0; i <n-1; i++) {
			int min = i;
			for(int j = i+1; j<n; j++)
				if(a[j] < a[min])
					min = j;
			swap(a,i,min);
		}
	}
	
	}	
		
	}

}

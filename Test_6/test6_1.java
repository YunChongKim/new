package Test_6;

class BubbleSort{
	static void swap(int[] a, int idx1, int idx2) {
	//indx1과 index2의 값을 교환하는 과정(배열의 인덱스를 말함)
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void bubbleSort(int[] a, int n) {
		for(int i = 0; i <n-1; i++)
			for(int j = n-1;j>i; j--)
				if(a[j-1] > a[j])
					swap(a,j-1,j);
	}
	
}


public class test6_1 {

	public static void main(String[] args) {

		
		
		
		
	}

}

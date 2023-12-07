package Test_6;

public class test6_3 {
	
	static void bubbleSort(int[]a, int n) {
	int count = 0;
	int k = 0;
	while(k< n-1) {
		int last = n-1;
		for(int j = n-1; j>k; j-- ) {
			count++;
			if(a[j-1]>a[j]) {
				swap(a,j-1,j);
				last = j++;
			}
		}
		k = last;
	}

}

	public static void main(String[] args) {

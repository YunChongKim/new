package chap_2장기본자료구조;

public class 문자열배열 {
	public static void main(String[] args) {
		String []data = {"apple","grape","persimmon", "pear","blueberry", "strawberry", "melon", "oriental melon"};

		showData(data);
		sortData(data);
		showData(data);
	}
	private void sysout() {

	}
	static void showData(String[]arr) {
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr);
		}
	}
	static void swap(String[]arr, int ind1, int ind2) {
		String temp = arr[ind1];
		arr[ind1] = arr[ind2];
		arr[ind2] = temp;
			}

	}
	static void sortData(String []arr) {


}
}

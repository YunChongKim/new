package chap_검색알고리즘;

import java.util.Arrays;

//5번 실습 - 2장 실습 2-14를 수정하여 객체 배열의 정렬 구현
class PhyscData implements Comparable<PhyscData> {
	String name;
	int height;
	double vision;

	public PhyscData(String name, int height, double vision) {
		this.name = name;
		this.height = height;
		this.vision = vision;
	}

	@Override
	public String toString() {
		return "[" + name + "," + height + "," + vision + "]";
	}

	@Override
	public int compareTo(PhyscData o) {
		int fe = this.name.compareTo(o.name);
		if (fe == 0) {
			int fe1 = this.height - o.height;
			if (fe1 == 0) {
				double v = this.vision - o.vision;
				if (v == 0.0) {
					return 0;
				} else if (v > 0.0)
					return 1;
				} else	
					return -1;
		}
		return -1;

	}

}
public class Test_실습3_6_1객체배열이진탐색 {

	public static void main(String[] args) {
		PhyscData[] data = { new PhyscData("홍길동", 162, 0.3), 
							new PhyscData("홍동", 164, 1.3),
							new PhyscData("홍길", 152, 0.7), 
							new PhyscData("김홍길동", 172, 0.3), 
							new PhyscData("길동", 182, 0.6),
							new PhyscData("길동", 167, 0.2), 
							new PhyscData("길동", 167, 0.5), };
		showData(data);
		sortData(data);
		System.out.println("정렬후::");
		showData(data);
		
		PhyscData key = new PhyscData("길동", 167, 0.2);
		int result = linearSearch(data, key);
		System.out.println("\nlinearSearch(): result = " + result);
		
		
		
//		key = new PhyscData("길동", 167, 0.5);
//		result = binarySearch(data, key);
//		
//		System.out.println("\nbinarySearch(): result = " + result);
//		int idx = Arrays.binarySearch(data, key);
//		System.out.println("\nArrays.binarySearch(): result = " + result);
	}

	static void showData(PhyscData[] arr) {
		System.out.println();
		for (PhyscData fruit : arr) {
			System.out.print(fruit + " ");
		}
		System.out.println();
	}

	static void sortData(PhyscData[] arr) {
		for (int i = 0; i < arr.length; i++)
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].compareTo(arr[j]) > 0) {
					PhyscData temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}

			}
	}

	static int linearSearch(PhyscData[] data, PhyscData key) {
		for (int i = 0; i < data.length; i++)
			if (data[i].name == key.name) {
				if (data[i].height == key.height) {
					if (data[i].vision == key.vision)
						return i;
				}

			}
		return -1;
	}
	
}

	



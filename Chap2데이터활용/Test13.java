package Chap2데이터활용;

public class Test13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a = 0b0001001;
		byte b = 0b00100010;
		System.out.println(a);
		int c = a & b;
		System.out.println(Integer.toBinaryString(c));
		int d = a | b;
		System.out.println(Integer.toBinaryString(d));
		int e = a ^ b;
		System.out.println(Integer.toBinaryString(e));
		int f = 12;
		int g = ~f + 1;
		System.out.println("g=" + g);
		int h = <<1; //왼쪽으로 1비트 이동 = 숫자가 2배됨 
	}

}

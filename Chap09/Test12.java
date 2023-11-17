package Chap09;

public class Test12 {

	public static void main(String[] args) {

		int n1 = 10;
		Integer obj1 = n1;  //n1을 obj1으로 박싱

		Integer obj2 = Integer.valueOf("20");
		int n2 = obj2; //한쪽은 객체, 한쪽은 정수 n2를 obj2로 (오토)박싱
		
		
		int i3 = Integer.parseInt("123");// 문자열을 정수로 변환시켜줌
		
		Integer obj3=30;
		
		int n3 = obj3 + 40;
		
		System.out.println(n1 + " : " + obj1);
		System.out.println(obj2 + " : " + n2);
		System.out.println(n3);
		
		String s1 = "9";
		int ns1 = Integer.parseInt(s1);
		int ns2 = Integer.parseInt(s2);
		
		String s2 = "21";
		if (s1.compareTo(s2)<0)
			System.out.println("9 < 21");
		else
			System.out.println("21 < 9");
		
	
	}

}

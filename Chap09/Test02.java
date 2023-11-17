package Chap09;

public class Test02 {

	public static void main(String[] args) {
		String s1 = new String("Java");
		String s2 = "Java";
		
		String s3 = new String("Java");
		String s4 = "Java";
		
		if(s1 == s3) {
			System.out.println("동일한 객체이다.");
		}else
			System.out.println("다른 객체이다.       ");
		
	}

}

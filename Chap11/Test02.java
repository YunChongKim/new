package Chap11;

public class Test02 {

	public static void main(String[] args) {
		try {
			System.out.println("1");
			String s = null;
			s.length();
			System.out.println("2"); //오류 뒤에 있는 메소드는 실행하지 않고 무시됨.  
			System.out.println("3");
		}
		catch (Exception e) {
			System.out.println("오류 발생"); // 오류가 발생안해서 "오류발생"이 출력되지않음.
		}finally {
			System.out.println("OK");
		}
			System.out.println("4");
	}
   
}

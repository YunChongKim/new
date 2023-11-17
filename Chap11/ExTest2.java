package Chap11;

public class ExTest2 {

	public void c() throws Exception {
		System.out.println("C1");
		int v = 10 / 0 ;
		System.out.println("C2");
	}
	
	public void b() throws Exception {
		System.out.println("B1");
		c();
		System.out.println("B2");
	}
	public void a() {
		System.out.println("A1");
		try {
			b();
		} catch (Exception e) {
			System.out.println("오류발생 : " + e.getMessage());
		}
		System.out.println("A2");
	}

	public static void main(String[] args) throws InterruptedException {
		
		ExTest2 et = new ExTest2();
	}
}

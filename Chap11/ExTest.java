package Chap11;

public class ExTest {

	public void c() throws Exception {	
		System.out.println("C1");	//7. C1 출력
		int v = 10 / 0 ;			//8. 오류 발생 -> try catch로 이동
		System.out.println("C2");
	}
	
	public void b() throws Exception {
		System.out.println("B1");	//5. B1 출력	
		c();						//6. c 호출
		System.out.println("B2");
	}
	public void a() {
		System.out.println("A1");	//3. A1 출력
		try {
			b();					//4. b 호출
		} catch (Exception e) {		// * exception e 는 발생하는 모든 예외오류 다 포함可
			System.out.println("오류발생 : " + e.getMessage());	//9. 오류발생 메세지 출력
		}
		System.out.println("A2");	//10. A2 출력
	}

	public static void main(String[] args) throws InterruptedException {
		
		ExTest et = new ExTest(); 	//1. ExTest 참조변수 생성
		et.a();					 	//2. et로 a 호출	
		
		Thread.sleep(3000);			//11. 10까지 다 실행하고 3초 후에 
		
		System.out.println("Fine"); //12. Fine 출력 
		 
	}
}

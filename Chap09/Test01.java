package Chap09;

public class Test01 {

	public static void main(String[] args) {
		
		String s = new String("Kim");
		String s1 = new String("hong");

		
		// hip에 Object클래스를 참조하는 Object라는 이름의 인스턴스를 생성해라. 
		//생성된 인스턴스를 참조하는 변수 명은 obj'n'으로 해라.
		Object obj1 = new Object();
		Object obj2 = new Object();
		Object obj3 = new Object();
		MyObject obj4 = new MyObject();
			
		//obj'n'의 hascode를 출력해라.
		System.out.println(obj1.hashCode());
		System.out.println(Integer.toHexString(obj1.hashCode()));
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());
		System.out.println(obj1.getClass());
		System.out.println(obj2.getClass());
		System.out.println(obj1.toString());//클래스이름 좌표 출력
		//println함수는 string으로 반환해줘야하는데 toString을 붙여서 string으로 바꿔줌.
		System.out.println(obj1);//클래스이름 좌표 출력
		System.out.println(obj4.toString());
		
		if(obj1.equals(obj2))
			System.out.println("같다");
		else
			System.out.println("다르다");
	
		if(obj1 == obj2)
			System.out.println("같다");
	}

}

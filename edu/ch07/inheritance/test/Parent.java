package edu.ch07.inheritance.test;

public class Parent {
	private String name; //필드생성
	
	public Parent() {
		name = "홍길동";	//name에 '홍길동'이라는 값 부여
		System.out.println("Parent()");
	}
	public Parent(String name) {	// new연선자를 사용하지않고 인스턴스를 생성
		this.name = name;
		System.out.println("Parent(String name)");

}
	public String getName() {	//getName을 호출하면 메인의 name을 반환. name = 홍길동
		return name;
	}
}
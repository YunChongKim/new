package edu.ch07.inheritance;

public class Person {

	private String name;
	private int age;
	
	public String getName() { //여기에 getName을 생성한 이유는 '오직' 다른 클래스에서 가져오기 가져오기 위함. 여기서는 쓸모없음.
		return name;
		
	}
	
	public void setName(String name) {	//자식클래스에서 입력한 네임을 넣어라
		this.name = name; 				// 이 자식클래스에서 넣은 네임을 this.name에 넣어라. 
	}
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
		
	}
	public String toString() {
		return name + " : " + age;
	}
	}


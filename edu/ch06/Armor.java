package edu.ch06;

public class Armor {
	public String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name; //this = 이 클래스 자기자신 .붙는건 필드 or 매서드 = 이 필드의 name을 말하는 것. 
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	private int height;
}





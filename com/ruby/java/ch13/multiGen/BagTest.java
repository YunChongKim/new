package com.ruby.java.ch13.multiGen;


class Bag<T,N> {
	//thing과 name 객체 타입 아직 정하지 못해 T,N으로 일단 선언함
	private T thing; 
	private N name;
	//생성자 선언 
	public Bag(T thing,N name) {
		this.thing = thing;
		this.name = name;
	}
	//private필드에 대한 게터 & 세터 사용
	public T getThing() {
		return thing;
	}
	
	public void setThing(T thing) {
		this.thing = thing;
	}
	public N getName() {
		return name;
	}
	
	public void setname(N name) {
		this.name = name;
	}


	void showType() {
		System.out.println("T의 타입은 " + thing.getClass().getName()); //클래스이름과 
		System.out.println("N의 타입은 " + name.getClass().getName());
	}
	}
class Book{
	public String toString() {
		return "책";
		}
	}
	
class PencilCase{}
class Notebook{}
	

public class BagTest { // 여러개의 class가 있을 경우 파일명과 같은 클래스만 public 사용 가능
	public static void main(String[] args) {
		
		Bag<Book,String>bag = new Bag<Book,String>(new Book(),"과학"); //Bag클래스의 인스턴스를 생성.참조변수 이름은 bag 타입은 Book,String사용 매
////		Bag bag = new Bag(new Book()); 							 // 매개변수는 new Book(),"과학" 2개 	
////		Bag bag2 = new Bag(new PencilCase());
////		Bag bag3 = new Bag(new Notebook());
////		
		bag.showType();
	
		Book book = bag.getThing();
		String name = bag.getName();
		
		System.out.println("This is" + book);
		System.out.println("This is" + name);
	}

}

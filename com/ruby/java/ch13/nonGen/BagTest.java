package com.ruby.java.ch13.nonGen;


class Bag {
	private Object thing;	// 어떤 타입을 사용할지 몰라서 일단 Object로 지정해놓음. 
	
	public Bag(Object thing) {
		this.thing = thing;
	}
	
	public Object getThing() {
		return thing;
	}
	
	public void setThing(Object thing) {
		this.thing = thing;
	}


	void showType() {
		System.out.println("Tmld xkdlqdms " + thing.getClass().getName());
	}
	}
	class Book{}
	class PencilCase{}
	class Notebook{}
	

public class BagTest {
	public static void main(String[] args) {
		Bag bag = new Bag(new Book()); // object thing = new Book()
		Bag bag2 = new Bag(new PencilCase());
		Bag bag3 = new Bag(new Notebook());
		
		Book book = (Book) bag.getThing();
		PencilCase pc = (PencilCase) bag2.getThing();
		Notebook nb = (Notebook) bag3.getThing();
		
		bag.showType();
		bag2.showType();
		bag3.showType();
		
		bag = bag2;
		
	}

}

package com.ruby.java.ch13.nonGen;


class Bag<T,N> {
	private T thing;
	private N name;
	
	public Bag(T thing,N name) {
		this.thing = thing;
		this.name = name;
	}
	
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
		System.out.println("T의 타입은 " + thing.getClass().getName());
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
	

public class BagTest2 {
	public static void main(String[] args) {
		
		Bag<Book,String>bag = new Bag<Book,String>(new Book(),"과학");
//		Bag bag = new Bag(new Book()); // object thing = new Book()
//		Bag bag2 = new Bag(new PencilCase());
//		Bag bag3 = new Bag(new Notebook());
//		
		bag.showType();
	
		Book book = bag.getThing();
		String name = bag.getName();
		
		System.out.println("This is" + book);
		System.out.println("This is" + name);
	}

}

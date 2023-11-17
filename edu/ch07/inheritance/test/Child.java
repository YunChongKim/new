package edu.ch07.inheritance.test;

public class Child extends Parent {
	public Child() {
		System.out.println("Child()");
	}
	public Child(String name) {
		super(name);
		System.out.println("Child(String name)");
	}
	
	public String toString() {
	return getName();
}

}
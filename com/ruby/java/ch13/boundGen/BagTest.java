package com.ruby.java.ch13.boundGen;


class Bag<T extends Solid>{
	private T thing;
	private String owner;
	
	
	public Bag(T thing) {
		this.thing = thing;
	}
	
	public T getThing() {
		return thing;
	}
	
	public void setThing(T thing) {
		this.thing = thing;
	}
	
	void showType() {
		System.out.println("T의 타입은" + thing.getClass().getName());
	}
		public String getOwner() {
		return owner;
	}
		public void setOwner(String owner) {
			this.owner = owner;
		}
		boolean isSameOwner(Bag<?> obj) {
			if(this.owner.equals(obj.getOwner()))
				return true;
			return false;
		}
}


public class BagTest {

	public static void main(String[] args) {
		Bag<Book>bag = new Bag<Book>(new Book());
		Bag<PencilCase>bag2 = new Bag<>(new PencilCase());

		
		boolean result = bag.isSameOwner(bag2);
		if(result) System.out.println("소유자가 동일합니다.");
		else System.out.println("소유자가 다릅니다.");

		
		boolean.isSameOwner(Bag<?> obj);
	}

}

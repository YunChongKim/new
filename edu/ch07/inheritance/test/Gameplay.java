package edu.ch07.inheritance.test;

public class Gameplay {
	public static void main(String[] args) {
	Marine m = new Marine();
	Tank t = new Tank();
	 
	 m.attack();
	 
	 t.attack();
	 
	 m.attack(t);
}
}
 
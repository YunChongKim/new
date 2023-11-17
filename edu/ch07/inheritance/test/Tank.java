package edu.ch07.inheritance.test;

public class Tank extends Unit {

	public Tank() {
		super(50L);
	}
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		super.attack();
	System.out.println("포를 쏩니다.");
	}
	public void attacked(Marine marine) {
		super.setHealth(super.getHealth() - 30L);
	}
}

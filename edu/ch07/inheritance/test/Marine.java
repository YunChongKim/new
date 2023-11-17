package edu.ch07.inheritance.test;

public class Marine extends Unit {

		public Marine() {
			super(100L);
		}
	@Override
	public void attack() {
		// TODO  Auto-generated method stub
		super.attack();
		System.out.println("포를 쏩니다.");
	}
	public void attack(Tank t) {
		t.attacked(this);
	}
}

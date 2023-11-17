package edu.ch07.inheritance.test;

public class Unit {
	
	private String attack;
	private Long health;
	
	public Unit(Long health) {
	this.health = health;
	}
	
	public String getAttack() {
		return attack;
	}
	public void setAttack(String attack) {
		this.attack = attack;
	}
	public Long getHealth() {
		return health;
	}
	public void setHealth(Long health) {
		this.health = health;
		System.out.println("Health:" + health);
		if(health < 0L) {
			System.out.println("사망하셨습니다.");
		}
	}
	public void attack(){
		System.out.println("공격합니다.");
	}

	
}

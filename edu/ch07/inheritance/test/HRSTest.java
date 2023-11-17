package edu.ch07.inheritance.test;

abstract class Employee{
	String name;	//필드선언
	int salary;
	
	public abstract void calcSalary(); //추상매서드(abstract)
	public abstract void calcBonus();  //추상매서드(abstract) > 자식들에게 매서드구현 강제.	
}
class Salesman extends Employee {	   // Employee를 상속받는 Salesman클래스	
	public void calcSalary() {		   //부모클래스의 추상매서드 구현 
		System.out.println("Salesman 급여 = 기본급 + 판매 수당");
	}
	public void calcBonus() {		   //부모클래스의 추상매서드 구현
		System.out.println("Salesman 보너스 = 기본급 * 12 * 4");
	}
}
class Consultant extends Employee {
	public void calcSalary() {
		System.out.println("Consultant 급여 = 기본급 + 컨설팅 특별 수당");
	}
	public void calcBonus() {
		System.out.println("Consultant 보너스 = 기본급 * 12 * 2");
	}
}
abstract class Manager extends Employee {	//부모의 추상매서드 구현안해서 본인도 추상클래스됨.
	public void calcSalary() {
		System.out.println("Manager 급여 = 기본급 + 팀 성과 수당");
	}
}

class Director extends Manager{
	public void calcBonus() {	//caclcSalary는 이미 Manager가 '구현'해놔서 여기서는 Bnous만 구현하면 됨.
		System.out.println("Director 보너스 = 기본급 * 12 *6");
	}
}

public class HRSTest {
	public static void main(String[] args) {
		Salesman s = new Salesman();
		Consultant c = new Consultant();
		Director d = new Director();
		
		s.calcBonus();
		c.calcBonus();
		d.calcBonus();
	}

}

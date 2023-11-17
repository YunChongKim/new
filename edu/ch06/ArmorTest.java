package edu.ch06;
public class ArmorTest {

	public void doWork() {
	//Armor class를 참조하는 참조변수 suit1,2,3 생성
	Armor suit1 = new Armor();
	Armor suit2 = new Armor();
	Armor suit3 = new Armor();
	
	suit1.setName("mark6");
	suit1.setHeight(180);
	
	suit2.setName("mark16");
	suit2.setHeight(220);
	
	suit3.setName("mark38");
	suit3.setHeight(200);
	
	System.out.println(suit1.getName() + " : " + suit1.getHeight());
	System.out.println(suit2.getName() + " : " + suit2.getHeight());
	System.out.println(suit3.getName() + " : " + suit3.getHeight());
	}
	
	public static void main(String[] args) {	
	ArmorTest at = new ArmorTest();		//do work를 사용하기위해 자기자신을 객체로 만드는 class 생성
	at.doWork();						//doWork 인스턴스 불러옴
	Armor a = new Armor();
	
	}


}
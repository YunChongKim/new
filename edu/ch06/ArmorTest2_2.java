package edu.ch06;

public class ArmorTest2 {
     
	public static void main(String[] args) {
		Armor suit1 = new Armor();
		Armor suit2 = new Armor();
		Armor suit3 = new Armor();
		
		suit1.setName("mark1");
		suit2.setName("mark2");
		suit3.setName("mark3");
		suit1.setHeight(180);
		suit2.setHeight(181);
		suit3.setHeight(182);
		
		System.out.println(suit1.getName() + " : " + suit1.getHeight());
		System.out.println(suit2.getName() + " : " + suit2.getHeight());
		System.out.println(suit3.getName() + " : " + suit3.getHeight());
		

	}

}

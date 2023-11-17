package edu.ch06;

public class Member {

		private String name;
		private int age;
		private float hobby;
		
		public Member() {
			System.out.println("Member 생성자가 호출되었습니다.");
		}
		public Member(String name) {
			System.out.println("Member 생성자1이 호출되었습니다.");
		}
		public Member(float hobby) {		// string name과 string hobby를 구별 못하므로 타입이 서로 달라야함. 
			System.out.println("Member 생성자1이 호출되었습니다.");
		}
		public Member(int age) {
			System.out.println("Member 생성자2가 호출되었습니다.");
		}
			public Member(String name, int age) {
				System.out.println("Member 생성자3이 호출되었습니다.");
			}
			public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		
		public static void main(String[] args) {
			Member m = new Member(); //public Member()와 같은 Member임 //기본생성자
			Member m1 = new Member("흥"); //public Member()와 같은 Member임
			Member m2 = new Member("20"); //public Member()와 같은 Member임
			Member m3 = new Member("Lee"); //public Member()와 같은 Member임
		}	

	}



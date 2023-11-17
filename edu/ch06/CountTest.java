package edu.ch06;

class Count {
	public static int totalCount; //코드영역에 할당되고 자동 0으로 초기화. totalCount를 참조한다는 의미.
				  int count;
	}
	public class CountTest {

	public static void main(String[] args) {
		Count c1 = new Count(); //Count 클래스를 참조하는 c1클래스 생성해서 heap에 저장
		Count c2 = new Count();
		Count c3 = new Count();
	
		c1.count++;  		 //Count클래스의 totalCount를 찾아서 1씩 증가시켜라
		Count.totalCount++; //totalCount클래스의 totalCount를 찾아서 1씩 증가시켜라
		c2.count++;
		Count.totalCount++;
		c3.count++;
		Count.totalCount++;
		
		System.out.println(Count.totalCount + " : " + c1.count);
		System.out.println(Count.totalCount + " : " + c2.count);
		System.out.println(Count.totalCount + " : " + c3.count);
	}

}
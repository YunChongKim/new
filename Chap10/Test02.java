package Chap10;

import java.util.ArrayList;
import java.util.Iterator;

public class Test02 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		list.add("서울");
		list.add("북경");
		list.add("상해");
		list.add("서울");
		list.add("도쿄");
		list.add("뉴욕");
		
		for(int i =0; i<list.size(); i++) {
			System.out.println(list.get(i)); //인덱스로 접근
		}
		
		System.out.println("===============");
		
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) { //다음 데이터가 있으면 true, 없으면 반환
			System.out.println(iter.next()); //다음 데이터를 반환하고 다음 데이터로 이동
		}
	
	}

}

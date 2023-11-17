       package Chap10;

import java.util.HashMap;

public class Test06 {

	public static void main(String[] args) {

		String word[] = {"BUMBLEBEE", "HEAVEN", "ALTHOUGH", "WONDER"};
		String meaning[] = {"꿀벌과에 속하는 호박벌 ", "천국", "그럼에도 불구하고", "호기심이 들다"};
		
		HashMap<String, String> dic = new HashMap<String, String>(); //dic이라는 참조변수를 가지는 HashMap생성
		for (int i = 0; i<word.length; i++) { //for문을 이용하여 0~4회돌림.
			dic.put(word[i], meaning[i] ); //dic.put을 이용하여 key에 world로 넣고 value에 meaning을 넣음.
			
		}
		
		System.out.println(dic); 
		System.out.println(dic.size()); //4
		
		
		System.out.println(dic.keySet());  //.keySet은 key만 뽑아내줌.
//		---------------------------------------
//		System.out.println("-".repeat(30));
//		Set<String>keys = dic.keySet();
//		for(String key : keys) {
//			System.out.println("\t" + key + ":" + dic.get(key));
//		}
//		System.out.println("-".repeat(30));
//	
//		----------------------------------------		
		
		System.out.println(dic.values());
		
		System.out.println("HEAVEN : " +dic.get("HEAVEN"));
		dic.replace("HEAVEN", "아주행복한 감정");
		System.out.println("HEAVEN : " +dic.get("HEAVEN"));
		dic.put("HEAVEN", "이상적인 세상");
		System.out.println("HEAVEN : " +dic.get("HEAVEN"));
		
		System.out.println(dic. containsKey("BUMBLEBEE"));
		System.out.println(dic. containsValue("자장가"));
		
		dic.remove("HAVEN");
		System.out.println(dic. containsValue("HAVEN"));
		
		dic.clear();
		System.out.println(dic.isEmpty());
		System.out.println(dic.size());
		}

}

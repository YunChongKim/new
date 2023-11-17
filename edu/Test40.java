package edu;

public class Test40 {

	
			private static int min(int ...a) { // return 없음 오류 발생. 0은 의미없이 넣는 값
		//최소값을 저장한 변수 선언 / ... 은 무한히 늘어남. 
		int res = a[0];
				
		//a의 길이만큼 반복한다.
		for(int i =0; i <a.length; i++) {
		
			if(res > a[i]) res = a[i];
		}

		return res;
		}
		private static int max(int ...a) {
		int res = a[0];
		for(int i =0; i <a.length; i++) {
		if(res < a[i]) res = a[i];
			}

			return res;
			}
		
		public static void main(String[] args) {
			
			System.out.println("min : " + min(1,2,3,4,5));
			System.out.println("max : " + max(2,4,6,8,10));

	}

}

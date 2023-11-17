package Chap3제어문;

public class Test25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int d = 5;
/*		for(int i = 0; i < 5; i++) {
			System.out.println("i = " + i + " a="+a);
			a +=d;
		}
	}

}*/
/*	int i=0;  //변수 초기화 > 위에 설정한 값이 아래에도 영향 줄 수 있으니까.
	while(i < 5) {
		System.out.println("i = " + i + " a="+a);
		a +=d;
		i++;
		}
		}*/
		
		int i = 0;
		do {
			System.out.println("i = " + i + " a="+a);
			a +=d;
			i++;
			}while(i < 5);
}
}
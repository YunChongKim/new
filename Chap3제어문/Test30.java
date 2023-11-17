package Chap3제어문;

public class Test30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 6;
		if (i%2 == 0) {
			if(i%3 == 0)
				System.out.println("6은 2,3의 배수이다.");
		}
		
		
		for( i = 0; i <10; i++)
			for (int j = 0; j<10; j++)
				System.out.println(i*j);
	}

}

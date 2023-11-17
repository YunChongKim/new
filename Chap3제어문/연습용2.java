package Chap3제어문;

public class 연습용2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		do {
			int j =1;
			do {
				if(k>5)
					continue;
			System.out.print(i+ "*"+j+"=+i*j+" ")
			j++;
			if(j>8)
				break;
			}while(j<10);
			System.out.println();
			i++;
		}while(i<10);
		
	}
}
package Chap3제어문;

public class 연습용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for(int i =1; i<10; i++)
		//for(int j=1; j<10; j++){
			//System.out.println(i +"*" + j + "=" + j*i);

	int i = 1; //i초기화
	int j = 1; //j초기화
	while(i<10) { 
	while(j<10){
		System.out.print(" "+j +"*" + i + "=" + i*j); //j*i=i*j출력하라
		
		j++; //i는 1로 고정되어있고 j는 1>9까지 증가한다.
		}System.out.println("\n"); //j가 9까지 다 돌고 간격을 넣어라
	j=1; // 안에서 돌고나오면 j가 9인상태라 1로 만들어줘야함.
	i++; // i가 1씩 증가한다.
	}

}
}
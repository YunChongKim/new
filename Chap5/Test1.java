package Chap5;

public class Test1 {

	public static int f(int x) { //6장에서 공부하니까 그냥 무조건 작성해야한다고만 생각
		int value;
		value = 2 * x * x + 4 * x + 5;
		return value;
	}
	public static void main(String[] args) {
		int y;
		y = f(2);
		System.out.println("y="+y);
		Armor arm = new Armor();
		arm.name = "홍길동";
		arm.weight =10;
		arm.color = "red";
		
	}
}     
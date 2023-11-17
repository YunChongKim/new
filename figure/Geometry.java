package figure;
public abstract class Geometry {
	
	private int[] xArr = new int[4];
	private int[] yArr = new int[4];

	void addPoint(int x, int y) {
		xArr[0] = x;
		yArr[0] = y;
		
	}
	
public abstract double getLength();
public abstract double getArea();

public void printPoint() {
	for (int i = 0; i < xArr.length; i++) {
		System.out.println(xArr[i] + "," + yArr[i] );
	}
}
	
	

}

package Chap12;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test01 {

	public static void main(String[] args) {
		//인스턴스 생성
		try (FileInputStream fi = new FileInputStream("a.txt"); 
				FileOutputStream fo = new FileOutputStream("b.txt");) {
		//c 변수 선언
			int c = 0;
		//c에 a.txt파일을 넣고 c가 -1이 아닌지 확인 
		//-1이라는건 포인터가 파일의 끝을 가리키고 있다는말이므로 문서 전체를 읽을 수 없음.	
			while ((c = fi.read()) != -1) {
		
				fo.write(c);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

package Chap14;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
/*
 * public interface Comparator<T>{

 *   public int compare(T 01, T 02);
 *    }
 *    
 * public interface Comparable<T> {
 *   public int compareTo(T o);
 *   }   
 */

class Student {
	String sno;
	String sname;

	public Student(String sno, String sname) {
		this.sno = sno;
		this.sname = sname;
	}

	public String toString() {
		return "[" + sno + ", " + sname + "]";
	}

}

public class test_객체배열정렬comparator {
	static void sortStudent(Student[] data, Comparator<Student> comp) {
		Student temp;
		for (int i = 0; i < data.length; i++)
			for (int j = i + 1; j < data.length; j++) {

			}
	}



	public static void main(String[] args) {
		Comparator<Student> compName = new Comparator<Student>(){
			@Override
			public int compare(Student s1, Student s2) {
				//sname을 사용한 비교
				return s1.sname.compare(Student s1, Student s2);
			}	
		};
		Comparator<Student> compNo = new Comparator<Student>(){
			@Override    
			public int compare(Student s1, Student s2) {
				//snum을 사용한 비교
				return Integer.compare(s1.sno)- Integer.compare(s2.sno);
			}	
		};
		
		Student [] data = {
				new Student("12", "홍길동"),
				new Student("121", "김길순"),
				new Student("213", "박길춘"),
				new Student("9", "이길홍")
		};
		System.out.println("Test");
		//sortStudent(data, compName);
		Arrays.sort(data, compName);//이게 문제가 있어서 sortStudent()를 구현
		//Collections.sort(data, comp);
		
//		Arrays.sort(data, new Comparator<Student>() {
//			@Override
//			public int compare(Student s1, Student s2) {
//				return Integer.parseInt(s1.sno) - Integer.parseInt(s2.sno);
//			}
//			});
//		 
		for (Student st: data)
			System.out.print(" " + st);
	}

}
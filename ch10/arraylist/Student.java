package ch10.arraylist;

public class Student extends Person {
	private String major;
	
	public Student(String naem, int age, String major) {
		super(name,age);
		this.major = major;
	}
	
	public String getMajor() {
		return major;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
	
	
}

package ch10.arraylist;

public class Employee extends Person{
	private String dept;

	public String getDept() {
		return dept;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
			
	}
	@Override
	public String toString() {
		//TODO Auto-generated method stub
		return super.toString() + " : " + dept + " 부서에서 근무중입니다. "; 

	} 
}

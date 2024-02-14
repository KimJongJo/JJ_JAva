package edu.kh.objarray.practice.model.vo;

public class Employee {

	private int eNum;	// 사번
	private String eName;	// 이름
	private String dept;	// 부서
	private String job; 	// 직급
	private int salary;	// 급여
	
	public Employee() {}

	public Employee(int eNum, String eName, String dept, String job, int salary) {
		this.eNum = eNum;
		this.eName = eName;
		this.dept = dept;
		this.job = job;
		this.salary = salary;
	}

	public int geteNum() {
		return eNum;
	}

	public void seteNum(int eNum) {
		this.eNum = eNum;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	
	
	
}

package com.javaex.ex04;

public class Employee extends User {
	
	protected int salary;
	
	public Employee() {
		
	}
	
	public Employee(int salary) {
		this.salary=salary;
	}
	
	public Employee(String id, String password, String name, int salary) {
		super(id, password, name);
		this.salary=salary;
	}
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.printf(", #월급: %d",salary);
	}
	
	

	
}

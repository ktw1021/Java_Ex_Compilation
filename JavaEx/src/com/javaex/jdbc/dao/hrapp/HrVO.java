package com.javaex.jdbc.dao.hrapp;

public class HrVO {

	
	private String full_name;
	private String email;
	private String hp;
	private String hire_date;
	private int salary;
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getFull_name() {
		return full_name;
	}
	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	public String getHire_date() {
		return hire_date;
	}
	public void setHire_date(String hire_date) {
		this.hire_date = hire_date;
	}
	
	public HrVO(String full_name, int salary) {
		this.full_name = full_name;
		this.salary = salary;
	}
	public HrVO(String full_name) {
		this.full_name = full_name;
	}
	public HrVO(String full_name, String email, String hp, String hire_date) {
		super();
		this.full_name = full_name;
		this.email = email;
		this.hp = hp;
		this.hire_date = hire_date;
	}
	
}

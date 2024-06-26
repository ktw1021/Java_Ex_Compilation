package com.javaex.ex07;

public class Friends {

	private String name;
	private String pn;
	private String sch;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPn() {
		return pn;
	}
	public void setPn(String pn) {
		this.pn = pn;
	}
	public String getSch() {
		return sch;
	}
	public void setSch(String sch) {
		this.sch = sch;
	}
	
	public void friendsInfo (String name, String pn, String sch) {
		System.out.printf("이름:%s  핸드폰:%s  학교:%s%n",name,pn,sch);
	}
	
}

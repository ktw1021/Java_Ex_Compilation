package com.javaex.ex08;

public class Bank {

	private int deposit;
	private int withdrawl;
	private int sum;
	
	public int getDeposit() {
		return deposit;
	}
	public void setDeposit(int deposit) {
		if (deposit>0) {
			this.deposit=deposit;
			sum+=deposit;
		}
		else {
			System.out.println("입력불가한 정보입니다.");
		}
	}
	public int getWithdrawl() {
		return withdrawl;
	}
	public void setWithdrawl(int withdrawl) {
		if ( (withdrawl>0) && (withdrawl<=sum) ) {
			this.withdrawl=withdrawl;
			sum-=withdrawl;
			}
			else {
			System.out.println("입력불가한 정보입니다.");
			}
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum=sum;
		
	}
	
	
}

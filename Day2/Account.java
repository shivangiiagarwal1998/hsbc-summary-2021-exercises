package com.day2;

public class Account {
	private int accno;
	private double balance;
	private String ifsc;
	
	Account(){
		
	}
	Account(int accno, double balance, String ifsc) {
		this.accno = accno;
		this.balance = balance;
		this.ifsc = ifsc;
	}

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	public void display() {
		System.out.println("Account [accno=" + accno + ", balance=" + balance + ", ifsc=" + ifsc + "]");
	}

}


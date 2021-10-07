package com.day2;

public class Savings extends Account {
	private double dailyLimit;

	Savings(int accno, double balance, String ifsc, double dailyLimit) {
		super(accno, balance, ifsc);
		this.dailyLimit = dailyLimit;
	}

	public double getDailyLimit() {
		return dailyLimit;
	}

	public void setDailyLimit(double dailyLimit) {
		this.dailyLimit = dailyLimit;
	}

	@Override
	public void display() {
		System.out.println("Savings [dailyLimit=" + dailyLimit + ", getAccno()=" + getAccno() + ", getBalance()=" + getBalance()
				+ ", getIfsc()=" + getIfsc());
	}

}

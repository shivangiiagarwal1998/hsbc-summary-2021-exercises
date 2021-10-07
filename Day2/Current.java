package com.day2;

public class Current extends Account {
	String nomineeName;

	Current(int accno, double balance, String ifsc, String nomineeName) {
		super(accno, balance, ifsc);
		this.nomineeName = nomineeName;
	}

	public String getNomineeName() {
		return nomineeName;
	}

	public void setNomineeName(String nomineeName) {
		this.nomineeName = nomineeName;
	}

	@Override
	public void display() {
		System.out.println("Current [nomineeName=" + nomineeName + ", getAccno()=" + getAccno() + ", getBalance()=" + getBalance()
				+ ", getIfsc()=" + getIfsc());
	}
}

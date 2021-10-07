package com.day2;

public class MainApp {
	
	public static void main(String[] args) {
		Account a1 = new Current(1001, 2000, "Bl403", "Anu");
		Account a2= new Savings(2031,50000,"A24C9",5000);
		tDisplay(Account);
		public static void tDisplay (Account Account) {
			
			Current c= (Current)Account;
			c.display();
			Savings s= (Savings)Account;
			s.display();
		}
	}

}

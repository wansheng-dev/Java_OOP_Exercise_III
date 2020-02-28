package com.ch2.as5bankaccount;

public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount one = new BankAccount();
		BankAccount two = new BankAccount();

		
		one.deposit(100.0, "checking");
		two.deposit(200.0, "savings");
		
		one.withdraw(200.0, "checking");
		two.withdraw(50.0, "savings");

		
		System.out.println(BankAccount.accounts());
		System.out.println(BankAccount.total());
		System.out.println(one.getAccountNumber());
		System.out.println(one.getCheckingBalance());
		System.out.println(two.getSavingsBalance());

	}

}

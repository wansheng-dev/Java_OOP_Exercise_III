package com.ch2.as5bankaccount;

import java.util.Random;

public class BankAccount {
	private String accountNumber;
	private double checkingBalance = 0.0;
	private double savingsBalance = 0.0;
	public static int numberOfAccounts = 0;
	public static double totalAmount = 0.0;
	
	public static int accounts() {
		return numberOfAccounts;
	};
	
	public static double total() {
		return totalAmount;
	}
	
	private String generateNumber() { 
	    Random rnd = new Random();
	    char [] digits = new char[10];
	    digits[0] = (char) (rnd.nextInt(9) + '1');
	    for(int i=1; i<digits.length; i++) {
	        digits[i] = (char) (rnd.nextInt(10) + '0');
	    }
	    return new String(digits);
	};
	
	public BankAccount() {
		this.accountNumber = generateNumber();
		numberOfAccounts ++;
	};
	
	public String getAccountNumber() {
		return this.accountNumber;
	};
	
	public double getCheckingBalance() {
		return this.checkingBalance;
	};
	
	public double getSavingsBalance() {
		return this.savingsBalance;
	};
	
	public void deposit(double amount, String account) {
		totalAmount += amount;
		if (account == "checking") {
			checkingBalance = getCheckingBalance() + amount;
		} else {
			savingsBalance = getSavingsBalance() + amount;
		}
	};
	
	public void withdraw (double amount, String account) {
		if (account == "checking") {
			if (getCheckingBalance() >= amount) {
				checkingBalance = getCheckingBalance() - amount;
				totalAmount -= amount;
			} else {
				System.out.println("Insufficient Fund.");
			}
		} else {
			if (getSavingsBalance() >= amount) {
				savingsBalance = getSavingsBalance() - amount;
				totalAmount -= amount;
			} else {
				System.out.println("Insufficient Fund.");
			}
		}
	};
	
	public double totalBalance () {
		return getCheckingBalance() + getSavingsBalance();
	};
	
}

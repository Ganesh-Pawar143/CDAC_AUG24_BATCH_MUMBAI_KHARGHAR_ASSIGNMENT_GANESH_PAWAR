package org.inheritance.bankQ1;


public class BankAccount {
	String accountNumber;
	double accountBalnce;
	
	
	public BankAccount(String accountNumber, double accountBalnce) {
		this.accountNumber = accountNumber;
		this.accountBalnce = accountBalnce;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public double getAccountBalnce() {
		return accountBalnce;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public void setAccountBalnce(double accountBalnce) {
		this.accountBalnce = accountBalnce;
	}
	
	
	public void deposite(double amount) {
		this.accountBalnce=accountBalnce+amount;
	
	}
	
	public void withdraw(double amount) {
		if (amount <= this.accountBalnce) {
			this.accountBalnce=accountBalnce-amount;
		}else {
			System.out.println("Insufficient Funds");
		}
	}
	

}

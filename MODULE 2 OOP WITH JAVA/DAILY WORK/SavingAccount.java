package org.inheritance.bankQ1;

public class SavingAccount extends BankAccount {
	private static final double min_balance =100.00;
	
	
	public SavingAccount(String accountNumber, double accountBalnce) {
		super(accountNumber, accountBalnce);
		
	}
	
	
	
	@Override
	public void withdraw(double amount) {
		if (accountBalnce-amount <min_balance) {
			System.out.println("Transaction Failed- Minimum Balance "+min_balance+" is Required" );
		}else {
			super.withdraw(amount);
		}
		
	}
	

}

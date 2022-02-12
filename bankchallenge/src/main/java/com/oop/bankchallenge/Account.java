package com.oop.bankchallenge;

/**
 * @author s4u1o
 *
 */
public abstract class Account implements IAccount {
	
	
	protected  static final int STANDARD_AGENCY = 1;
	protected  static int SEQUENTIAL = 1;
	
	protected int agency;
	protected int number;
	protected double balance;
	protected Client client;

	
	public Account(Client client) {
		this.agency = Account.STANDARD_AGENCY;
		this.number = SEQUENTIAL++;
		this.client = client;
		
	}

	
	@Override
	public void withdrawal(double value) {
		
		balance -= value;
		
	}

	@Override
	public void deposit(double value) {
		balance += value;
		
	}

	@Override
	public void transfer(double value, Account accountDestiny) {
		this.withdrawal(value);
		accountDestiny.deposit(value);
	}
	
	public int getAgency() {
		return agency;
	}

	public int getNumber() {
		return number;
	}

	public double getBalance() {
		return balance;
	}
	
	protected void extractedPrint() {
		System.out.println(String.format("Holder: %s", this.client.getName()));
		System.out.println(String.format("Agency: %d", this.agency));
		System.out.println(String.format("Number: %d", this.number));
		System.out.println(String.format("Balance: %.2f", this.balance));
	}


}
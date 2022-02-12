package com.oop.bankchallenge;

/**
 * @author s4u1o
 *
 */
public class Main {
	public static void main(String[] args) {
		
		Client saulo = new Client();
		saulo.setName("Saulo Filho");
		
		Account ca = new CheckingAccount(saulo);
		Account sa = new SavingsAccount(saulo);
		
		ca.deposit(300);
		ca.transfer(200, sa);
		
		
		ca.extractPrint();
		
		sa.extractPrint();
		
	}

}

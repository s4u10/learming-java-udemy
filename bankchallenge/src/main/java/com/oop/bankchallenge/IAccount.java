package com.oop.bankchallenge;

/**
 * @author s4u1o
 *
 */
public interface IAccount {

	void withdrawal(double value);
		
	void deposit(double value);
		
	void transfer(double value, Account accountDestiny);
	
	void extractPrint();

	
}
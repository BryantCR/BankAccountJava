package com.bankaccount.test;
import com.bankaccount.*;

public class BankAccountTest {

	public static void main(String[] args) {
		
		BankAccount Maria = new BankAccount();
		BankAccount Juan = new BankAccount();
		BankAccount Torres = new BankAccount();
		//BankAccount Maria = new BankAccount(50.000, "Saving");
		
		System.out.println("*============ Maria Deposit 25.436 to Saving ===============*");
		Maria.depositMoney(25.436, "Saving");
		Maria.accountBalance();
		System.out.println("*============ Torres Deposit 87.436 to Saving ===============*");
		Torres.depositMoney(87.436, "Saving");
		System.out.println("*============ Torres Deposit 186.525 to Checking ===============*");
		Torres.depositMoney(186.525, "Checking");
		System.out.println("*============ Torres Account Balance ===============*");
		Torres.accountBalance();
		System.out.println("*============ Maria Deposit 25.548 to Checking ===============*");
		Maria.depositMoney(25.548, "Checking");
		System.out.println("*============ Maria Account Balance ===============*");
		Maria.accountBalance();
		System.out.println("*============ Torres WithDraw 120.525 from Checking ===============*");
		Torres.withdrawMoney(120.525, "Checking");
		System.out.println("*============ Torres Account Balance ===============*");
		Torres.accountBalance();
		
		System.out.println(BankAccount.accountsNumber());
		System.out.println(BankAccount.amountMoney());
	}
	
}

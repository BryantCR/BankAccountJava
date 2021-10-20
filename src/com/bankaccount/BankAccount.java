package com.bankaccount;

public class BankAccount {
	// Attributes
	public double checkingBalance;
	public double savingsBalance;
	public String savorcheck;
	
	public static int numberOfAccounts = 0;
	public static double totalMoneyAmount = 0;
	
	// Constructor
    public BankAccount(){
        this.checkingBalance = 0;
        this.savingsBalance = 0;
    	numberOfAccounts++;
    }
    
    // Getters
	public double getCheckingBalance() {
		return this.checkingBalance;
	}

	public double getSavingsBalance() {
		return this.savingsBalance;
	}
	
	// Setters
	
	
	
	// Money
	
    public void depositMoney( double amount, String account ){
    	
    	if(account.equals("saving") || account.equals("Saving"))
			this.savingsBalance += amount;
    	
		else if(account.equals("checking") || account.equals("Checking"))
			this.checkingBalance += amount;
		else
			System.out.println("You must provide a correct Account: Saving or Checking");
    	
		BankAccount.totalMoneyAmount += amount;
		
    }
    

	public void withdrawMoney(double amount, String account) {
		
		boolean successful = false;
		if(account.equals("saving") || account.equals("Saving")) {
			
			if(this.savingsBalance - amount >= 0) {
				successful = true;
				this.savingsBalance -= amount;
			}
		}
		else if(account.equals("checking") || account.equals("Checking")) {
			
			if(this.checkingBalance - amount >= 0) {
				successful = true;
				this.checkingBalance -= amount;
			}
		}
		if(successful) {
			BankAccount.totalMoneyAmount -= amount;
		}
	}
	
	// Account Balance
	
    public void accountBalance() {
        System.out.println(String.format("Your account balance: "));
        System.out.println(String.format("Saving Balance: %s", this.savingsBalance));
        System.out.println(String.format("Checking Balance: %s", this.checkingBalance));
    }
	
    // Static Methods
    public static int accountsNumber() {
        return numberOfAccounts;
    }
    
    public static double amountMoney() {
        return totalMoneyAmount;
    }
    
}

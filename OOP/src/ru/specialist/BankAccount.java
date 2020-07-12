package ru.specialist;

public class BankAccount {
	
	private String owner;
	private double balance;
	
	public String getOwner() {
		return owner;
	}
	public double getBalance() {
		return balance;
	}
	
	public BankAccount(String owner) {
		this.owner = owner;
	}
	
	public void deposite(double summa) {
		if (summa < 0.0) throw new IllegalArgumentException("summa < 0");
		
		this.balance += summa;
	}
	
	public boolean withdraw(double summa) {
		if (summa < 0.0) throw new IllegalArgumentException("summa < 0");
		
		if (getBalance() >= summa) {
			this.balance -= summa;
			return true;
		}
		else
			return false;
	}
	
	@Override
	public String toString() {
		return String.format("%s : %.2f", getOwner(), getBalance() );
	}
	
	public static boolean transfer(BankAccount source, BankAccount dest, double summa) {
		if (source == dest) throw new IllegalArgumentException("source == dest");
		
		if (source.withdraw(summa)) {
			dest.deposite(summa);
			return true;
		}
		else
			return false;
	}
	
	
	
	
	
	

}

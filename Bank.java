package com.bank;

import java.util.Scanner;

public class Bank {

	private int balance;
	private int deposite;
	int depo;
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getDeposite() {
		return deposite;
	}
	public void setDeposite(int deposite) {
		this.deposite = deposite;
	}
	
	
	public void deposite()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter deposite balance");
		 deposite = sc.nextInt();
		 if(deposite<0)
		 {
			 throw new DepositeException("wrong input provide negative value");
		 }
		 else
		 {
			    Bank b = new Bank();
				b.setBalance(1000);
				 depo = b.getBalance() + b.getDeposite();
				System.out.println("Balance "+b.getBalance());
				System.out.println("Deposite "+depo);
				
		 }
		
	}
	public static void main(String[] args) {
		Bank b = new Bank();
		b.deposite();
		
	}
}

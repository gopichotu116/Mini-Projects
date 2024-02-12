package com.jsp.atmPack;

import java.util.Scanner;

public class Atm {
	private double balance;
	private static int pin = 1234;

	public Atm(double balance, int pin) {
		super();
		this.balance = balance;
		this.pin = pin;
	}

	public Atm(double balance2, Object setPin) {
		balance = balance2;
		pin = (int) setPin;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public void checkBalance() {
		System.out.println("The available balance is " + balance);
	}

	public void withdraw(int amount) {
		if (balance < amount) {
			System.out.println("Insufficient balance.Your balance amount is " + balance);
		} else {
			balance -= amount;
			System.out.println("Debited amount is " + amount + "\navailable balance is " + balance);
		}
	}

	public void diposite(int amount) {
		balance += amount;
		System.out.println("Deposited amount " + amount + "\navailabale balance " + balance);
	}

	public static void changePin(int p) {
		pin = p;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Atm atm = new Atm(10000.0, 1234);
		System.out.println("Welcome to the Union bank ATM");
		System.out.println("Enter your Atm pin");
		int pin = scn.nextInt();
		if (pin == Atm.pin) {
			System.out.println("Valid pin");
			while (true) {
				System.out.println("select your option" + "\n1.Check balance enquiry" + "\n2.Amount withdraw"
						+ "\n3.Amount Deposite" + "\n4.Change pin" + "\n5.Exit");
				int amount = 0;
				int choice = scn.nextInt();
				switch (choice) {
				case 1:
					atm.checkBalance();
					break;
				case 2:
					System.out.print("Enter amount:");
					amount = scn.nextInt();
					atm.withdraw(amount);
					break;
				case 3:
					System.out.print("Enter amount:");
					amount = scn.nextInt();
					atm.diposite(amount);
					break;
				case 4:
					for (;;) {
						System.out.println("Enter original pin");
						int oPin = scn.nextInt();
						if (oPin != Atm.pin) {
							System.out.println("Invalid pin!!!!!!!!!!!");
						} else {
							for (;;) {
								System.out.println("Enter new pin");
								int nPin = scn.nextInt();
								if (nPin == Atm.pin) {
									System.out.println("This is the privious pin enter different pin");
								} else {
									Atm.changePin(nPin);
									atm.pin = atm.getPin();
									System.out.println("your pin is changed succesfully");
									break;
								}
							}
							break;
						}
					}
					break;
				case 5:
					System.out.println("Thanks for using the ATM\nVisit again....!");
					return;
				default:
					System.out.println("Invalid choice..!");
					break;
				}
			}
		} else
			System.out.println("Incorrect pin please enter the correct pin");
	}
}

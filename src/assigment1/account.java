package assigment1;

import java.util.Scanner;

public class account {
private int ID;
private double balance;
public account(int balance) {
	this.balance=balance;
}
public void setDeposit(int value) {
	
	
	if(value <0) {
		System.out.println("error");
	}else {
		balance += value;
	}
}
public void setDebit(int value) {

	if(value > balance) {
		System.out.println("debt amount exceeded account balance");
		
	}
	

}
public void setID(int ID) {
	this.ID=ID;
}
public int getID() {
	return ID;
	
}
public void setBalance(double balance) {
	this.balance=balance;
}
public double getBalance() {
	return balance;
	
}
}

package practice;

import java.util.Scanner;

public class ATMProgram {

	public static void main(String[] args) {
		// withdraw the money, deposit the money, check the balance, and exit.
		
		
		int balance=1000,withdrawAmt,depositAmt;
		
		Scanner input = new Scanner(System.in);
		
		
		while(true){
			 System.out.println("Automated Teller Machine");  
	            System.out.println("Choose 1 for Withdraw");  
	            System.out.println("Choose 2 for Deposit");  
	            System.out.println("Choose 3 for Check Balance");  
	            System.out.println("Choose 4 for EXIT");  
	            System.out.print("Choose the operation you want to perform: ");  
			
		int choice=	input.nextInt();
		switch(choice) {
		
		case 1:
			System.out.print("enter the money you want to withdraw: ");
			withdrawAmt =input.nextInt();
		if(balance>=withdrawAmt) {
			balance= balance-withdrawAmt;
			System.out.println("Collect your cash "+withdrawAmt);
		}else {
			System.out.println("Insufficient balance");
		}
		System.out.println("");
		break;
		case 2:
			System.out.print("Enter the money you want to deposit: ");
			depositAmt =input.nextInt();
			
			balance=balance+depositAmt;
			
			System.out.println("Money successfully deposited :"+depositAmt+" Updated balance is: "+balance);
			System.out.println("");
			break;
		case 3:
			System.out.println("Check balance");
			System.out.println("Balance is "+balance);
			System.out.println("");
			break;
		case 4:
			System.out.println("Exit");
		System.exit(0);
		}
		}
	}

}

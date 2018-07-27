package PracticalWork;
import java.util.Scanner;

public class Exercise5_BankAccountSimulator {

	public static void main(String[] args) {
		double balance = 0; 
		
		do{	System.out.println("Welcome to the bank account simulator");
		System.out.println(" ");
	    System.out.println("To withdraw cash from your account. Please press 1");
		System.out.println("To deposit cash into your account. Please press 2");
		System.out.println("To check your accounts balance. Please press 3"); 
		System.out.println("To exit the system at any time. Please enter -1");
		Scanner input = new Scanner (System.in);
        int option = input.nextInt();
          
        if(option == 1){
        	System.out.println("Please enter the amount you wish to withdraw in £");
        	double withdraw = input.nextDouble();
        	if(balance > 0) {
        		if (balance >  withdraw) {
        			balance = balance - withdraw;
        			System.out.println("You have withdrawn from your account £: " + withdraw + " Your balance now is £: " + balance );
        			}
        		else {System.out.println("You don't have enough money in your account to withdraw that much money");}
        	} else{System.out.println("You don't currently have any money in your account to withdraw from");
        }
        	System.out.println(" ");
        }	
        
        if(option == 2){
        	System.out.println("Please enter the amount you wish to deposit in £");
        	double deposit = input.nextDouble();
        	balance = balance + deposit;
        	System.out.println("You have deposited in to your account £: " + deposit + " Your balance now is £:" + balance );
            System.out.println(" ");
        }
        
        if(option == 3){
        	System.out.println("Your current accounts balance is £: " + balance);
            System.out.println(" ");
        }
        
        if(option == -1) {
        	System.out.println("You are now exiting the system.");
        	System.exit(0);
        }
        
	}while(true);
	}
}



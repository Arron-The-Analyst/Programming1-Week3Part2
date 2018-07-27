package PracticalWork;
import java.util.Scanner;
public class Exercise6_StringExercises {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Welcome to our string manipulation program");
		System.out.println("Please enter your first word.");
		String a = input.nextLine();
		System.out.println("Please enter your second word.");
		String b = input.nextLine();
		System.out.println("Please enter your third word.");
		String c = input.nextLine();
				
		System.out.println(" ");
		System.out.println("The length of your first word " + a + " is: " + a.length());
		System.out.println("The length of your second word " + b + " is: " + b.length());
		System.out.println("The length of your third word " + c + " is: " + c.length());
				
	    System.out.println(" ");
		System.out.println("In asceding order. These words are:");
	    if(a.length() > b.length() && a.length() > c.length() && b.length()>c.length()) {System.out.println(a + " " + b + " "+ c);}
	    else if(a.length() > b.length() && a.length() > c.length() && c.length()>b.length()) {System.out.println(a + " " + c + " "+ b);}
	    else if(b.length() > a.length() && b.length() > c.length() && a.length() > c.length()) {System.out.println(b + " " + a + " "+ c);}
	    else if(b.length() > a.length() && b.length() > c.length() && c.length() > a.length()) {System.out.println(b + " " + c + " "+ a);}
	    else if(c.length() > a.length() && c.length() > b.length() && a.length()>b.length()) {System.out.println(c + " " + a + " "+ b);}
	    else {System.out.println(c + " " + b + " "+ a);}
	    
	    System.out.println(" ");
	    System.out.println("Printing your all you words in Uppercase, they look like:");
	    System.out.println(a.toUpperCase() + " " + b.toUpperCase() + " " + c.toUpperCase());
	}

}

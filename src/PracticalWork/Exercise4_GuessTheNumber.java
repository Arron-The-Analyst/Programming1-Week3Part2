package PracticalWork;
import java.util.Random;
import java.util.Scanner;
public class Exercise4_GuessTheNumber {

	public static void main(String[] args) {

do{	System.out.println("Welcome to the guess the number game!!");
	System.out.println("Please select the level of difficulty game you wish to play.");
	System.out.println(" ");
	System.out.println("Press 1 to select an Easy difficulty game.");
	System.out.println("Press 2 to select an Medium difficulty game.");
	System.out.println("Press 3 to select an Hard difficulty game.");
	System.out.println(" ");
	System.out.println("If you wish to exit the program at any time please enter -1.");
	Scanner input = new Scanner(System.in);
	
	if (input.hasNext("-1"))  {
		System.out.println( "You are now exiting the program, we hope you have enjoyed it :)");
		System.exit(0);}
	
	int difficulty = input.nextInt();
	
	if(difficulty == 1){
		System.out.println("You have selected an easy difficulty game.");
		System.out.println("Please enter your first guess.");
	    Random easy = new Random();
	    int easynumber = easy.nextInt(100);
	    
	    do{ 
	    	int guess= input.nextInt();
	    	if(guess == easynumber) { 
	    		System.out.println("Congratulations You guessed correctly!! Your number was:" + " " + easynumber);
	    		System.out.println(" ");
	    		break;}
	    	
	    	if (guess == -1)  {
	    		System.out.println( "You are now exiting the program, we hope you have enjoyed it :)");
	    		System.exit(0);}
	    	
	    	else if(guess > easynumber){
	    		System.out.println("Your guess is too high, next time guess lower!!");}
	    
	    	else {System.out.println("Your guess is too low, next time guess higher!!");}
	    
	    	System.out.println(" ");
	    	System.out.println("Please enter your next guess.");
	    } while(true);
	  }
	
		
	if(difficulty == 2){
		System.out.println("You have selected a medium difficulty game.");
		System.out.println("Please enter your first guess.");
		    Random medium = new Random();
			int mediumnumber = medium.nextInt(500);
			
			 do{ 
			    	int guess= input.nextInt();
			    	if(guess == mediumnumber) { 
			    		System.out.println("Congratulations You guessed correctly!! Your number was:" + " " + mediumnumber);
			    		System.out.println(" ");
			    		break;}
			    	
			    	if (guess == -1)  {
			    		System.out.println( "You are now exiting the program, we hope you have enjoyed it :)");
			    		System.exit(0);}
			    	
			    	else if(guess > mediumnumber){
			    		System.out.println("Your guess is too high, next time guess lower!!");}
			    
			    	else {System.out.println("Your guess is too low, next time guess higher!!");}
			    
			    	System.out.println(" ");
			    	System.out.println("Please enter your next guess.");
			    } while(true);
			 }
	
			
	
	if(difficulty == 3){
		System.out.println("You have selected a hard difficulty game.");
		System.out.println("Please enter your first guess.");
				Random hard = new Random();
				int hardnumber = hard.nextInt(1000);
				 
				do{ 
				    	int guess= input.nextInt();
				    	if(guess == hardnumber) { 
				    		System.out.println("Congratulations You guessed correctly!! Your number was:" + " " + hardnumber);
				    		System.out.println(" ");
				    		break;}
				    	
				    	if (guess == -1)  {
				    		System.out.println( "You are now exiting the program, we hope you have enjoyed it :)");
				    		System.exit(0);}
				    	
				    	else if(guess > hardnumber){
				    		System.out.println("Your guess is too high, next time guess lower!!");}
				    
				    	else {System.out.println("Your guess is too low, next time guess higher!!");}
				    
				    	System.out.println(" ");
				    	System.out.println("Please enter your next guess.");
				    } while(true);
				}
		}while(true);	
	}
}


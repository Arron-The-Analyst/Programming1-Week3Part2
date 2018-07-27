package PracticalWork;

public class Exercise2_CodeExpectations {

	public static void main(String[] args) {
		
//I would expect from this first block of code to output the list (6,5,4,3,2,1)	
		int n = 6;
		while (n>0) {
		System.out.println("The value is :" + n);
		n--; 
		}
System.out.println(" ");

//I would expect this block of code to output the list (0,1,2,3,4,5,6,7,8,9)
		int m = 0 ;
		while (m < 10){
		System.out.println ("The value is :" + m);
		m++;
		}
System.out.println(" ");

// I would expect this block of code to output nothing  
	int a = 10 ;
	while (--a > 0 )
	{
	System.out.println("The value is :" +a);
}
System.out.println(" ");

//I would expect this code to output nothing	
    int b = 5 ;
	while (b > 5){
	System.out.println("The value is :" +b);
		b--; 
	}
System.out.println(" ");

//I would expect this code to output the number 5	
	int c = 5 ;
	do{ System.out.println("The value is :" +c);
	c--;}
	while (c > 5);
		
//4 out of 5 predictions correct. 80% Prediction rate		
		
	}
}

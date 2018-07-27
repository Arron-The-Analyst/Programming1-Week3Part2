package PracticalWork;

public class Exercise1_PrintingForLoops {

	public static void main(String[] args) {
	
		for(int i =5; i<=25; i+=5) {
        System.out.println(i);
	}
		System.out.println(" ");
		
		for(int i =2; i<=9; i++) {
			if(i%2== 0) {System.out.println(i);}
			else {System.out.println(-i);}
		}
		System.out.println(" ");
		
		for(int i =10; i>=1; i--) {
		if(i%4!= 0) {System.out.println(i);}
		}

}
}

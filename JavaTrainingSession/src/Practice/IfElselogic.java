package Practice;

import java.util.Scanner;

public class IfElselogic {
	 int n;

	public static void main(String[] args) {
		boolean A = true;
	
		if (A){
		    System.out.println("B");
		} else{
		    System.out.println("C");
		    
		} 
		IfElselogic obj = new IfElselogic ();
		
		System.out.println("Please enter number");
		Scanner scan = new Scanner(System.in);
		obj.n = scan.nextInt();
		scan.close();
		obj.oddeven();
		
		
		

	}
	
	public void oddeven () {
		       // n is number, r is reminder
		
		
		if ( n % 2 != 0){            // % is operator to get reminder value
			System.out.println("Number is odd");
			
		} else{
			System.out.println("Number is even");
		}
	}

}

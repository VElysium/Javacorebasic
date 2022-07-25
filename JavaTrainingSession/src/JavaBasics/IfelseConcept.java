package JavaBasics;

public class IfelseConcept {

	public static void main(String[] args) {
		
		//comparison operator >,<,==, !=, >=, <= 
		
		int a = 40 ;
		int b = 20 ;
		
		if(b>a) {
			System.out.println("b is greater than a");
		}
		else {
			System.out.println("a is greater than b");
		}
		if (a==b) {
			System.out.println("a and b are equal");
		}
		else {
			System.out.println("a and b are not equal");
			
		}
		// comparing 3 variables.
		 int c = 10 ;
		 if (a>b & b>c) {
			 System.out.println("a is the greatest");
		 }
		 else if (a>c) {
			 System.out.println("b is the greatest");
		 }
		
		 else System.out.println("c is greatest");
				

	}

}

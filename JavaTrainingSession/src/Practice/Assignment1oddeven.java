package Practice;
import java.util.Scanner;

public class Assignment1oddeven {

	public static void main(String[] args) {
		// using teranary syntax
		// condition? True : false;
		System.out.println("Enter any Number");
		int n;
		Scanner sac = new Scanner(System.in);
		n= sac.nextInt();
		sac.close();
		String j;
		j = (n%2 == 0)? "Number is even" : "Number is odd" ;
		System.out.println(j);	
		}
		
		

	}



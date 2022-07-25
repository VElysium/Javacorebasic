package Practice;
import java.util.Scanner;

public class WeeklyCalender {

	public static void main(String[] args) {
		int day;
		System.out.println("Please enter number");
		Scanner scan = new Scanner(System.in);
		day = scan.nextInt();
		scan.close();
		
		switch (day) {
		  case 1:
		
				 
			 System.out.println("Monday");
		    break;
		  case 2:
		    System.out.println("Tuesday");
		    break;
		  case 3:
		    System.out.println("Wednesday");
		    break;
		  case 4:
		    System.out.println("Thursday");
		    break;
		  case 5:
		    System.out.println("Friday");
		    break;
		  case 6:
		    System.out.println("Saturday");
		    break;
		  case 7:
		    System.out.println("Sunday");
		    break;
		  
		}
		if (day>7) {
			System.out.println("out of range");
		}

	} 

}

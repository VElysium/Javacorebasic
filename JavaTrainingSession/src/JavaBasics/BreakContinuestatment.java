package JavaBasics;

public class BreakContinuestatment {

	public static void main(String[] args) {
		
		// continue statement
		
		for(int i=1;i<=10;i++) {
			if ( i==5) {	
				continue;
			}
			System.out.println(i);
		}
		
		// Break statement
		
		for(int j=1;j<=10;j++) {
			if (j==5) {
				break;
			}
			System.out.println(j);
			
		}

	}

}

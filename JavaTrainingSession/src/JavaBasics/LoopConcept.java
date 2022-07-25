package JavaBasics;

public class LoopConcept {
	
	//disadvantage of while loop is it will become infinite loop if incremental part is not given.

	public static void main(String[] args) {
		int i = 1;                                   // Initialization 
		while(i<=10) {                              // condition
			System.out.println(i);                
			i=i+1;                                   // Incremental
		}
		System.out.println("************");
		
		for(int j=10;j>=0;j--) {         //initialization; condition; in/di cremental
			System.out.println(j);
		
   
		}
		// Do while Loop
		System.out.println("************");
		int k=1 ;
		do {
			System.out.println(k);
			k++ ;
		} while ( k<10);
			
		
		}
	

}

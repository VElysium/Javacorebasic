package OOPConceptPart1;

public class GlobalvsLocalVariables {
  
	int age = 26;               // Variable defined in class and out of function is global variable
	String name = "Vishal";
	
	public static void main(String[] args) {
	     int i=15;    // local variable; defined inside function.
	     int j=18;
	     int sum= (i+j);
	     System.out.println(sum);
	     
	    // need to create object to use global variable in specific function.
	     
	  GlobalvsLocalVariables obj = new GlobalvsLocalVariables();
	  System.out.println(obj.age);
	  System.out.println(obj.name); 
	  obj.abc();
	  

	}
	
	public void abc() {
		int i =12;
		int j= 19;
		int k = i-j ;
		System.out.println(age);
		 
				
	}

}

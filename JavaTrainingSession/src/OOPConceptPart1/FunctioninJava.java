package OOPConceptPart1;

public class FunctioninJava {

	public static void main(String[] args) {
		FunctioninJava obj =  new FunctioninJava();
		obj.test();
		
		int l= obj.pqr();
		System.out.println(l);
		
		String s1= obj.qa();
		System.out.println(s1);
		
		 obj.division(30,10);
		// main method is void as it doesn't return any value.
		 
		 
		
		
        
		

	}
	
	// No input , No output
	//return type : void
	public void test() {     // void before method name as there isn't return.  
		System.out.println("test method");
	}
	// No input, Only output
	// return type : int
	public int pqr() {    // return data type is given before method name.
		System.out.println("pqr method");
		int i =10;
		int j= 20;
		int c = i+j;
		
		return c;
		
	}
	//No input, Only output
	//return type : String
	public String qa() {
		System.out.println("qa method");
		String s= "selenium" ;
		
		return s;
		
		
	}
	 //given input x and y,output
	public void division(int x,int y) {
	System.out.println("divison method");
		int d= x/y;
		System.out.println(d);
		
		
		
		
	}
}

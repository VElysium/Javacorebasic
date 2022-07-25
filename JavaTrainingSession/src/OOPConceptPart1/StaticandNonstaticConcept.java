package OOPConceptPart1;

public class StaticandNonstaticConcept {
	
	 static String name= "Vishal";   // Static variable
	 int age= 25;     // non static variable
	

	public static void main(String[] args) {
		StaticandNonstaticConcept obj= new StaticandNonstaticConcept (); // object
		
		System.out.println(obj.age);   // To use non static variable in any method
		                               // need to create object
		obj.function2();     // need object to call non static function.
		
		//Direct calling
		System.out.println(name);   // to use global static variable object is 
		                            //   not needed
		function1();
		// calling by using class name
		StaticandNonstaticConcept.function1();
		System.out.println(StaticandNonstaticConcept.name);
		
		// can we call static variable/function using obj : yes , but not right WAY.
		obj.function1();   
		

	}
	
	public static void function1() {
		System.out.println("send mail");
		System.out.println(age);    // why ask sachin
		System.out.println(name);     
	}
     
	public void function2() {
		System.out.println("mail received");
		System.out.println(age);    // obj is not neeed
	}
}

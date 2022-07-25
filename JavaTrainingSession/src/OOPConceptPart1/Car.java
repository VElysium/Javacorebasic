package OOPConceptPart1;

public class Car {
	// Class variable.
	int mod = 1995;
	int wheel=4 ;

	public static void main(String[] args) {
		Car a = new Car();                // New  Car is created object of Class Car
		Car b = new Car();
		Car c = new Car();
		
		a.mod = 2015 ;
	
		
		b.mod = 2016 ;
		
		
		c.mod = 2017 ;
		c.wheel= 6 ;
		
		System.out.println(b.wheel);
		System.out.println(c.wheel);
	System.out.println(b.jin());
		
		
		
		
		
				
		
		
	

	}
	public int jin() {
		 Car d = new Car();
		 return d.mod;
		
	}

}

package OOPConceptPart1;

public class Constructor {
	
	int i=5;
	String s;
	double d;
	
	public Constructor() {
		i=8;
		
	}
	public Constructor(int i) {
		 this.i=i;
		
	}
	// constuctor is used to pass value to variables in object.
	// if there is parameterized constructor in class , java will not creat default
	// constructor.

	public static void main(String[] args) {
	
	    Constructor obj1 = new Constructor();
	System.out.println(obj1.i);

		obj1.d=12.4;
		obj1.s= "vishal";
		Constructor obj2= new Constructor(6);
		System.out.println(obj2.i);
		System.out.println(obj2.square());
		System.out.println(obj1.square());
		Constructor obj3 =new Constructor();
		System.out.println(obj3.i);
	}
	
	public int square() {
		
		int s= i*i;
		return s;
	}

}

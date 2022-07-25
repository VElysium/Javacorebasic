package OOPConceptPart1;

public class Wrapperclass {

	public static void main(String[] args) {
		String s = "100";
		int i = 10;
		System.out.println(s+i);  // output 10010
		
		// converting string to integer
		int d = Integer.parseInt(s);
		System.out.println(d+i);   // output 110
		
		// converting string to float
		String c = "14.6";
		System.out.println(c+i);  //14.610
		float f = Float.parseFloat(c);
		System.out.println(f+i);
		
		// coverting integer to string
		
		int v =8;
		String vv = String.valueOf(8);
		System.out.println(i+vv);
		
		// converting mixed value
		String p = "100A";
		int t= Integer.parseInt(p); // it will gives errorNumberFormatException.
		
				

	}

}

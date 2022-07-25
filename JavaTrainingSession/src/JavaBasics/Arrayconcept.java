package JavaBasics;

public class Arrayconcept {
// array is used to declare multiple variable of same data type together.
	// to store similar data type value in array variable.
	// one dimensional array
	// Drawback of static array
	// 1. Limited size ; to overcome this use dynamic array, Collections,Arraylist,Hashtable
	// 2. can store only similar data type ; to overcome this use object array.
	public static void main(String[] args) {
		int i[] = new int[4];
		i[0]=10;            // Lowest bound index 0
		i[1]=20;
		i[2]=30;
		i[3]=40;            // upper bound index n-1
	    	//i[4]=12 ;   
		//System.out.println(i[4]) Error: Index 4 out of bounds for length 4
		System.out.println(i[1]);
		System.out.println(i.length);
		System.out.println("********");
		for(int j=0;j<i.length;j++) {
			System.out.println(i[j]);
		}
            double d[] = new double[3];
            d[0]= 12.45 ;
            d[1]= 13.6;
            d[2]= 12.88;
            for(int e=0;e<d.length;e++) {
            	System.out.println(d[e]);
            	
            }
       // object array : Object is class.
            // in object array can able to store different data type under one array.
            Object a[]=new Object [6];
            a[0]="tom";        // string data type
            a[1]=26;           // int data type
            a[2]= "London";
            a[4]= 6.2;           // double data type
            a[5]= "Eng";
            
            for(int b=0;b<a.length;b++) {
            	System.out.println(a[b]);
            	
            }
            
            
            		
	}

}

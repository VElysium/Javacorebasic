package JavaBasics;

public class DynamiArray {

	public static void main(String[] args) {
		String a[][]= new String [3][5] ;
		a[0][0] = "A";
		a[0][1]= "B";
		a[0][2]="C" ;
		a[0][3]= "D";
		a[0][4]= "E";
		
		a[1][0] = "A1";
		a[1][1]= "B1";
		a[1][2]="C1" ;
		a[1][3]= "D1";
		a[1][4]= "E1";
		
		a[2][0] = "A2";
		a[2][1]= "B2";
		a[2][2]="C2" ;
		a[2][3]= "D2";
		a[2][4]= "E2";
		
		System.out.println(a[0][4]);
		
		System.out.println(a.length);     //  for number of rows.
		System.out.println(a[0].length);  // for number of column.
		
		for(int j=0;j<1;j++) {
			for(int k=0; k< a[0].length; k++ ) {
				System.out.print(a[j][k]);
				
			}
			System.out.println();
		for(int p=1;p<2;p++) {
			for(int k=0; k<4; k++ ) {
				System.out.print(a[p][k]);
			
			}
			
		
				
		
		}

		}
	}

}

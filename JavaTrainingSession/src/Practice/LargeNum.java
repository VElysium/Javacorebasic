package Practice;

public class LargeNum {
     int v=5;
	public static void main(String[] args) {
		LargeNum obj= new LargeNum ();
		System.out.println(obj.sum());
		
		//System.out.println(obj.large());
		int max = 2;
		int b[]= new int [] {2,5,8,9,7};
		 for(int i=0;i<b.length;i++) {
			      //for(int j=i+1;j<b.length;j++)
				 if(b[i]> max) {
					  max= b[i];   // 2
					
				 }
				 
		 }
		
		 System.out.println(max); 
		 System.out.println(obj.v);

	}
	
	//public void large() {
	/*int max = 2;
		int b[]= new int [] {2,5,8,9,7};
		 for(int i=0;i<b.length;i++) {
			      //for(int j=i+1;j<b.length;j++)
				 if(b[i]> max) {
					  max= b[i];
					System.out.println(max); 
					
				 }
			 }
		 } */
		 //return max;   // can't call return
		 
	
		 
	

	public int sum() {
		 int i=5 ;
				 int j=6 ;
			System.out.println(v);	  // no need to call using obj.
				 int c= (i+j);
				 return c;
	}                 // can't call local variable of function in main()using obj.
}

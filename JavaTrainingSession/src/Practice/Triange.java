package Practice;
import java.util.Scanner;
public class Triange {
	
	//double base;
	//double height;
	
	public Triange() {
		
	}
	
	public static void main(String []args) {
		
		 Triange obj1 = new  Triange();
		 System.out.println("Enter height");
		 Scanner sach= new Scanner(System.in);
		 double height = sach.nextDouble();
		 System.out.println("Enter base");
		 Scanner sacb= new Scanner(System.in);
		 double base = sacb.nextDouble();
		 sach.close();
		 sacb.close();
		 
		 
		 
		  obj1.Tarea(height,base);
		 
			
	}
	
        public void Tarea(double base,double height) {
        	 double area= base* height/2;
        	System.out.println(area);
        	
        	
        }
}

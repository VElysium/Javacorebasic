package Practice;

public class Employeesdata {
	String name;
	int empno ;
	int salary;
	static String company = "JLL";
	
	public Employeesdata (String name,int empno,int salary) {
		this.name=name;
		this.empno=empno;
		this.salary=salary;
	
	}
	
	public static void main(String[] args) {
		Employeesdata obj1= new Employeesdata ("Vishal",101,500);
		Employeesdata obj2= new Employeesdata ("Jindal",102,501);
		
		System.out.print(obj1.name);
		System.out.print(obj1.empno);
		System.out.print(obj1.salary);
		System.out.println(company);
		
		System.out.print(obj2.name);
		System.out.print(obj2.empno);
		System.out.print(obj2.salary);
		System.out.print(company);
		
	}

}

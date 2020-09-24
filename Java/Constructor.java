class Employee
{
	int eid,esal;
	Employee()
	{
		eid=1;
		esal=10000;
		
	}
	Employee(int eid,int esal)
	{
		this.eid=eid;
		this.esal=esal;
		
	}
	Employee(Employee e)
	{
		this.eid=e.eid;
		this.esal=e.esal;
		
	}
	void display()
	{
		System.out.println(" Your salary is:- "+esal+"\n with ID:- "+eid);
	}
}
class Constructor
{
	public static void main(String args[])
	{
		Employee e1=new Employee();
		System.out.println("-------------------------Default Constructor-----------------------------------");
		e1.display();
		Employee e2=new Employee(2,20000);
		System.out.println("-------------------------paramatric Constructor-----------------------------------");
		e2.display();
		Employee e3=new Employee(e2);
		System.out.println("-------------------------Copy Constructor-----------------------------------");
		e3.display();
		System.out.println("----------------------------------------------------------------------------------");
	}
}
	
	
	
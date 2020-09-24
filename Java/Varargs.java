class Var
{
	
	void display(int ...n)
	{
	int ans=0;
		for(int i:n)
		{
			ans=ans+i;
		}
		System.out.println("Addition is:- "+ans);
	}
}
class Varargs
{
	public static void main(String args[])
	{
		Var v1=new Var();
		v1.display();
		v1.display(10,20);
		v1.display(10,20,30);
	}
}	
	
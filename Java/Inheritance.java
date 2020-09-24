import java.util.*;
class Grandfather
{
	int gage;
	Grandfather(int gage)
	{
		this.gage=gage;
	}
	void show()
	{
		System.out.println("The age of Grandfather is:- "+gage);
	}
}
class Father extends Grandfather
{
	int fage;
	Father(int fage)
	{
		super(fage+30);
		this.fage=fage;
	}
	void show()
	{
		super.show();
		System.out.println("The age of Father is:- "+fage);
	}
}
class Son extends Father
{
	int sage;
	Son(int sage)
	{
		super(sage+30);
		this.sage=sage;
	}
	void show()
	{
		super.show();
		System.out.println("The age of Son is:- "+sage);
	}
}
class Inheritance
{
	public static void main(String args[])
	{
		Son s1=new Son(20);
		s1.show();
	}
}



interface Number
{
	public static int no=100;
}
interface Function extends Number
{
	 void fun();
}
class Combination implements Function
{
	public void fun()
	{
		System.out.println("the value of No is:- "+no);
	}
}
class Interface
{
	public static void main(String args[])
	{
		Combination c1=new Combination();
		c1.fun();
	}
}

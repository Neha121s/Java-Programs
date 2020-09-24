abstract class Hi
{
	public abstract void welcome();
}
class Hello extends Hi
{
	public void welcome()
	{ 
		System.out.println("Welcome to abstract");
	}
}
class Abstract
{
	public static void main(String args[])
	{
		Hello h1=new Hello();
		h1.welcome();
	}
}
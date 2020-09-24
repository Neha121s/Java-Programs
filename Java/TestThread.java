class A extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("In A " +i);
			
		}
	}
}
class B extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("In B "+i);
			if(i==2)
			{
				yield();
			}
			if(i==3)
			try
			{
				sleep(2000);
			}
			catch(Exception e){}
		}
	}
}
class TestThread
{
	public static void main(String args[])
	{
		A a1 =new A();
		B b1=new B();
		a1.start();
		b1.start();
	}
}
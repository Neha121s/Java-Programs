import java.net.*;

public class TestInet
{
	public static void main(String args[])throws Exception
	{
		InetAddress add=InetAddress.getLocalHost();
		System.out.println(add);
		add=InetAddress.getByName("google.com");
		System.out.println(add);
		InetAddress ia[]=InetAddress.getAllByName("www.google.com");
		for(int i=0;i<ia.length;i++)
		{
			System.out.println(ia[i]);
		}
	}
}
import java.util.*;
class Commandline
{
	public static void main(String args[])
	{
		int ans=0;
		for(int i=0;i<args.length;i++)
		{
			int n1=Integer.parseInt(args[i]);
			ans=ans+n1;
		}
		System.out.println("Addition is:- "+ans);
	}
}	
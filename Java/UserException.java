class User extends Exception
{
	User(String s)
	{
		super(s);
	}
}
class UserException
{
	public static void main(String args[])
	{
		int age=17;
		try
		{
			if(age<18)
			{
				throw new User("Age is less than 18");
			}
		}
		catch(User u)
		{
			System.out.println(u.getMessage());
		}
	}
}
		
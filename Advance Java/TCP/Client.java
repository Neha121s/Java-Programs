import java.io.*;
import java.net.*;
import java.util.*;


class Client
{
	public static void main(String args[])throws Exception
	{
		Socket s = new Socket("localhost",1212);  //Bind port number.
		String str="";
		
		DataInputStream din = new DataInputStream(s.getInputStream());
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		while(!str.equals("Bye"))
		{
			System.out.println("Client :");  
			str=br.readLine();    //Read data from client side
			dout.writeUTF(str);   //Send data to server
			
			if(!str.equals("Bye"))
			{
				str=din.readUTF();	  //get data from server side
			System.out.println("Server says : "+str);
			}
			
		}
		
		
		dout.flush();
		dout.close();
		s.close();
	}
}
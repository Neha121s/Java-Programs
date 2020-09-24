import java.io.*;
import java.net.*;
import java.util.*;

class Server
{
	public static void main(String args[])throws Exception
	{
		ServerSocket ss=new ServerSocket(1212); //Bind port number
		System.out.println("Waiting for client...");
		Socket s=ss.accept();   //accept client request
		
		
		DataInputStream din = new DataInputStream(s.getInputStream());
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str="";
		while(!str.equals("Bye")) // ends when server says Bye
		{
			str=din.readUTF();  //get data from client
			System.out.println("Client says : "+str); 
			
			if(!str.equals("Bye"))
			{
				System.out.println("Server :");  
				str=br.readLine();    //Read data from Server side
				dout.writeUTF(str);   //Send data to client
			}
				
		}
		
		
		din.close();
		s.close();
		ss.close();
	}
}
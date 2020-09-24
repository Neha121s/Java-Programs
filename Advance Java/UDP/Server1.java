import java.net.*;
import java.io.*;
import java.nio.charset.*;
import java.util.*;

class Server1
{
    public static void main(String args[])throws SocketException,IOException
    {
        InetAddress addr=InetAddress.getLocalHost();
        DatagramSocket s= new DatagramSocket(1213);         //server port number
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        byte[] buffer=new byte[30];

        String str="";
        while(!str.equals("Bye")) //until says bye
        {
            byte[] buffer1=new byte[30];
            DatagramPacket dp2=new DatagramPacket(buffer1,buffer1.length); //packet to recive data
            s.receive(dp2);     //recieve data

            buffer1=dp2.getData();
            String str1=new String(buffer1,StandardCharsets.UTF_8);

            System.out.println("Client says: "+str1);

            System.out.println("Server :");
            str=br.readLine();
            buffer=str.getBytes();

            DatagramPacket dp1=new DatagramPacket(buffer,buffer.length,addr,1212); //packet to send the data
            s.send(dp1);        //send data

        }

    }
}
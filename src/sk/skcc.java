package sk;
import java.util.*;
import java.net.*;
public class skcc {
	public static void main(String args[])
	{
		try{
		java.net.Socket socket = new java.net.Socket("localhost", 8005);
        socket.getOutputStream().write("xxxxxxxxx".getBytes());
        socket.getOutputStream().flush();
        socket.getOutputStream().close();
        socket.close();
        System.out.println("³É¹¦");
		}catch(Exception e)
		{
			System.out.println("Ê§°Ü");
			e.printStackTrace();
		}
	}

}

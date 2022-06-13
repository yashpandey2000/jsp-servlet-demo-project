package co.in.model;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class tcp_client {
public static void main(String[] args) throws UnknownHostException, IOException  {
	
	
	Socket client = new Socket("localhost",1234);
	
	Scanner in =new Scanner(client.getInputStream());
	
	PrintWriter out = new PrintWriter(client.getOutputStream());
	
	
	String line = in.nextLine();
	out.print("hello server");
	
	client.close();
	
}
}

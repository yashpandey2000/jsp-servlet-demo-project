package co.in.model;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class tcp_server {

	public static void main(String[] args) throws IOException {
	
		
		ServerSocket ss = new ServerSocket(1234);	
		
		Socket client = ss.accept();
		
		Scanner in =new Scanner(client.getInputStream());
		
		PrintWriter out = new PrintWriter(client.getOutputStream());
		
		
		String line = in.nextLine();
		out.print("hello client");
		
		client.close();
		
	}
}

package co.in.model;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Echoclient {
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		
		Socket client = new Socket("localhost",4444);
		
		PrintWriter out = new PrintWriter(client.getOutputStream(),true);
		
		Scanner sc = new Scanner(client.getInputStream());
		
		System.out.println("Echo client started");
		
		Scanner sc1 = new Scanner(System.in);
		String line = sc1.nextLine();
		
		while(line != null){
		out.print(line);	
			
		System.out.println("Echo :" +sc.nextLine());
		
		if("bye".equals(line)){
			break;
		}
		
		line= sc1.nextLine();
			
		}
		
		out.close();
		sc.close();
		sc1.close();
		client.close();
	}

}

package by.htp.client;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	
	public static void main(String[] args) {
	
	Socket clientSocket;
	try {
		Scanner sc =new Scanner(System.in);
		System.out.println("¬ведите номер измен€емого символа");
		int num=Integer.parseInt(sc.nextLine());
		System.out.println("¬ведите символ на который нужно именить");
		String Simvol=sc.nextLine();
		String  Strr=Simvol+" "+num;
		ResultFile.clientWrite(Strr);
		
		
		clientSocket = new Socket("localhost", 9696);
		PrintWriter writer= new PrintWriter(clientSocket.getOutputStream());
		clientSocket.getOutputStream().write(Strr.getBytes());
//		writer.write();
		
		byte[] b=new byte[1024];
		InputStream is= clientSocket.getInputStream();
		is.read(b);
		System.out.println(new String(b));
//		InputStream is=new clientSocket.ge
		
		
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	
	
	}
}

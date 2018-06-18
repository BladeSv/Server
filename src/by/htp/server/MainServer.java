package by.htp.server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MainServer {

	
	public static void main(String[] args) {
		
		try {
			System.out.println("serv start");
			ServerSocket serverSocket = new ServerSocket(9696);
			Socket clientSoket= serverSocket.accept();
			System.out.println("client con");
			
			String str=ServerFile.serverFileRead();
			System.out.println(str);
			
			
			String toClint=null;
			String fromClient=null;
			InputStream is =clientSoket.getInputStream();
			
			byte[] data= new  byte[1024];
			is.read(data);
			System.out.println("data recieved");
			fromClient=new String(data);
			System.out.println(fromClient);
			
			toClint=fromClient+str;
//			Вывод информации
			
			
			
			OutputStream so =clientSoket.getOutputStream();
			byte[] da= toClint.getBytes();
			so.write(da);
//			PrintWriter writer=new PrintWriter(so);
			//writer.println("Hello World");

//			writer.print("HTTP/1.1 200 OK \r\n");
//			//writer.print("!DOCTYPE html");
//			writer.print("Content-Type: text/html\r\n");
//
//			// writer.print("Connection: close\r\n");
//			writer.print("\r\n");
//			writer.print("<html><head></head><body><h1>Hello User!</h1></body></html>");	
//	
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
}

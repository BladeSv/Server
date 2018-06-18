package by.htp.client;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;

public class ResultFile {
	
	
	public static void clientWrite(String str) {
	try {
File f=new File("Resourse/Client.txt");
	if(!f.exists()) {
		f.createNewFile();
	}
FileWriter wr=new FileWriter(f);
wr.write(str);
wr.flush();
	}catch(IOException e) {
		System.out.println("Ошибка записи файла клиента");
		e.printStackTrace();
		
	}
	}
}

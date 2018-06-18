package by.htp.server;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

public class ServerFile {

	public static String serverFileRead() {
		String str=null;
		try {
			File f=new File("Resourse/Server.txt");
			if(!f.exists()) {
				System.out.println("Файла сервера нет");
				f.createNewFile();
			}
				
			FileReader fr=new FileReader(f);
			BufferedReader br =new BufferedReader(fr);
			str=br.readLine();
				
				
				
				
				
			
			
			
		}catch(IOException e) {
			System.out.println("Ошибка считывания файла Сервера");
			e.getStackTrace();
			
		}
	
		return str;
	
		
		
	}
	
	
	
	
}

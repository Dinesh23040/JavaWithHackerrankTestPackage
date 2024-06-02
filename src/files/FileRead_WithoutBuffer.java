package files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;

public class FileRead_WithoutBuffer {
	
	int i;
	FileReader fr;
	
	void readfile() {
		
		try {
			String path=System.getProperty("user.dir");
			System.out.println("file path: "+path);
			path=path+"\\src\\regexpressions\\text_to_search.txt";
			 fr=new FileReader(path);
			
			while((i=fr.read())!=-1) {
				
				System.out.print((char)i);
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			
			try {
				
				fr.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		
		FileRead_WithoutBuffer fr_wb=new FileRead_WithoutBuffer();
		fr_wb.readfile();
		
	}

}

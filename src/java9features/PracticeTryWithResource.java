package java9features;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;

public class PracticeTryWithResource {
	
	public static void main(String[] args) throws FileNotFoundException {
		String filePath="C:\\Users\\gurramku\\Desktop\\ICICI_Call.txt";
		
		BufferedReader br=new BufferedReader(new FileReader(filePath));
		try(br){
			
			StringBuilder sb=new StringBuilder();
			String s=br.readLine();
			while(s!=null) {
				sb.append(s+"\n");
				s=br.readLine();				
			}
			System.out.println("Text read from the file : "+sb);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}

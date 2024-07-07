package java9features;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;

public class TryWithResource {

	private void printFileData() throws FileNotFoundException {

		String filepath = "C:\\Users\\gurramku\\Desktop\\ICICI_Call.txt";
		BufferedReader br = new BufferedReader(new FileReader(filepath));
		

		try (br) {

			StringBuilder sb = new StringBuilder();

			String s = br.readLine();

			while (s != null) {
				sb.append(s);
				sb.append("\n");
				s=br.readLine();
			}
			
			System.out.println("Text read from the file : "+ sb);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws FileNotFoundException {
		
		TryWithResource twr=new TryWithResource();
		twr.printFileData();
	}
}

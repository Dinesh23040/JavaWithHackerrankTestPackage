package files;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileNotFoundException;

public class FilesPractice {

	static void readFileWithoutBuffer() throws IOException {
		FileReader fr = null;
		int i;
		try {
			String path = System.getProperty("user.dir");
			path = path + "\\src\\regexpressions\\text_to_search.txt";
			fr = new FileReader(path);

			while ((i = fr.read()) != -1) {
				System.out.print((char) i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			fr.close();
		}
	}

	static void readWriteFileToFile() throws IOException {
		FileReader fr = null;
		FileWriter fw = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			String path = System.getProperty("user.dir");
			String readPath = path + "\\src\\Conversions.txt";
			String writePath = path + "\\src\\Conversions2.txt";
			fr = new FileReader(readPath);
			fw = new FileWriter(writePath, false);
			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);

			StringBuilder sb = new StringBuilder();
			String line = br.readLine();

			while (line != null) {
				sb.append(line + "\n");
				bw.write(line + "\n");
				line = br.readLine();
			}
			System.out.println("text in string builder :"+ sb.toString());	
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			br.close();
			bw.close();
		}

	}

	public static void main(String[] args) throws IOException {
		//readFileWithoutBuffer();
		readWriteFileToFile();
	}
}

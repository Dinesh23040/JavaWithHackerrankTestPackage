import java.util.*;
//import java.awt.RenderingHints.Key;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class PropertiesPractice {

	public void readProperties() throws Exception {

		String userDirectory = System.getProperty("user.dir");
        System.out.println("User Directory :"+userDirectory);
		
        File f=new File(userDirectory+"\\PropPractice.properties");
		//File f = new File("C:\\Dinesh\\Dinesh_dg185171\\Dinesh\\Java\\Eclipse_Projects\\Java_Practice\\JavaPractice\\PropPractice.properties");
		FileInputStream fis = new FileInputStream(f);
		Properties p = new Properties();
			
		p.load(fis);
		
		//System.out.println("properties values: "+p.getProperty(id));
				
		Enumeration<Object> k = p.keys();
		while (k.hasMoreElements()) {
			String key = (String) k.nextElement();
			String value = p.getProperty(key);
			System.out.println("values :" + key + " - " + value);
		}
	}
	
	public void readProperties_2() throws Exception {
		
		String path=System.getProperty("user.dir");
		File f=new File(path+"\\PropPractice.properties");
		FileInputStream fis=new FileInputStream(f);
		Properties p=new Properties();
		p.load(fis);
		
		Enumeration e=p.keys();
		
		while(e.hasMoreElements())
		{
			String key=(String) e.nextElement();
			String value=p.getProperty(key);
			System.out.println("key :"+key+", value:"+value);
		
		}
	}
	
	public static void main(String[] args) throws Exception {
		
		PropertiesPractice pp=new PropertiesPractice();
		//pp.readProperties();
		pp.readProperties_2();
	}

}

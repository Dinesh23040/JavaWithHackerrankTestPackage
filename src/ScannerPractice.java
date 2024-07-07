
import java.util.Scanner;

public class ScannerPractice {

public static void main(String[] args) {		
	
//	  System.out.print("Enter your name : ");//	  
//	  Scanner s=new Scanner(System.in);//	  
//	  String name=s.nextLine();//	  
//	  System.out.println("Data gathered through system class : "+ name);	
	
	Scanner scan = new Scanner(System.in);
    int i = scan.nextInt();
   double d=scan.nextDouble();
   //scan.nextLine();
   //String s=scan.nextLine();
   String s=scan.next();
   
   System.out.println("String: " + s);
   System.out.println("Double: " + d);
   System.out.println("Int: " + i);
	 
}

}



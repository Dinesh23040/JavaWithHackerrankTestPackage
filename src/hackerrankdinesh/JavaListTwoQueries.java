package hackerrankdinesh;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 
5
12 0 1 78 12
2
Insert
5 23
Delete
0
 * 
 */
public class JavaListTwoQueries {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i_value=sc.nextInt();
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<i_value;i++){
            al.add(i,sc.nextInt());
        }
        
        int queries_count=sc.nextInt();       
            
            for(int i=0;i<queries_count;i++){
            String query=sc.next();
            
            switch(query){
                
                case "Insert":
                        int index=sc.nextInt();
                        int value=sc.nextInt();   
                        if(index<al.size()){                     
                        al.set(index-1, value);
                        }else{
                            al.add(value);
                        }
                        
                break;
                case "Delete":
                        int index_d=sc.nextInt();                        
                        al.remove(index_d);
                break;
                default:
                System.out.println("Only Insert, Delete operations allowed");
                
            }
            }
            
        for(Integer i:al){
            System.out.print(i+" ");
        }                      
        
        sc.close();
    }
	
}

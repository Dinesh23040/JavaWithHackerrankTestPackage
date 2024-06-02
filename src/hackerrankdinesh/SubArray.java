package hackerrankdinesh;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 5
1 -2 4 -5 1
 */

public class SubArray {

	 public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        
	        Scanner sc=new Scanner(System.in);
	        int arr_size =sc.nextInt();
	        int[] arr=new int[arr_size];
	        
//	        ArrayList<Integer> al1=new ArrayList<Integer>();
//	        	        
//	        for(int a=0;a<arr_size;a++){
//	            al1.add(sc.nextInt());
//	        }      
//	        
	        for(int i = 0; i < arr_size; i++){
	            arr[i] = sc.nextInt();
	        }
	        
	        int count=0;
	        for(int i=0;i<arr_size;i++) {
	        	int sum=0;
	        	for(int j=i;j<arr_size;j++) {
	        		sum+=arr[j];
	        		if(sum<0) {
		        		count++;
		        	}
	        	}
	        	
	        }
	        
	        System.out.println(count);
	        
	    }
	
}

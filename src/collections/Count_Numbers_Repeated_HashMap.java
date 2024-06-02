package collections;

import java.util.*;
import java.util.HashMap;

public class Count_Numbers_Repeated_HashMap {


	static void remove_Duplicates() {

		// 5,4,3,4,5,6,7,8,5
		ArrayList<Integer> al = new ArrayList<Integer>();

		al.add(5);
		al.add(4);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(6);

		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

		 for (int i = 0; i < al.size(); i++) {
		  
		  if (hm.containsKey(al.get(i))) {
			int j = hm.get(al.get(i)); 
			hm.put(al.get(i),++j); 
		   } 
		   else 
		   { 
			hm.put(al.get(i), 1); 
		    }
		  
		  }

		/*
		int index_value=0;
		
		for(Integer i:al)
		{
			if(hm.containsKey(al.get(index_value))) {
				
				int v=hm.get(al.get(index_value));			
				v+=1;
				hm.put(al.get(index_value), v);
			}
			else 
			{
				hm.put(al.get(index_value), 1);	
			}
			++index_value;
		}
		*/
		hm.forEach((x, y) -> System.out.println("Key : " + x + " value : " + y));
		for(Map.Entry entry:hm.entrySet())
		{
			if(entry.getValue().equals(1)){System.out.println("Not repeated key : "+entry.getKey());}
		}
		hm.forEach((x,y) -> {

			if(y.equals(1)){
				System.out.println("Not repeated key : "+x);
			}
		});
	}

	static void charcaters_repeated(){

		String s="Hello World";

		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		char[] ch=s.toCharArray();
		for(char c:ch)
		{
			System.out.println(c);
		}

		for(char c:ch)
		{
			//if( !Character.isWhitespace(c)) {
			if (hm.containsKey(c)) {
				int count = hm.get(c);
				hm.put(c, ++count);
			} else {
				hm.put(c, 1);
			}
			//}
		}
		//hm.forEach((x,y)->System.out.println(" key : "+x+" value : "+y));

		for(Map.Entry<Character,Integer> entry:hm.entrySet())
		{
			if(entry.getKey()>1)
			{
				hm.remove(entry.getKey());
			}
		}
		hm.forEach((x,y)->System.out.println(" key : "+x+" value : "+y));
	}

	public static void main(String[] args) {

		remove_Duplicates();
	}

}

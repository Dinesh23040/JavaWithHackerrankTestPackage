package collections;

import java.util.*;
import java.util.stream.Collectors;

//ArrayList allows null values

//programs to compare two arraylist : https://www.javatpoint.com/how-to-compare-two-arraylist-in-java

//compare two arraylist (contentEquals) : https://www.javatpoint.com/how-to-compare-two-arraylist-in-java
// ArrayList doesn't allow null value

class Book_Shelf {
	
	int id;
	String name,author,publisher;
	int quantity;
	
	Book_Shelf(int id, String name, String author, String publisher,int quantity){
		this.id=id;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		this.quantity=quantity;
	}
}

public class ArrayList_JavaTpoint {
	
	public static void main(String[] args) {

		ArrayList_JavaTpoint al = new ArrayList_JavaTpoint();
		
		al.arrayListEx1();
		//al.sort_ArrayList();
		//al.addElements_DiffWays();
		
		//al.arrayList_RemoveElements();
		//al.retain_All();

		
		Book_Shelf bs1=new Book_Shelf(1, "abcd", "defg", "ijkl", 5);
		Book_Shelf bs2=new Book_Shelf(2, "abcd_2", "defg_2", "ijkl_2", 9);
		/*
		ArrayList<Book_Shelf> bal=new ArrayList<Book_Shelf>();
		bal.add(bs1);
		bal.add(bs2);
		*/

	//	bal.forEach(x->System.out.println(x.id+"  "+x.name+"  "+x.author+"  "+x.publisher+"  "+x.quantity));
		
	//	System.out.println("Book_Shelf ArrayList size : "+bal.size());		
		
		ArrayList<Integer> al_i=new ArrayList<Integer>();
		al_i.add(1);
		al_i.add(2);
		
		//al_i.con
		
		//System.out.println(al_i.get(0)>al_i.get(1)?true:false);
		
		//al.compare_ArrayList();

		//al.arrayList_RemoveElements();

		al.stream_Interface();
	}

	void arrayListEx1() {
		
		ArrayList<String> al = new ArrayList<>();
		al.add("Dinesh");
		al.add("Kumar");
		al.add("Gurram");
		//al.add(null);
		//al.add(null);
		//al.add("");
		//al.add("");
		
		System.out.println("Directly printing ArralList elements : "+al);

		System.out.println("Displaying ArrayList using enhanced for loop : ");
		
		for (String s : al) {
			System.out.println(" " + s);
		}

		Iterator<String> i = al.iterator();
		System.out.println("Displaying ArrayList using Iterator : ");

		while (i.hasNext()) {

			String value = i.next();
			System.out.println(" " + value);
		}

		System.out.println("Displaying ArrayList using stream : ");
		al.forEach(x -> System.out.println(" " + x));
		
		System.out.println("After Get and Set methods");
		System.out.println("element at index 2 : "+al.get(2));
		al.set(al.size()-1, "abcdef");
		al.forEach(x -> System.out.println(" " + x));

		System.out.println("ArrayList size : "+ al.size());
	
	}
	
	void sort_ArrayList() {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Dinesh");
		al.add("Kumar");
		al.add("Gurram");
		
		
		Collections.sort(al);
		al.forEach(x -> System.out.println(" " + x));
	}
	
	void addElements_DiffWays() {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Dinesh");
		al.add("Kumar");
		al.add("Gurram");
		
		System.out.println("After invoking add(E e) method: "+al);  
		
		al.add(1, "Gaurav");  
        System.out.println("After invoking add(int index, E element) method: "+al);
        
        
        ArrayList<String> al2=new ArrayList<String>();
        al2.add("abcd");
        al2.add("defg");           
        al.addAll(al2);
        
        System.out.println("After invoking addAll(Collection<? extends E> c) method: "+al);  
        
        ArrayList<String> al3=new ArrayList<String>();  
        al3.add("John");  
        al3.add("Rahul"); 
        
        //Adding second list elements to the first list at specific position  
        al.addAll(1, al3);  
        
        System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: "+al);  
	}
	
	void arrayList_RemoveElements() {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Dinesh");
		al.add("Kumar");
		al.add("Gurram");
		al.add("abcd");
		al.add("efgh");
		al.add("ijkl");
		
		System.out.println("Initial list of elements : "+al);
		
		al.remove("abcd");
		System.out.println("After removing abcd from arrlist : "+al);
		
		al.remove(0);
		System.out.println("After invoking remove(index) method : "+al);
		
		ArrayList<String> al2=new ArrayList<String>();
		al2.add("ijkl");
		al2.add("efgh");

		al.removeAll(al2);
		System.out.println("After invoking removeAll(ArrayList) method : "+al);
		
		al.add(0,"Dinesh");
		
		System.out.println("After adding Dinesh : "+al);
		al.removeIf(x->x.contains("Dinesh"));
		System.out.println("After invoking removeIf(ArrayList) method : "+al);
		
		al.clear();		
		System.out.println("After invoking clear method : "+al);
	}
	
	void retain_All() {
		
		ArrayList<String> al = new ArrayList<String>();
		
		System.out.println("Before adding elements into ArrayList : "+al.isEmpty());
		
		al.add("Dinesh");
		al.add("Kumar");
		al.add("Gurram");
		
		System.out.println("After adding elements into ArrayList : "+al.isEmpty());
		
		ArrayList<String> al2=new ArrayList<String>();
		al2.add("Dinesh");
		al2.add("abcd");
		
		al.retainAll(al2); //It is used to retain all the elements in the 
						   //list that are present in the specified collection.
		
		System.out.println("After invoking retain all method : "+al);	
		
	}

	void compare_ArrayList() {
		
		ArrayList<String> al1=new ArrayList<String>();
		al1.add("Apple");
		al1.add("Pears");
		al1.add("Guava");
		
		ArrayList<String> al2=new ArrayList<String>();
		al2.add("Apple");
		al2.add("Pears");
		al2.add("Guava");
		
		boolean boolval=al1.equals(al2);
		System.out.println("two array Lists are equal using equals method : "+boolval);
		
		al2.add("Papaya");
		
		boolean boolval2=al1.equals(al2);
		System.out.println("after adding papaya two array Lists are not equal using equals method : "+boolval2);
		
		int[] a={1,2,3,4};
		ArrayList<Integer> al3=new ArrayList<Integer>();
		//ArrayList<Integer> al3=new ArrayList<Integer>(Arrays.stream(a).boxed().toArray(Integer[]::new));

		for (int value : a) {
            al3.add(value);
        }
		
		ArrayList<Integer> al4=new ArrayList<Integer>(Arrays.asList(3,6,9,12,0,14));
		
		al3.removeAll(al4);
		
		System.out.println("un common element of al3 array list :"+al3);
		
		ArrayList<Integer> al5=new ArrayList<Integer>(Arrays.asList(3,6,9,12,1,14));
		
		System.out.println("Priting array list 5 : "+al5);
		
		ArrayList<Integer> al6=new ArrayList<Integer>(Arrays.asList(3,6,9,12,0,14));		
		
		for(Integer i:al6) 
		//System.out.println(al5.contains(Integer.valueOf(i))?"Yes":"no");
		System.out.println(al5.contains(i)?"Yes":"no");
		
	}

	void stream_Interface() {
		
		//Link : https://www.javatpoint.com/how-to-compare-two-arraylist-in-java
		
		ArrayList<String> firstList  = new ArrayList<String>(Arrays.asList("Java", "Python", "Ruby"));  
		System.out.println("First List: "+firstList);  
		
		ArrayList<String> secondList = new ArrayList<String>(Arrays.asList("Java", "Python", "Ruby", "Go", "Perl"));  
		System.out.println("Second List: "+secondList);  
		
		//ArrayList<String> al3=firstList.stream().filter(secondList::contains).collect(Collectors.toCollection(ArrayList::new));
		//System.out.println("Array list retain : "+al3);

		// Finds common elements   
		System.out.println("Common elements: " +firstList.stream().filter(secondList::contains).collect(Collectors.toList()));
		
		System.out.println("firstList : "+firstList);
	}
	
	

}

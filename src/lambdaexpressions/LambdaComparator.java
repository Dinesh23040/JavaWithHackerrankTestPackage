package lambdaexpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

class Productp {
	int id;
	String name;
	float price;

	public Productp(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class LambdaComparator {
	public static void main(String[] args) {

		List<Productp> l = new ArrayList<Productp>();
		l.add(new Productp(1, "ghj", 120f));
		l.add(new Productp(3, "abc", 124f));
		l.add(new Productp(2, "def", 123f));
		l.add(new Productp(4,"Nokia Lumia",15000f));  
        l.add(new Productp(5,"Redmi4 ",26000f));  
        l.add(new Productp(6,"Lenevo Vibe",19000f)); 
		
		//sort as per name
//		Collections.sort(l,(p1,p2)-> {
//			return p1.name.compareTo(p2.name);
//		});
		
		//sort as per id
//		Collections.sort(l,(p1,p2)-> {
//			if(p1.id>p2.id) {
//				return 1;
//			}
//			else if(p1.id<p2.id){
//					return -1;
//			}
//					else {
//						return 0;
//					}
//		});
		
		//sort as per id using Integer
//		Collections.sort(l,(p1,p2)-> {
//			return Integer.compare(p1.id, p2.id);
//		});
		
		//sort as per price
//		Collections.sort(l,(p1,p2)-> {			
//			return Float.compare(p1.price, p2.price);			
//		});
		
	//filtering the data based on price
    Stream<Productp> fl_data=l.stream().filter(x->x.price>10000);		
	fl_data.forEach(x->System.out.println(x.id+" "+x.name+" "+x.price));

}}

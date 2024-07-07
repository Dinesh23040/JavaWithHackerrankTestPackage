package lambdaexpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product{
	int id;
	String name;
	float price;
	public  Product(int id,String name,float price) {
		super();
		this.id=id;
		this.name=name;
		this.price=price;
	}
}

public class LambaExpressionComparator {
	
	public static void main(String[] args) {
		List<Product> list=new ArrayList<Product>();
		list.add(new Product(1,"a1d",21.3f));
		list.add(new Product(3,"a3d",23.3f));
		list.add(new Product(4,"a4d",24.3f));
		list.add(new Product(2,"a2d",22.3f));
		
		Collections.sort(list,(p1,p2)->{
			return p1.name.compareTo(p2.name);
		});
		
		list.forEach(x->System.out.println(x.id+" "+x.name+" "+x.price));
	}
}

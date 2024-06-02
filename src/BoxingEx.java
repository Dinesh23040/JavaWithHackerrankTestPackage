
/***
 * Certainly!

1. **a.intValue()**: This method is used to extract the integer value from an `Integer` object `a`. It returns the integer value represented by the `Integer` object `a`.

   ```java
   Integer a = 10;
   int value = a.intValue(); // value is now 10
   ```

2. **Integer.valueOf()**: This method is a static factory method of the `Integer` class. It returns an `Integer` object representing the specified `int` value. It allows you to create an `Integer` object from an `int` primitive.

   ```java
   Integer a = Integer.valueOf(10); // a is now an Integer object representing the value 10
   ```

3. **Integer.parseInt()**: This method is a static method of the `Integer` class used to parse the specified string as a signed decimal integer. It returns the `int` value represented by the string.

   ```java
   int value = Integer.parseInt("10"); // value is now 10
   ```

In summary:
- `a.intValue()` extracts the integer value from an `Integer` object.
- `Integer.valueOf()` creates an `Integer` object from an `int` value.
- `Integer.parseInt()` parses a string into an `int` value.
 * 
 */

public class BoxingEx {
	
	Integer x=Integer.valueOf(12);
	Integer i=10;
	Double d=10.00;
	Float f=5f;
	Character c='a';
	Byte by=2;
	Short s=3;
	Long l=9l;
	Boolean bo=false;
	
	//unboxing
	int i2=10;
	int i3=i.intValue();
	
	double d2=d;
	double d3=d.doubleValue();
	
	float f2=f;
	float f3=f.floatValue();
	
	//boxing
	int a=10;
	Integer a2=Integer.valueOf(a);
	
	float f4=1.1f;
	Float f5=Float.valueOf(f4);
	
}

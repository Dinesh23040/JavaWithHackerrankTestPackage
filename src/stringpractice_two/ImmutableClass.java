package stringpractice_two;

final class Employee{
	
	final String pancardNumber;
	
	Employee(String pancardNumber) {
		this.pancardNumber=pancardNumber;
	}
	
	public String getEmployeeName() {
		return this.pancardNumber;
	}
}

public class ImmutableClass {
	
	public static void main(String[] args) {
		Employee e=new Employee("abc123abc");
		System.out.println(e.getEmployeeName());
	}

}

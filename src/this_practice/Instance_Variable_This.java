package this_practice;

class Student{
	
	int rollno;
	String name;
	float fee;
	
	Student(int rollno, String name, float fee) {
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;
	}
	
	void display() {
		System.out.println(rollno+" "+name+" "+fee);
	}
}

public class Instance_Variable_This {

	public static void main(String[] args) {
		Student s=new Student(1,"abc",3.2f);
		s.display();
		
	}
	
}

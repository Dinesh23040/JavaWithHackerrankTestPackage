package hackerrankdinesh;

/*
 * Sample Input

5
33 Rumpa 3.68
85 Ashis 3.85
56 Samiha 3.75
19 Samara 3.75
22 Fahim 3.76


Sample Output

Ashis
Fahim
Samara
Samiha
Rumpa
 * 
 */

import java.util.*;

class SortStudent implements Comparator<Student>{
    public int compare(Student s1,Student s2){
        if(s1.getCgpa()<s2.getCgpa()){
            return 1;
        }else if(s1.getCgpa()==s2.getCgpa()){
            if(s1.getFname().compareTo(s2.getFname())==0){
                if(s1.getId()>s2.getId()){
                    return 1;
                }else{
                    return -1;
                }
            }else{
                if(s1.getFname().compareTo(s2.getFname())>0){
                    return 1;
                }
                
            }
        } 
        return -1;
    }
}

class Student{
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
}

//Complete the code
public class JavaSort
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Student> studentList = new ArrayList<Student>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}
        
        Collections.sort(studentList,new SortStudent());
      
      	for(Student st: studentList){
			System.out.println(st.getFname());
		}
	}
}




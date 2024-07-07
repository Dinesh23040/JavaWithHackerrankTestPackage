package printingpatterns;

public class Patterns {
	
	public void pattern1() {
		
		for(int i=1;i<=4;i++) {
			
			for(int j=4;j>i;j--) {
				System.out.print(" ");
			}
			
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			
			for(int k=2;k<=i;k++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}
	
	public void pattern2() {
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
		System.out.println();	
		}
	}
	
	public static void main(String[] args) {
	
		Patterns p=new Patterns();
		p.pattern1();
		p.pattern2();
	}
}

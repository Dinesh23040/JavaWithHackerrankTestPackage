

class Instance_Initialize_Block_Ex2{
	
	int speed;
	Instance_Initialize_Block_Ex2(){
		System.out.println("Speed is "+speed);
	}
	
	{speed=100;}

	static {System.out.println("This is static block");}
	
	public static void main(String args[]) {
		Instance_Initialize_Block_Ex2 in2=new Instance_Initialize_Block_Ex2();
	}
}
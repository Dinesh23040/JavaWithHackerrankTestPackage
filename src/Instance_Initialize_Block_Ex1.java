class AZ {
	AZ() {
		System.out.println("parent class constructor invoked");
	}
}

class Instance_Initialize_Block_Ex1 extends AZ {
	
	static {System.out.println("static block");}
	
	Instance_Initialize_Block_Ex1() {
		super();
		System.out.println("child class constructor invoked");
	}

	Instance_Initialize_Block_Ex1(int a) {
		super();
		System.out.println("child class constructor invoked " + a);
	}

	{
		System.out.println("instance initializer block is invoked");
	}

	public static void main(String args[]) {
		Instance_Initialize_Block_Ex1 b1 = new Instance_Initialize_Block_Ex1();
		Instance_Initialize_Block_Ex1 b2 = new Instance_Initialize_Block_Ex1(10);
	}
}
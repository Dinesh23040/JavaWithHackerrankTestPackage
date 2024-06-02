package covariantreturntype_2;

class CRA{	
	CRA get() {
		return this;
	}
}

public class CovariantReturnTypeEx2 {	
	CovariantReturnTypeEx2 get() {
		return this;
	}
	void message() {
		System.out.println("welcome to covariant return type");
	}

	public static void main(String[] args) {
		new CovariantReturnTypeEx2().get().message();
	}
}

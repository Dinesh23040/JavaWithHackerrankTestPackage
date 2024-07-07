package exceptions;

public class MultiExceptionsInCatchBlock {

	public static void main(String[] args) {

		try {
			int[] i = { 1, 2, 4 };
			System.out.println(i[3]);
		} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
				e.printStackTrace();
		}
	}

}

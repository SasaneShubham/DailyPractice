package Exception;

public class Sample4 {

	public static void main(String[] args) {
		
		String a="Rahul";
		
		try {
			System.out.println(a.charAt(9));
		}
		catch(ArrayIndexOutOfBoundsException b) {
			System.out.println("ArrayIndexOutOfBoundsException handled");
		}
		catch(ArithmeticException f) {
			System.out.println("ArithmeticException Handled");
		}
		catch(StringIndexOutOfBoundsException g) {
			System.out.println("StringIndexOutOfBoundsException handled");
		}
		
		System.out.println("Hi");
	}
}

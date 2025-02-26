package Exception;

public class Sample3 {

	public static void main(String[] args) {
		
		String a="Rahul";
		
		
		
		try {
			System.out.println(a.charAt(9));
		}
		catch(StringIndexOutOfBoundsException s) {
			System.out.println("StringIndexOutOfBoundsException handled");
		}
		
		System.out.println("Hi");
	}
}

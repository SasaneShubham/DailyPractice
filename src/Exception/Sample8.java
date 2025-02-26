package Exception;

public class Sample8 {
	
	public static void main(String[] args) {
		
		String a="rahul";
		int b=10;
		
		int c=0;
		
		try {
			try {
				
				System.out.println(a.charAt(8));
			}
			catch(StringIndexOutOfBoundsException k) {
				
				System.out.println("StringIndexOutOfBoundsExceptio");
			}
			int d=b/c;
			System.out.println(d);
		}
		catch(ArithmeticException l) {

 
			System.out.println("ArithmeticException handled");
		}
	}

}

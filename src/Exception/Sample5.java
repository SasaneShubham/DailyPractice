package Exception;

public class Sample5 {

	public static void main(String[] args) {

		int a=10;
		int b=0;



		try {

			int c=a/b;
			System.out.println(c);
		}
		catch(Exception e) {

			e.printStackTrace();
			System.out.println("Generic Exception handled");
		}
		System.out.println("Hi");
	}
}

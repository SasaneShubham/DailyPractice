package Exception;

public class Sample6 {

	public static void main(String[] args)  
	{ 
		int a=10;
		int b=0;



		try {

			int c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e) {

			System.out.println("Exception handled");
		}

		System.out.println("Hello");

		String [] ar= {"Rahul","Shubham","Payal"};

		try {
			System.out.println(ar[7]);

		}
		catch(ArrayIndexOutOfBoundsException e) {

			System.out.println("ArrayIndexOutOfBoundsException handled");
		}

		System.out.println("Hi"); 
	}
}

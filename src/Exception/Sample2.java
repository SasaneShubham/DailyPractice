package Exception;

public class Sample2 {

	public static void main(String[] args) {
		
		String [] ar= {"Rahul","Shubham","Payal"};
		
		try {
		System.out.println(ar[7]);
		
		}
		catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("ArrayIndexOutOfBoundsException handled");
		}
		
	}
}

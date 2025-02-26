package Exception;

public class Sample7 {

	public static void main(String[] args)  
	 { 
	  String s1= "abcd"; 
	  try 
	  { 
	   System.out.println(s1.charAt(9));      //risky code1 
	  } 
	  finally  
	  { 
	   System.out.println("running "); 
	   System.out.println("Hi");
	  } 
	   
	   
	  System.out.println("Hi"); 
	 } 
}

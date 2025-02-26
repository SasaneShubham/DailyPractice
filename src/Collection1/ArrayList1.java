package Collection1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import org.checkerframework.checker.units.qual.s;

public class ArrayList1 {

	public static void main(String[] args) {
		
		
		ArrayList ar=new ArrayList();
		
		ar.add("Shubham");
		ar.add("Sasane");
		ar.add("QA Automation");
		ar.add(343);
		ar.add('A');
		ar.add(33.33f);
		ar.add(null);
		ar.add(343);
		
		System.out.println(ar);
		System.out.println(ar.indexOf(343));
		System.out.println(ar.lastIndexOf(343));
		System.out.println(ar.size());
		

       ar.add(3, 444);
       System.out.println(ar);
       
       ar.remove(3);
       
       ar.set(2, "Manual");
       
       System.out.println(ar);
		
       System.out.println(ar.contains(null));
       
       System.out.println(ar.isEmpty());
       
       
       System.out.println("________use iterator cursor_______");
       
       Iterator itr= ar.iterator();
       
       while(itr.hasNext()) {
    	   
    	   System.out.println(itr.next());
       }
       System.out.print("________use ListIterator cursor_______");
		
		
       ListIterator list=ar.listIterator();	
       
       while(list.hasNext()) {
    	   
    	   System.out.println(list.next());
       }
       
       System.out.println("________use for loop_______");
       
       for(int i=0;i<=ar.size()-1;i++) {
    	   System.out.println(ar.get(i));
       }
       
       System.out.println("_______for each______");

       for(Object s1:ar) {
    	   System.out.println(s1);
       }
    	   
       
	}
}

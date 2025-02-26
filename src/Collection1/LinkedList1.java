package Collection1;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		
		LinkedList link=new LinkedList();
		
		link.add("Rahul");
		link.add("Anil");
		link.add("Shubham");
		link.add("Tanu");
		link.add("Umesh");
		link.add("Pintu");
		link.add("Chetan");
		link.add("Shubham");
		
		
		System.out.println(link);

		System.out.println(link.indexOf("Shubham"));
		System.out.println(link.lastIndexOf("Shubham"));
		System.out.println(link.contains("Umesh"));
		System.out.println(link.isEmpty());
		
		System.out.println("________using iterator_______");
		
		Iterator itr=link.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("_________Reverse method________");
		
		Collections.reverse(link);
		
		System.out.println(link);
		
		System.out.println("_________Sort____________");
		
		Collections.sort(link);
		
		System.out.println(link);
		
		System.out.println("___Using for each");
		
		for(Object list:link) {
			System.out.println(list);
		}
		
	}
}

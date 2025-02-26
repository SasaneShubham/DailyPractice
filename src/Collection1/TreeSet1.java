package Collection1;


import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {

public static void main(String[] args) {
		
		TreeSet link=new TreeSet();
		
		link.add("Rahul");
		link.add("Anil");
		link.add("Shubham");
		link.add("Tanu");
		link.add("Umesh");
		link.add("Pintu");
		link.add("Chetan");
		link.add("Shubham");
		
		
		System.out.println(link);
//
//		System.out.println(link.indexOf("Shubham"));
//		System.out.println(link.lastIndexOf("Shubham"));
		System.out.println(link.contains("Umesh"));
		System.out.println(link.isEmpty());
		System.out.println(link.getFirst());
		System.out.println(link.getLast());
		System.out.println(link.getClass());
		System.out.println(link.contains("Shubham"));
		System.out.println(link.pollFirst());
		System.out.println(link.pollLast());
		System.out.println(link.size());
		System.out.println(link.add("Mahesh"));
		
		System.out.println("remove last");
		System.out.println( link.removeLast());
		
		System.out.println("remove first");
		System.out.println(link.removeFirst());
	
		
		
		System.out.println("________using iterator_______");
		
		Iterator itr=link.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
		System.out.println("___Using for each");
		
		for(Object list:link) {
			System.out.println(list);
		}
		
	}
}

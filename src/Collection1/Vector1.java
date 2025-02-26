package Collection1;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		
		Vector v=new Vector();
		
		v.add("Shubham");
		v.add("Sasane");
		v.add(232);
		v.add('A');
		v.add(33.22f);
		v.add(null);
		v.add(null);
		v.add("Shubham");
		
		
		System.out.println(v);
		System.out.println(v.isEmpty()); //false
		System.out.println(v.indexOf("Shubham"));   //0
		System.out.println(v.lastIndexOf("Shubham"));//7
		System.out.println(v.contains(232)); //true
		System.out.println(v.get(4));//33.22
		
		System.out.println("___add _____--");
		
		v.add(3, 'B');
		
		System.out.println(v);
		
		System.out.println("______Replace_____");
		
		v.set(3, 'C');
		
		System.out.println(v);
		
		System.out.println("______Remove________");
		
		v.remove(3);
		
		System.out.println("using enumeration cursor");
		
		Enumeration enu=v.elements();
		
		while(enu.hasMoreElements()) {
			
			System.out.println(enu.nextElement());
		}
		
		System.out.println("___Using for loop___-");
		
		for(int i=0;i<=v.size()-1;i++) {
			System.out.println(v.get(i));
		}
		
		System.out.println("______using for each loop_______");
		
		for(Object set:v) {
			System.out.println(set);
		}
		
		System.out.println("_____Using iterator cursor_____");

		Iterator itr=v.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
				
		System.out.println("___Using list iterator_______");
		
		
		ListIterator list=v.listIterator();
		
		while(list.hasNext()){
			
			
			System.out.println(list.next());
		}
				
		
		
		
		
		
	}
}

package Collection1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashSet1 {

public static void main(String[] args) {
		
        TreeSet hash=new TreeSet();
		
		hash.add("Shubham");
		hash.add("Sasane");
		//hash.add(null);
		hash.add(2332);
		hash.add('A');
		//hash.add("Sasane");
		//hash.add(null);
		hash.add(23.23f);
		
		System.out.println(hash);
		
		System.out.println(hash.contains("Sasane"));
		System.out.println(hash.size());

		
		hash.add(232);
		System.out.println(hash);
		
		hash.remove("Shubham");
		System.out.println(hash);
		
		System.out.println(hash.isEmpty());
		
		System.out.println("___For each_____");
		
		for(Object list:hash) {
			System.out.println(list);
		}
		
		System.out.println("________Iterator________");
		
		Iterator itr=hash.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}
}

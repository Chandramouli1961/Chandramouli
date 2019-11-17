package co.edureka.util;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		 TreeSet<String> names = new TreeSet<>();
		 System.out.println(names.add("Sunil")); //true
		 names.add("Anil");
		 System.out.println(names.add("Sunil")); //false
		 names.add("Rahul");
		 names.add("Srinivas");
		 names.add("Aby");
		 names.add("Chirag");
		 
		 System.out.println(names);
		 
		 names.add(null);
		 System.out.println(names);
	}
}

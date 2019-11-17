package co.edureka.util;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetTest1 {

	public static void main(String[] args) 
	{
		 TreeSet<String> names = new TreeSet<>(new MyComparator());
		 
		 System.out.println(names.add("Sunil")); //true
		 names.add("Anil");
		 System.out.println(names.add("Sunil")); //false
		 names.add("Rahul");
		 names.add("Srinivas");
		 names.add("Aby");
		 names.add("Chirag");
		 
		 System.out.println(names);
	}
}

class MyComparator implements Comparator<String>
{
	@Override
	public int compare(String o1, String o2) {
		return o2.compareTo(o1);
	}  	
}
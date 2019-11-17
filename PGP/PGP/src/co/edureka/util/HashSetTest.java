package co.edureka.util;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest 
{
	public static void main(String[] args) throws Exception
	{
	 HashSet<String> names = new HashSet<>();
	 System.out.println(names.add("Sunil")); //true
	 names.add("Anil");
	 System.out.println(names.add("Sunil")); //false
	 names.add("Rahul");
	 names.add("Srinivas");
	 
	 System.out.println(names);
	 
	 Iterator<String> it = names.iterator();
	 while(it.hasNext()) 
	 {
		 String name = it.next();
		 System.out.println(name);
		 Thread.sleep(1000);
	 }
	 
	 names.add(null);
	 System.out.println(names);
	}
}

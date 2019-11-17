package co.edureka.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMethods 
{
	public static void main(String[] args) 
	{
	 ArrayList<String> names = new ArrayList<String>();
	 System.out.println(names+" | Size = "+ names.size());
	 
	 names.add("Sunil");
	 names.add("Anandhu");
	 names.add("Ankur");
	 names.add("Anurag");
	 names.add("Sunil");
	 names.add("Deepak");
	 System.out.println(names+" | Size = "+ names.size());
	 
	 names.add(1,"Sunil");
	 names.set(1,"Manju");
	 System.out.println(names+" | Size = "+ names.size());
	 
	 System.out.println("Person @ location 0 = "+ names.get(0));
	 
	 System.out.println("Index of Sunil = "+ names.indexOf("Sunil"));
	 System.out.println("Last Index of Sunil = "+ names.lastIndexOf("Sunil"));
	 System.out.println(names+" | Size = "+ names.size());
	 
	 System.out.println("Is Sunil Removed = "+ names.remove("Sunil"));
	 System.out.println(names+" | Size = "+ names.size());
	 System.out.println("Removed element @ 0 = "+ names.remove(0));
	 
	 System.out.println("Is Sunil in list = "+ names.contains("Sunil"));
	 System.out.println(names+" | Size = "+ names.size());
	 
	 Integer[] marks = new Integer[]{85,76,93,80,45};
	 List<Integer> marksList = Arrays.asList(marks);
	 System.out.println(marksList);
	}
}

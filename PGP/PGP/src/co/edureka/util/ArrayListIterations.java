package co.edureka.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListIterations 
{
	public static void main(String[] args) 
	{
	 ArrayList<Integer> al = new ArrayList<>();
	 
	 for(int i=11;i<=16;i++)
	 {
	   al.add(i); //boxing	 
	 }
     System.out.println(al);
     
     iterate1(al);
     separator();
     
     iterate2(al);
     separator();
     
     iterate3(al);
     separator();
     
     iterate4(al);
     separator(); 
     
     iterate5(al);
     separator();      
	}//main
	
	static void iterate1(List<Integer> data)
	{
	 System.out.println("<<<Iteration using for loop & get() - only for List");
	 for(int i=0;i<data.size();i++)
	 {
		 Integer n = data.get(i);
		 System.out.print(n+" | ");
	 }
	}
	
	static void iterate2(List<Integer> data)
	{
	  System.out.println("<<<Iteration using enhanced for loop");
	  for(Integer n : data)
	  {
		System.out.print(n+" | ");  
	  }
	}
	
	static void iterate3(List<Integer> data)
	{
	 System.out.println("<<<Iteration using java.util.Iterator");
	 Iterator<Integer> it = data.iterator();
	 while(it.hasNext())
	 {
		Integer n = it.next();
		System.out.print(n+" | ");
	 }
	}

	static void iterate4(List<Integer> data)
	{
	 System.out.println("<<<Iteration using java.util.ListIterator - only for List");
	 ListIterator<Integer> it = data.listIterator();
	 while(it.hasNext())
	 {
		Integer n = it.next();
		System.out.print(n+" | ");
	 }
	 separator();
	 while(it.hasPrevious())
	 {
		Integer n = it.previous();
		System.out.print(n+" | ");
	 }
	}
	
	static void iterate5(List<Integer> data)
	{
	  System.out.println("<<<Iteration using java.util.Enumeration");	
	  Enumeration<Integer> en = Collections.enumeration(data);
	  while(en.hasMoreElements())
	  {
		 Integer n = en.nextElement();
		 System.out.print(n+" | ");
	  }
	}
	
	static void separator()
	{
	  System.out.println("\n");
	  try {
		  Thread.sleep(1300);
	  }catch(Exception ex) {}
	}
}

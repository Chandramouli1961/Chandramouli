package co.edureka.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest 
{
	public static void main(String[] args) throws Exception
	{
	  HashMap<String,Float> bank = new HashMap<String,Float>();
	  
	  System.out.println(bank.put("Sunil",25000.5f)); //null
	  System.out.println(bank.put("Sunil",11500.5f)); //25000.5
	  bank.put("Anil",50000f);
	  bank.put("Naveen",78500f);
	  bank.put("Shankar",25000f);
	  
	  System.out.println(bank);
	  
	  float bal = bank.get("Sunil");
	  System.out.println("Balance Amount in Sunil = "+ bal);
	  
	  bal = bal+1500.5f;
	  bank.put("Sunil", bal);
	  System.out.println(bank);
	  
	  System.out.print("A/C Holders = ");
	  Set<String> keys = bank.keySet();
	  for(String name : keys) {
		  System.out.print(name+" | ");
	  }
	  System.out.println();
	  
	  //to iterate on the entries of Map
	  Set<Map.Entry<String,Float>> entries = bank.entrySet();
	  Iterator<Map.Entry<String,Float>> it = entries.iterator();
	  while(it.hasNext())
	  {
  	    Map.Entry<String,Float> entry = it.next();
  	    String name = entry.getKey();
  	    float val = entry.getValue();
  	    System.out.println(name+" : "+val);
  	    try {
  	    	Thread.sleep(1000);
  	    }catch(Exception ex) {}
	  }
	}
}

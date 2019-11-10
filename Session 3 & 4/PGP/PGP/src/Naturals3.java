public class Naturals3 
{
	public static void main(String[] args) 
	{
		printNaturals(); //method call
	}
	
	/*method definition*/
	static void printNaturals() 
	{
	  System.out.println("First 10 Natural Numbers are:");
	  for(int i=1;i<=10;i++) 
	  {
		  if(i==1)
			  System.out.print(i);
		  else
			  System.out.print(", "+i);
	  }
	}

}

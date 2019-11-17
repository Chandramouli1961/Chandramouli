class Except4 
{
	public static void main(String[] args) 
	{
		try{
			int x = Integer.parseInt(args[0]);
			int y = Integer.parseInt(args[1]);

			int z = x/y;
			System.out.println("Result = "+ z);
		}
		catch(Exception ex){
			System.out.println("Exception Occured!");
			System.out.println("Message: "+ ex.getMessage());
			System.out.println(ex.toString()); 
			ex.printStackTrace(); //toString()+ callstack
		}

		System.out.println("** DONE **");
	}
}

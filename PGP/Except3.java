class Except3 
{
	public static void main(String[] args) 
	{
		try{
			int x = Integer.parseInt(args[0]);
			int y = Integer.parseInt(args[1]);

			int z = x/y;
			System.out.println("Result = "+ z);
		}
		catch(ArithmeticException ex){
			System.out.println("Cannot divide a number by zero");
		}
		catch(ArrayIndexOutOfBoundsException ex){
			System.out.println("Please provide min 2 cmd args");
		}
		catch(NumberFormatException ex){
			System.out.println("Please provide numbers as cmd args");
		}
		System.out.println("** DONE **");
	}
}
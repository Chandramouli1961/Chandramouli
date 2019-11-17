final class A{
 final void display(){}
}
class B extends A{
 void display(){}
}


class FinalTest 
{
	//final FinalTest(){}
	final int n = 26; //instance variable
	public static void main(String[] args) 
	{
		final int n = 25;
		System.out.println(n);
		//n = 25; //error: cannot assign a value to final variable n
		System.out.println(n);

		FinalTest obj = new FinalTest();
		System.out.println(obj.n);
		//obj.n=27; //CE
		System.out.println(obj.n);
	}
}

class Account{
	long acno;
	String name;
	float bal;
	
	public Account(long acno, String name, float bal) {
		this.acno = acno;
		this.name = name;
		this.bal = bal;
	}

	@Override
	public String toString() {
		return "Account [A/C No=" + acno + "| Name=" + name + ", Balance=" + bal + "]";
	}	
	
}

public class OverridingTest1 
{
	public static void main(String[] args) 
	{
		Account acc = new Account(1000234,"Sunil Joseph", 25000.5f);
		System.out.println(acc); //toString()
	}
}

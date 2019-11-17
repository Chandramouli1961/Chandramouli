class BankTest 
{
	public static void main(String[] args) 
	{
		BankInter bank = new SBI();
		bank.deposit(1000);
		bank.withdraw(1000);

		bank = new ICICI();
		bank.deposit(1000);
		bank.withdraw(1000);
	}
}

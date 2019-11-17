import java.util.Scanner;
class Bank 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Account acc = null;
		while(true)
		{
		 System.out.println("1. Create A/C");
		 System.out.println("2. Deposit");
		 System.out.println("3. Withdraw");
		 System.out.println("4. Balance");
		 System.out.println("5. Exit");

		 System.out.print("enter an option: ");
		 int opt = sc.nextInt();
		 System.out.println("--------------------------");
		 
		 switch(opt){
          case 1: //create a/c
		   if(acc == null){
             System.out.print("enter A/C No: ");
			 long acno = sc.nextLong(); 
			 sc.nextLine();
			 System.out.print("enter name: ");
			 String name = sc.nextLine();
			 System.out.print("enter initial deposit: ");
			 float amt = sc.nextFloat();
			 /*create account*/
			 acc = new Account(acno,name,amt);
			 System.out.println("Account Opened!");
		   }
		   else{
			   System.out.println("FYI: A/C is already created!");
		   }
		   break;

		   case 2: //deposit
		    if(acc != null){
				System.out.print("enter amount to deposit: ");
				float amt = sc.nextFloat();
				acc.deposit(amt);
			}
			else{
				System.out.println("FYI: Create A/C first..");
			}
		    break;

		   case 3: //withdraw
		    if(acc != null){
				System.out.print("enter amount to withdraw: ");
				float amt = sc.nextFloat();
				acc.withdraw(amt);
			}
			else{
				System.out.println("FYI: Create A/C first..");
			}
		    break;

		   case 4: //balace
		    if(acc != null){
				acc.getBalance();
			}
			else{
				System.out.println("FYI: Create A/C first..");
			}
		    break;

		   case 5: //terminate application
			sc.close();
			System.out.println("** BYE BYE **");
			System.exit(0); //to termiate the application
		    break;
		  
		   default:
			   System.out.println("Invalid Option.. Try Again..");
		 }//switch
		 System.out.println("--------------------------");
		}//while
	}
}

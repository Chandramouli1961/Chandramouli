package co.edureka.io;

import java.io.File;
import java.io.PrintStream;

public class AccountDetails {

	public static void main(String[] args)throws Exception {
		String acc1="1001,Sunil,25000";
		String acc2="1002,Manju,50000";
		String acc3="1003,Rahul,40000";
		
		File file = new File("src/accounts.txt");
		PrintStream ps = new PrintStream(file);
		
		ps.println(acc1);
		ps.println(acc2);
		ps.println(acc3);
		ps.close();
	}

}

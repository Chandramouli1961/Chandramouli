package co.edureka.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class ReadAccounts 
{
	public static void main(String[] args) throws Exception
	{
		  BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("src/accounts.txt")));
		  
		  String line = br.readLine();
		  while(line != null)
		  {
			  String[] details = line.split(",");
			  System.out.println("A/No: "+details[0]+" | Name: "+details[1]+" | Balance: "+details[2]);
			  
			  line = br.readLine();
			  Thread.sleep(2000);
		  } 

	}

}

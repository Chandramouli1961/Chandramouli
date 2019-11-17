package co.edureka.except;

import java.sql.SQLException;

class MyClass{
  public void logic() throws SQLException
  {
	  System.out.println("logic method..");
  }
}

public class ThrowsTest
{
	public static void main(String[] args) throws SQLException
	{
	  MyClass obj = new MyClass();
	 // try {
	   obj.logic();
	 // }catch(Exception ex) {}
	}
}

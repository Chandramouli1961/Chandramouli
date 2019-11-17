package co.edureka.util;

import java.util.HashSet;
import java.util.Scanner;

public class CoursesList {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		HashSet<String> courses = new HashSet<>();
		String req = "Y";
		while(req.equalsIgnoreCase("Y"))
		{
		 System.out.print("enter course name: ");
		 String cname = sc.nextLine();
		 boolean stat = courses.add(cname);
		 if(!stat)
			 System.out.println("\""+cname+"\" is already in List");
		 
		 System.out.print("Have more courses [Y/N]: ");
		 req=sc.nextLine();
		} //while
		
		System.out.println(courses);
	}
}

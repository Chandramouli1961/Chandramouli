package co.edureka.io;

import java.io.FileOutputStream;

public class WriteToFile 
{
 public static void main(String[] args) throws Exception 
 {
   FileOutputStream fout = new FileOutputStream("src/edureka.txt");
  //FileOutputStream fout = new FileOutputStream("src/edureka.txt", true);
   
   String text = "edureka is into online trainings 24/7 ";
   byte[] b = text.getBytes(); //to convert String to byte[]
   fout.write(b);
   System.out.println("file saved!");
   
   fout.close();
 }
}

package co.edureka;

import java.util.Arrays;

public class ArrayMerging 
{
	public static void main(String[] args) 
	{
	 int[] array1 = new int[] {12,14,16,18,20,22,24,26};
	 int[] array2 = new int[] {11,13,15,17};
	 
	 int[] array3 = new int[array1.length+array2.length];
	 
	 int i=0,j=0,k=0;
	 while(i<array1.length && j<array2.length)
	 {
	  if(array1[i]<array2[j])
	    array3[k++] = array1[i++];
	  else
		array3[k++] = array2[j++];  
	 }
	 
	 for(;i<array1.length;i++)
		 array3[k++]=array1[i];
	 
	 for(;j<array2.length;j++)
		 array3[k++]=array2[j];
	 
	 System.out.println("Array-1 = "+ Arrays.toString(array1));
	 System.out.println("Array-2 = "+ Arrays.toString(array2));
	 System.out.println("Array-3 = "+ Arrays.toString(array3));
	 /*
	 int[] test = {25,78,42,61,3,10};
	 System.out.println(Arrays.toString(test));
	 Arrays.sort(test);
	 System.out.println(Arrays.toString(test));
	 */
	}
}

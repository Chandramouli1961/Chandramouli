
public class ArrayInitialization {

	public static void main(String[] args) {
		int[] marks = {93,85,92,76,83,90};
		
		System.out.println("No of Subjects = "+ marks.length);
		
		for(int i=0;i<marks.length;i++) {
			System.out.println("Subject-"+(i+1)+" = "+ marks[i]);
		}
		
		/*Array Iteration using enhanced for loop*/
		System.out.println("Marks Obtained:");
		for(int mark : marks)
		{
		  System.out.print(mark+ " | ");	
		}
		System.out.println();
		
		System.out.println(marks[6]); //java.lang.ArrayIndexOutOfBoundsException
	}
}

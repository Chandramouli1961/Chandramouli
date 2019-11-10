
public class StringMethods {

	public static void main(String[] args) {
		String str = "edureka limited";
		
		System.out.println("Size = "+ str.length()); //15
		System.out.println("Char @ index 0 = "+ str.charAt(0)); //e
		
		System.out.println(str.replace('e', '*')); //*dur*ka limit*d
		
		System.out.println("Index of e = "+ str.indexOf("e")); //0
		System.out.println("Index of e from location 1 = "+ str.indexOf("e",1)); //4
		System.out.println("Last Index of e = "+ str.lastIndexOf("e")); //13
		System.out.println("Index of ex = "+ str.indexOf("ex")); //-1
		
		System.out.println(str.startsWith("eka",4)); //true
		System.out.println(str.endsWith("ted")); //true
		
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		
		System.out.println(str.substring(8)); //limited
		System.out.println(str.substring(8,11)); //lim
	}
}

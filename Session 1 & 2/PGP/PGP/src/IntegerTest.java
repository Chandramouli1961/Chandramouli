
public class IntegerTest {

	public static void main(String[] args) {
		//byte b = 128; //Type mismatch: cannot convert from int to byte
		byte b = 126;
		System.out.println(b); //126
		
		b = (byte)128;
		System.out.println(b); //-128
		
		b = (byte)300;
		System.out.println(b); //44
		
		long pop = 9898985692L;
		System.out.println("World Population = "+ pop);
		
		int n = (int)25L;
		System.out.println(n);
	}
}
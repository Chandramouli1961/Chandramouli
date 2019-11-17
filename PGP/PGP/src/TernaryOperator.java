
public class TernaryOperator {

	public static void main(String[] args) {
		int x=10,y=20,lar;
		/*
		if(x>y) {
			lar = x;
		}
		else {
			lar = y;
		}
		*/
		lar = (x>y)?x:y;
		System.out.println("Largest = "+ lar);
	}
}


public class SBTest {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb+" |Size="+sb.length()+" |Capacity="+sb.capacity());
		
		sb.append("edureka limited");
		System.out.println(sb+" |Size="+sb.length()+" |Capacity="+sb.capacity());
		
		sb.insert(0, "***");
		System.out.println(sb+" |Size="+sb.length()+" |Capacity="+sb.capacity());
	
		System.out.println(sb.reverse());
		
		String s ="edureka";
		System.out.println(s.contentEquals(sb));
	}
}

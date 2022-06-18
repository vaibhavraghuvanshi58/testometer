package training;

public class String2 {
	public static void main(String[] args) {
		String s1 = "test"; // 1
		String s2 = new String("test"); // 2 
		String s3 = "test"; // 2
		String s4 = new String("test"); // 3 

		
		System.out.println(s1 == s2);
		System.out.println(s3 == s1);
		System.out.println(s2 == s4);
		
		//  == operator ref compare
		
		
		// value
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s1));
		System.out.println(s2.equals(s4));
		
		
		
		// Interning = object -> literal
		
		s2 = s2.intern();
		System.out.println(s1 == s2);
		
		s4 = s4.intern();
		
		System.out.println(s1 == s2);
		System.out.println(s3 == s1);
		System.out.println(s2 == s4);
		
		// Conversion
		
		//	int, float, double
		int k = 23;
		String kString = String.valueOf(k);
		System.out.println(kString);
		System.out.println(kString.length());
		
//		String.valueXXX 
		
	}
}

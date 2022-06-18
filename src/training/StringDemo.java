package training;

public class StringDemo {
	public static void main(String...args) {
		String s1 = "test";
		String s2 = "test";
		String s3 = "test";
		String s4 = "test1";
		
		System.out.println(s1.length());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		// String - array of character
		char[]  ch = s1.toCharArray();
		for(char c : ch) {
			System.out.println(c);
		}
		
		String a = "Hello this is selenium class";
		String[] splits = a.split(" ");
		System.out.println(splits.length);
		for(String y : splits) {
			System.out.println(y);
		}
		
		
		System.out.println(a.subSequence(5, 8));
		
	}
}

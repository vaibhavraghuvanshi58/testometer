package training;

public class OverloadingDemo {
	
	public OverloadingDemo() {
	
	}
	
	public OverloadingDemo(int i) {
		
	}
	
	public OverloadingDemo(int i , int j) {
		
	}
	
	
	// polymorphism - 
	
	public static void main(String[] args) {
		System.out.println(add(3,4,7));
		System.out.println(add(3,4,7,5));
		System.out.println(add(3));
		System.out.println(add(3,4));
		
		String s = "test";
	}
	
//	public static int add(int i , int j) {
//		return i+j;
//	}
//	
//	public static int add(int i , int j, int k) {
//		return i+j+k;
//	}
//	
//	
//	public static int add(int i , int j, int k, int m) {
//		return i+j+k+m;
//	}
//
//	public static int add(int i , int j, int k, int m, int n) {
//		return i+j+k+m+n;
//	}
	// when we dont know how many arguments we can send
	// varargs = various + arguments 
	
	public static int add(int...v) {
		int k =0;
		for(int i = 0 ; i < v.length ;i++) {
			k = k + v[i];
		}
		return k;
	}
	
	
	
	
	// when we have same name method, but different number of parameter 
	//	and differnt type of param - overloading (Compile type polymorphism )
	
	
	
	
}

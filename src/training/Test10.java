package training;

public class Test10 {

}


class Test10Test{
	public static void main(String[] args) {
		     
		int m = 10;
		
		Test10 l1 = new Test10();
		Test10 l2 = l1;
		
		l1 = null;
		l2= null;
		
		Test10 l3 = new Test10();
l3 = null;
		
		
		System.out.println(l1);
		System.out.println(l2);
		
		System.out.println(l3);
		
		// Garbage collector manually 
		System.gc();
		Runtime.getRuntime().gc();
		
	}
}

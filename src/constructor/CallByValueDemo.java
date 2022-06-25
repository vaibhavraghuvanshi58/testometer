package constructor;

// single line comment
/*
 * static variable
 * static blocks
 * static methods
 * instance variables
 * instance block
 * non-static method
 * 
 */

public class CallByValueDemo {

	int k = i;
	static int i = 10; 
	
	
	
	public static void main(String[] args) {
		System.out.println("i am main method");
		CallByValueDemo c1 = new CallByValueDemo();
		CallByValueDemo c2 = new CallByValueDemo();
		CallByValueDemo c3 = new CallByValueDemo();	
	}
	
	static {
//		System.exit(1);
		System.out.println("i am static block 1");
	}
	
	static {
		System.out.println("i am static block 2");
	}
	
	//instance block
	{
	System.out.println("i am instance block");	
	}
	
	public static void main1(String[] args) {
		int i = 40;
		check(i);
		//System.out.println(i);
		
		
		Human h1 = new Human();
		h1.age = 20;
		changeAge(h1);
		System.out.println(h1.age);
		
	}
	
	/**
	 * xyz comment   - testmeter session
	 * @param i
	 */
	public static void check(int i) {
		i = 10;
	}

	public static void changeAge(Human h1) {
		h1.age = 40;
	}
	
	// when we use datatype as argument - copy of that variable
	// call by value = copy of variable
	
	// Call by Ref  = Objects, no Copy created .
	
	
}

class Human{
	int age;
}



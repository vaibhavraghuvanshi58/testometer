package training;


public class BHK1 {
	int numberOfRoom ;
	String flatNumber;
	static int numberOfLift;
	
	// those variable which goes with object - instance variable
	// outside method and inside class
	
	// static variable - outside method and inside class but with static keyword
	// static - shared resource 
	// static variable never depends on objects. 
	// class variables, we can directly call them using class name.variable name
	
	
	// non static method can access static and instance variable
	void m1() {
		System.out.println("m1 value");
		numberOfLift++; 
		numberOfRoom++;
	}
	
	
	static void m2() {
		System.out.println("m2 value");
		numberOfLift++; 
	}
	
}


class BHKS{
	
	int k; // instance variable
	
	public static void main(String[] args) {
		int l;
		
		//BHK1.m2();
		
		BHK1 a1 = new BHK1();
		a1.numberOfRoom = 1;
		a1.flatNumber = "A1";
		a1.numberOfLift = 2;
		a1.m1();
		a1.m2();
		
		BHK1 b2 = new BHK1();
		b2.numberOfRoom =2;
		b2.flatNumber = "B2";
		b2.numberOfLift = 3;
		
		BHK1.numberOfLift = 45;
		
		System.out.println(a1.flatNumber); // A1
		System.out.println(b2.flatNumber); // B2
		System.out.println(a1.numberOfLift);
		
	}
}

package constructor;

public class ConstructorDemo {
	
	public static void main(String[] args) {
		
//		A a1 = new A(10); // 
//	 B b1 = new B(10);
//	 System.out.println(b1.i);
		C c1  = new C(20);
		System.out.println(c1.i);
	}
	
}

class C{
	// every class has default constructor
	// but we we create constructor explicit. then default nature is gone
//	this - point to object (instance)
	int i = 5; // instance 
	
	C(int i){ // local variables
		this.i = i;
	}
}



// Construct - help to create object 
class A{
	
	// 1 - construtor name must same as class Name
	// 2 - no return type
	
	// Constructor
	
	A(int i){
	   System.out.println("hello i am a construstor " + i);	
	}
	
	// Method
	void A() {
		
	}
}


class B{
	int i ; // instance
	
	
	B(int k){
		i = k;
		System.out.println("hello");
	}
	
	
}
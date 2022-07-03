package inheritance;

public class InheritanceDemo {
	
	
	
	
}

class C{
	public void test_c() {
		
	}
}

class A extends C{
	public void test_a() {
		
	}
}

class D extends A{
	
}


class B extends A{
	public void test_b() {
	
		test_a();
		test_c();
		
//		A a1 = new A(); // B Class HAS A Class Object // HAS-A RELATIONSHIP
//		a1.test_a();
//		
	}
}


// Using inheritance 
// parent properties/ attribute -> child 
// IS-A Relationship 
// Inheritance is one-directional
// one clss cannot extend more then one class (multiple inheritance)
// not allowed in java

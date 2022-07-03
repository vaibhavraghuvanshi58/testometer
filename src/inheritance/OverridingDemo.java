package inheritance;

public class OverridingDemo {
public static void main(String[] args) {
	M2 m1 = new M2();
	m1.kaju_katli();
}
}


class M1 {
	public void kaju_katli() { // abc 
		System.out.println("M1");
	}
}

class M2 extends M1{
	public void kaju_katli() { // abc + d 
		System.out.println("M2");
	}
	
	
}


// when parent and child class have same method signature, 
// child class override parent method
// also it will have increased or same visibility

// private - with in class
// default - with in package
// protected - within package + extended class
// public - anywhere

//  final method cannot be overridden

// We cannot extends final class
// FINAL Class only have HAS A Relationship

// can static method overridden - No.
// Runtime polymorphism
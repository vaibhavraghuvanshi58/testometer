package inheritance;

public class HOWITWORKSDEMO {
	public static void main(String[] args) {
		A3 a3= new A3();
		
	}
}


class A1{
	A1(){
		System.out.println("A1 Constructor");
	}
	public void test_a1() {

	}

}

class A2 extends A1{
	A2(){
		System.out.println("A2 Constructor");
	}
	public void test_a2() {

	}
}

class A3 extends A2{
	A3(){
		System.out.println("A3 Constructor");
	}
	public void test_a3() {

	}
}


// Constructor - Chaining

// every class has a parent class -> Object
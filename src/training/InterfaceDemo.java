package training;

public class InterfaceDemo {
public static void main(String[] args) {
	abc1 a1 = new Student1();
	a1.question1();
}
}


interface abc1{
	public void question1();
	public void question2();
}


interface xyz{
	public void question3();
	public void question1();
}

// we can implements as much as possible interfaces
// one class can extends another
// can one interface extends another interface ?
// variable inside interface always static and final 
// interface name. variable name

interface p1{
	int t = 10;
	public void p1Method();
}
interface p2{
	int t = 45;
}


class MKL implements p1,p2{
	public void p1Method() {
		System.out.println(p2.t);
	}
}


class Student1 implements abc1,xyz{

	public void question1() {
		System.out.println("s1.answer1");
	}

	public void question2() {
		System.out.println("s1.answer2");
	}
	
	public void question3() {
		System.out.println("s1.answer3");
	}
}

class Student2 implements abc1{

	public void question1() {
		System.out.println("s2.asnwer1");
	}

	public void question2() {
		System.out.println("s2.asnwer2");		
	}

}


interface PaymentGateway{
	public void interest();
}

class Bank6 implements PaymentGateway{

	public void interest() {
		System.out.println("4.5");	
	}
	
	public void myMethod() {
		
	}
	
}


class HJ{
	public static void main(String[] args) {
		PaymentGateway k = new Bank6();
	
	}
}


//packaging 
// jar file - java arc




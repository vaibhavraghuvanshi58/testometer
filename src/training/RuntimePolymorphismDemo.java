package training;

public class RuntimePolymorphismDemo {
	public static void main(String[] args) {
		M1 m1 = new M2();
		m1.m1();

		Bank bank = new ABC();
		bank.interest();

		// abstract class - always extends - IS-A Relationship
		// finalclass - always object - HAS-A Relationship
		
	}
}



 abstract class Bank{
	Bank(){
		
	}
	 public abstract void interest();
	
	public void home_loan() {
		System.out.println("home loan");
	}
	
}


class HDFC extends Bank{
	
	HDFC(){
		
	}
	
	public void interest() {
		System.out.println("5.6");
	}
}





class ICICI extends Bank{
	public void interest() {
		// logic
		System.out.println("6.0");
	}
}


class ABC extends Bank{
	
	public void interest() {
		System.out.println("7.0");
	}

}



class M1{
	public void m1() {
		System.out.println("m1.m1");
	}

}

class M2 extends M1{
	public void m1() {
		System.out.println("m2.m1");
	}
	public void m2() {
		System.out.println("m2.m2");
	}
}


// Importance of Runtime polymorphism

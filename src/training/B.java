package training;

public class B {
	public static void main(String[] args) {
		// Comparison Operators

		int i = 10;
		int j = 9;
		//	System.out.println(i < j);
		//	System.out.println(i <= j);
		//	System.out.println(i > j);
		//	System.out.println(i >= j);
		//	System.out.println(i == j);
		//	System.out.println(i != j); // not equal


		// Bitwise operator

		//	AND , OR

		System.out.println((i < j) && (i > j));
		System.out.println((i < j) || (i > j));

		// logical operator


		//	assignment oprtator
		i = i + 5; // 
		i+=5;
		i-=5;
		i%=5;
		i/=5;
		i*=5;

		// ternary operator
		//?:


		// age > 18 = adult
		// age < 18 = child

		int age = 23;
		String cat = "";
		if(age > 18) {
			cat = "adult";
		}else {
			cat = "child";
		}
		System.out.println(cat);	 
		String cat1 = age >  18 ? "adult" : "child";


		// age < 18 = child
		// age > 18 && age < 30 = young
		// age > 30 && age < 40 = adult
		// age > 40 = old

		if(age < 18) {
			
		}else if(age > 18 && age < 30) {
			// young
		}else if(age >  30 && age < 40) {
			// adult
		}else {
			// old
		}

		
		
		// Java is Blocking language
		
		
	}
}


//package 

//C:\ProgramData\Learning\workspace\testometer\training\src



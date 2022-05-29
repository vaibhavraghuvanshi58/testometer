package training;

public class A {
	public static void main(String[] args) {
		
		int i = 12;
//		int j = 10;
		
//		System.out.println(i+j); // 22
//		System.out.println(i-j); // 2
//		System.out.println(i*j); // 120
//		System.out.println(i/j); // 1
//		double m = (double)i/(double)j;
//		System.out.println(m);
//		System.out.println(i%j); // 2
		// 3/2 = 1 (odd) , 4/2 = 0 (even) , 20%3 = 2
		
//		i = i+1;  // increment 
//		System.out.println(i);
//		i++; // i = i +1
//		System.out.println(i);
		// increment operator  ++
		
		
//		post increment = first assign then increase
//		pre increment  = first increase then assign
		
//		++i; // pre increment
//		i++; // post increment
		

		int k = ++i + i++ + i++ + --i + i--;
	          //   13  +13 + 14 + 14 + 14

		
		// shortcut 
		// jaha variable dikhe value likh do , jaha increment dikhta wala increase kar do
		
		
		System.out.println(k); 
		System.out.println(i);
		
		
	}
}
 
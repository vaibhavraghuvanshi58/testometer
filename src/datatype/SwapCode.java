package datatype;

import training.Human;

public class SwapCode {
	public static void main(String[] args) {
		
		//swap(10, 20);
	int k = add(9,3);
	System.out.println(k);
	}
	
	
	static void swap(int i, int j){
		i = i + j; 
		j = i - j;
		i = i - j ;
		System.out.println(i);
		System.out.println(j);
		
		
	}
	
	static int add(int i, int j){
		int k = i +j;
		return k;
	}

	
	// variables - instance, static, heap 
}

package training;

public class ArrayDemo {
	
	public static void main(String[] args) {
		// Array Concept
		//  collection of same datatype 
		
		//array object are constant in length
		
		int i[] = new int[5]; // object
		// array starts from 0
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		i[4] = 50;
		
		System.out.println(i.length);
		
		for(int k = 0 ; k < i.length ; k++) {
			System.out.println(i[k]);
		}
		
		
		// for each
		for( int b   :  i ) {
			System.out.println(b);
		}
		

		// 2 D Array
		int[][] marks = new int[15][4];
		
		marks[0][0] = 1;
		marks[0][1] = 23;
		marks[0][2] = 45;
		marks[0][3] = 67;
		
		// 60Dimension
		
		
	}
}

package datatype;

public class SwapCode {
public static void main(String[] args) {
	
	
	int i = 12;
	int j = 14;
	// swap the values  , i = 14, j = 12
 	// i = 12, j = 14
	i = i + j; 
	// i = 26, j = 14
	j = i - j;
	// i = 26, j = 12;
	i = i - j ;
	// i = 14, j = 12
	
	System.out.println(i);
 	System.out.println(j);
 	
 	
}
}

package training;

public class CLADemo {
	public static void main(String[] args) {
		System.out.println("We found " + args.length + " arguments");
		for(String j : args) {
			System.out.println(j);
		}
	}
}

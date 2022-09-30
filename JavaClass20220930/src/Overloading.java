
public class Overloading {
	
	static int sum(int a, int b) {
		return a+b;
	}
	static double sum(double a, double b) {
		return a+b;
	}

	public static void main(String[] args) {
		System.out.println(sum(1,3));
		System.out.println(sum(3.1, 2.4));
	}

}

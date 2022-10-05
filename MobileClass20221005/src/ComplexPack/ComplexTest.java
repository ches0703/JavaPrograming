package ComplexPack;

public class ComplexTest {

	public static void main(String[] args) {

		ComplexNumber n1 = new ComplexNumber();
		ComplexNumber n2 = new ComplexNumber();

		n1.setReal(5);
		n1.setImag(7.2);
		n2.setReal(-3.1);
		n2.setImag(5.7);

		System.out.print("n1 is -> \t");
		n1.printNumber();
		System.out.print("n2 is -> \t");
		n2.printNumber();
		ComplexNumber n3 = n1.add(n2);
		System.out.print("n1 + n2 -> \t");
		n3.printNumber();

		System.out.print("n1 - n2 -> \t");
		n1.subtract(n2).printNumber();

	}

}

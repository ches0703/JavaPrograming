import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int[] array = new int[10];
		System.out.println("10 Positive interger input : ");
		for (int i = 0; i < array.length; i++) {
			array[i] = in.nextInt();
			if (array[i] < 0) {
				System.out.println("Wrong input, Rnter input again!");
				i--;
			}
		}
		System.out.print("Multiple of 5 : ");
		for (int k : array) {
			if (k % 5 == 0) {
				System.out.print(k + " ");
			}
		}

	}

}

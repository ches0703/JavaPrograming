import java.util.Scanner;
public class Exchange {
	public static void main(String[] args) {
		
		final double EXCHANGE_RATE = 1392.49;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the Won : ");
		int won = scanner.nextInt();
		System.out.printf("%d Won is %.2f Dollar",won,(won/EXCHANGE_RATE));
		
		scanner.close();
	}

}


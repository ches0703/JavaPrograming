import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter 3 integer : ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		if(((b+c)<=a)||((a+c)<=b)||((a+b)<=c)) {
			System.out.print("Can't make triangle");
		}
		else {
			System.out.print("Can make triangle");
		}
		scanner.close();
	}

}

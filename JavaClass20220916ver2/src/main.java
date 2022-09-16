import java.util.Scanner;
public class main {
	public static void main(String[] args) {
		
		final double EXCHANGE_RATE = 1392.49;
		Scanner scanner = new Scanner(System.in);
		System.out.print("원화 -> 달러 (1), 달러 -> 원화 (2) : ");
		int choice = scanner.nextInt();
		switch(choice){
			case 1:
				System.out.print("원화 : ");
				System.out.print("-> 달러 : "+(scanner.nextInt()/EXCHANGE_RATE));
				break;
			case 2:
				System.out.print("달러 : ");
				System.out.print("-> 원화 : "+(scanner.nextInt()*EXCHANGE_RATE));
				break;
			default:
				System.out.print("비정상 입력");
		}
	}

}


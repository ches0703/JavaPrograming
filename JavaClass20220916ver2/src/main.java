import java.util.Scanner;
public class main {
	public static void main(String[] args) {
		
		final double EXCHANGE_RATE = 1392.49;
		Scanner scanner = new Scanner(System.in);
		System.out.print("��ȭ -> �޷� (1), �޷� -> ��ȭ (2) : ");
		int choice = scanner.nextInt();
		switch(choice){
			case 1:
				System.out.print("��ȭ : ");
				System.out.print("-> �޷� : "+(scanner.nextInt()/EXCHANGE_RATE));
				break;
			case 2:
				System.out.print("�޷� : ");
				System.out.print("-> ��ȭ : "+(scanner.nextInt()*EXCHANGE_RATE));
				break;
			default:
				System.out.print("������ �Է�");
		}
	}

}


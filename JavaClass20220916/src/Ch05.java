import java.util.Scanner;

public class Ch05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("������ 3���� ���� �Է� : ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		if(((b+c)>a)||((a+c)>b)||((a+b)>c)) {
			System.out.print("�ﰢ���� �˴ϴ�");
		}
		else {
			System.out.print("�ﰢ���� �ȵ˴ϴ�");
		}
		scanner.close();
	}

}

import java.util.Scanner;
public class Ch03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("2�ڸ��� ������ �Է� : ");
		int num = scanner.nextInt();
		if((num/10)==(num%10)) {
			System.out.print("10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
		}
		else{
			System.out.print("10�� �ڸ��� 1�� �ڸ��� �ٸ��ϴ�.");
		}
		
		scanner.close();
	}

}

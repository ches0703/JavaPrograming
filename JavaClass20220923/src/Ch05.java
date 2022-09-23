import java.util.Scanner;
import java.util.InputMismatchException;
public class Ch05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dividend; // ������
		int divisor; // ������
		try {
			System.out.print("�������� �Է��Ͻÿ�:");
			dividend = scanner.nextInt(); // ������ �Է�
			System.out.print("�������� �Է��Ͻÿ�:");
			divisor = scanner.nextInt(); // ������ �Է�
		}
		catch(InputMismatchException e){
			divisor = 1;
			dividend = 1;
		}
		try{			
			System.out.println(dividend+"�� "+ divisor + "�� ������ ���� " + dividend/divisor + "�Դϴ�.");	
		}
		catch(ArithmeticException e){
			System.out.println("0���� ���� �� ����");
			divisor = 1;
			System.out.println(dividend+"�� "+ divisor + "�� ������ ���� " + dividend/divisor + "�Դϴ�.");	
		}

	
		
		scanner.close();
	}

}

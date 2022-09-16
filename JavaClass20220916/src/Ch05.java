import java.util.Scanner;

public class Ch05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("임의의 3개의 정수 입력 : ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		if(((b+c)>a)||((a+c)>b)||((a+b)>c)) {
			System.out.print("삼각형이 됩니다");
		}
		else {
			System.out.print("삼각형이 안됩니다");
		}
		scanner.close();
	}

}

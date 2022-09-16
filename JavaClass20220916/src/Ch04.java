import java.util.Scanner;
public class Ch04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("임의의 3개의 정수 입력 : ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		if(a<b) {
			if(b<c) {
				System.out.print("middle : "+b);
			}
			else {
				if(a<c) {
					System.out.print("middle : "+c);					
				}
				else {
					System.out.print("middle : "+a);
				}
			}
		}
		else {
			if(b<c) {
				if(c<a) {
					System.out.print("middle : "+c);
				}
				else {
					System.out.print("middle : "+a);
				}
			}
			else {
				System.out.print("middle : "+b);
			}
		}
		
		
		scanner.close();
	}

}

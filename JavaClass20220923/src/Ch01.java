// Training For While
import java.util.Scanner;
public class Ch01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		// 1 to 10 sum For
		int sum = 0;
		for(int i = 1; i<11; i++) {
			sum += i;
		}
		System.out.println("1 to 10 sum : " + sum);
		
		// Avg While
		
		sum = 0;
		int count = 0;
		System.out.println("Input Integer : ");
		int input = in.nextInt();
		sum += input;
		while(input != -1) {
			sum += input;
			input = in.nextInt();
			count++;
		}
		System.out.println("Avg : " +(double)sum/count);
		
		
		in.close();
		
	}

}

// Iterator Training (for, while, do while)
import java.util.Scanner;
public class Weak0302 {

	public static void main(String[] args) {
		SumOf1To100UsedFor();
		AvgUsedWhile();
		PrintCharUsedDoWhile();
	}
	
	public static void SumOf1To100UsedFor() {
		int sum = 0;
		for(int i=1;i<=100;i++) {
			sum+=i;
		}
		System.out.println("1 ~ 100 까지의 합 : "+sum);
	}
	public static void AvgUsedWhile() {
		Scanner in = new Scanner(System.in);
		int input = 0;
		int count = 0;
		int sum = 0;
		while((input = in.nextInt())>=0) {
			count++;
			sum += input;
		}
		System.out.print("Avg = "+(double)sum/count+"\n");
		in.close();
	}
	public static void PrintCharUsedDoWhile() {
		char c = 'a';
		do {
			System.out.print(c+"\n");
			c++;
		}while(c<='z');
	}
}

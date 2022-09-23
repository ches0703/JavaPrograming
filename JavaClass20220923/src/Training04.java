import java.util.Scanner;

public class Training04 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("10 integer input : ");
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		int min = arr[0];
		for(int k : arr) {
			if( min > k ) {
				min = k;
			}
		}
		System.out.printf("min : %d",min);
	}

}

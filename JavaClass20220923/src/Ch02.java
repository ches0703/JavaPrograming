// Array
import java.util.Scanner;
public class Ch02 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		int max = arr[0];
		for(int k : arr) {
			if( max < k ) {
				max = k;
			}
		}
		System.out.printf("Max : %d",max);
	}

}

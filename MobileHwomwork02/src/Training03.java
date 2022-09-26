import java.util.Scanner;

public class Training03 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int[] arr = new int[10];
		int temp;

		System.out.print("Input 10 integer : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		for (int k : arr) {
			System.out.print(k + ", ");
		}
		
	}

}

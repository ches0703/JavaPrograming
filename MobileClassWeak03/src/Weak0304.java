// Training Array
import java.util.Scanner;
public class Weak0304 {

	public static void main(String[] args) {
		int arr1[] = new int[5];
		arr1[0]=0;
		arr1[1]=10;
		arr1[2]=20;
		arr1[3]=30;
		arr1[4]=40;
		int arr2[]= {0,1,2,3,4};
		SearchBigNum(arr2);
		AvgArray(arr1);
	}
	
	public static void SearchBigNum(int arr[]) {
		int big_num = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(big_num<arr[i]) {
				big_num = arr[i];
			}
		}
		System.out.println("Big num is : " + big_num);
	}
	
	public static void AvgArray(int arr[]) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter " + arr.length + "integer : ");
		int sum = 0;
		for(int i = 0;i<arr.length;i++) {
			arr[i] = in.nextInt();
			sum += arr[i];
		}
		System.out.println("Avg = " + (double)sum / arr.length);
		for(int k : arr) {
			System.out.print(k + " " );
		}
	}
	
}

// Print 2D Array
public class Training02 {

	public static void main(String[] args) {
		int[][] arr = {
			{1},
			{1,2,3},
			{2},
			{1,2,3,4}
		};
		
		for(int[] k : arr) {
			for(int m : k) {
				System.out.print(m + " ");
			}
			System.out.println();
		}
	
	}

}

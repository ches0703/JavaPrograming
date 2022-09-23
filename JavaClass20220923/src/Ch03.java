// Two dimensions
public class Ch03 {

	public static void main(String[] args) {
		// 정방행렬
		int[][] TD_array = new int[5][5];
		for(int i = 0; i<TD_array.length; i++) {
			for(int j = 0; j < TD_array.length; j++) {
				TD_array[i][j] = i * 10 + j; 
			}
		}
		for(int[] i : TD_array){
			for(int j : i) {
				System.out.printf("%02d ",j);
			}
			System.out.println();
		}
		
		

	}

}

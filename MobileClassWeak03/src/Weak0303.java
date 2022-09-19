//Training continue, break
public class Weak0303 {

	public static void main(String[] args) {

		SumEvenNum();
		
	}
	
	public static void SumEvenNum() {
		int sum = 0;
		for(int i=0;;i++) {
			if(i>100) {
				break;
			}
			if(i%2==1) {
				continue;
			}
			sum += i;
		}
		System.out.println("Sum of Even Num in 1 to 100 : " + sum);
	}
	
}

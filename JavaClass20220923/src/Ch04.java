// Training Args
import java.lang.Double;
public class Ch04 {

	public static void main(String[] args) {
		
		double sum = 0;
		
		for(String s : args) {
			sum += Double.parseDouble(s);
		}

		System.out.print(sum);
		
	}

}

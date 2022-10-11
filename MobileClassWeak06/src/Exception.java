
public class Exception {

	public static void main(String[] args) {
		
		int i;
		
		try {
			i = Integer.parseInt("3.14");			
		}
		catch (NumberFormatException e) {
			i = 0;
		}
		
		System.out.println(i);
		
	}

}

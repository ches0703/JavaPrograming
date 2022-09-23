
public class Training01 {

	public static void main(String[] args) {
		
		// For
		int sum = 0;
		for(int i = 0; i < 100; i++) {
			if( (i%2) == 0 ) {
				sum += i;
			}
		}
		System.out.println("For resulte : " + sum);
		
		// While
		sum = 0;
		int i = 0;
		while( i < 100 ) {
			if( (i%2) == 0 ) {
				sum += i;
			}
			i++;
		}
		System.out.println("While resulte : " + sum);
		
		//Do While
		sum = 0;
		i = 0;
		do{
			if( (i%2) == 0 ) {
				sum += i;
			}
			i++;
		}while( i < 100 ); 
		System.out.println("Do While resulte : " + sum);
		
		
	}

}

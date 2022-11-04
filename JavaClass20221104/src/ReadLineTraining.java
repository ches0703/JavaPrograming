import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReadLineTraining {

	public static void main(String[] args) {
		InputStreamReader ir =  new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		System.out.println("OS Used encoding : " + ir.getEncoding());
		for(;;) {
			try{
				System.out.print("Enter String('q' is End) : ");
				String s = br.readLine();
				if(s.equalsIgnoreCase("q")) {
					break;
				}
				System.out.println("Enterd String : " + s);
			}
			catch(Exception e){
				System.out.println("Error!!!");
				System.out.println(e);
				break;
			}
		}
		System.out.println("End the Program ");
	}

}

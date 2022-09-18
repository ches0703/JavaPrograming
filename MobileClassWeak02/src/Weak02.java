import java.util.Scanner;
public class Weak02 {

	public static void main(String[] args) {
		
		Time();
		
	}
	
	public static void Time() {
		Scanner scanner = new Scanner(System.in);
		int time;
		int second;
		int minute;
		int hour;
	
		System.out.print("Enter the seconds to convert : ");
		time = scanner.nextInt();
		
		second = time % 60;
		minute = (time / 60) % 60;
		hour = time / 60 / 60;
		
		System.out.printf("%d second is %dhour, %dminute, %dsecond",time,hour,minute,second);
		
		scanner.close();
	}

}

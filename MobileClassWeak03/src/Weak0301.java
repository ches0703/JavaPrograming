// If, Else, Switch training
import java.util.Scanner;
public class Weak0301 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("점수를 입력하시오 : ");
		int score = in.nextInt();
		
		System.out.println("If, Else 사용 : ");
		UsedIfElse(score);
		
		System.out.println("\nSwitch 사용 : ");
		UsedSwitch(score);
		
		
		in.close();
	}

	public static void UsedIfElse(int score) {
		if(score>90) {
			System.out.print("Grade = A");
		}
		else if(score>80) {
			System.out.print("Grade = B");
		}
		else if(score>70) {
			System.out.print("Grade = C");
		}
		else{
			System.out.print("Grade = F");
		}
	}
	
	public static void UsedSwitch(int score){
		switch(score/10){
			case 10:
			case 9:
				System.out.print("Grade = A");
				break;
			case 8:
				System.out.print("Grade = B");
				break;
			case 7:
				System.out.print("Grade = C");
				break;
			default:
				System.out.print("Grade = F");
				break;
		}
	}
	
}
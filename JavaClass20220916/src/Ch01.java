import java.util.Scanner;
public class Ch01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		var name = GetData.get_name(scanner);
		var city = GetData.get_city();
		var age = GetData.get_age();
		var weight = GetData.get_weight();
		var is_marry = GetData.get_is_marry();
		
		
		System.out.print("이름 : "+name);
		System.out.print(" 도시 : "+city);
		System.out.printf(" 나이 : %d",age);
		System.out.print(" 몸무게 : "+weight);
		System.out.print(" 결혼여 : ");
		if(is_marry) {
			System.out.print("기혼");
		}
		else {
			System.out.print("미혼");
		}
		scanner.close();
	}

}
class GetData{
	public static String get_name(Scanner scanner) {
		System.out.print("이름을 입력하시오 : ");
		return scanner.next();
	}
	public static String get_city() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("도시를 입력하시오 : ");
		return scanner.next();
	}
	public static int get_age() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("나이를 입력하시오 : ");
		return scanner.nextInt();
	}
	public static double get_weight() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("몸무게를 입력하시오 : ");
		return scanner.nextDouble();
	}
	public static boolean get_is_marry() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("결혼여부를 입력하시오 : ");
		return scanner.nextBoolean();
	}
}

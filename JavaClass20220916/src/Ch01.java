import java.util.Scanner;
public class Ch01 {
	public static void main(String[] args) {
		var name = GetData.get_name();
		var city = GetData.get_city();
		var age = GetData.get_age();
		var weight = GetData.get_weight();
		var is_marry = GetData.get_is_marry();
		
		
		System.out.print("�̸� : "+name);
		System.out.print(" ���� : "+city);
		System.out.printf(" ���� : %d",age);
		System.out.print(" ������ : "+weight);
		System.out.print(" ��ȥ���� : ");
		if(is_marry) {
			System.out.print("��ȥ��");
		}
		else {
			System.out.print("��ȥ");
		}
	}

}
class GetData{
	public static String get_name() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�̸��� �Է� �Ͻÿ� : ");
		return scanner.next();
	}
	public static String get_city() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("���ø� �Է��Ͻÿ� : ");
		return scanner.next();
	}
	public static int get_age() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("���̸� �Է��Ͻÿ� : ");
		return scanner.nextInt();
	}
	public static double get_weight() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("ü�߸� �Է��Ͻÿ� : ");
		return scanner.nextDouble();
	}
	public static boolean get_is_marry() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("��ȥ���θ� �Է��Ͻÿ� : ");
		return scanner.nextBoolean();
	}
}

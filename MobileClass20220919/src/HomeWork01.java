import java.util.Scanner;
public class HomeWork01 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("����, ü��, ������ ��ĭ���� �и��Ͽ� ������� �Է��ϼ���");
		int age = in.nextInt();
		double weight = in.nextDouble();
		double height = in.nextDouble();
		System.out.println("����� ���̴� " + age + "���Դϴ�.");
		System.out.println("����� ü���� " + weight +"kg�Դϴ�.");
		System.out.println("����� ������ " + height + "cm�Դϴ�.");
		in.close();

	}

}

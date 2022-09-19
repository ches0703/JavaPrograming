import java.util.Scanner;
public class HomeWork01 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("나이, 체중, 신장을 빈칸으로 분리하여 순서대로 입력하세요");
		int age = in.nextInt();
		double weight = in.nextDouble();
		double height = in.nextDouble();
		System.out.println("당신의 나이는 " + age + "살입니다.");
		System.out.println("당신의 체중은 " + weight +"kg입니다.");
		System.out.println("당신의 신장은 " + height + "cm입니다.");
		in.close();

	}

}

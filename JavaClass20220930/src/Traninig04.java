import java.util.Scanner;

class Circle{
	private int x, y, z;
	public Circle(int x, int y, int z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public void show() {
		System.out.println("x * y * z : " + x*y*z);
	}
}

public class Traninig04 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Circle[] c = new Circle[3];
		int x, y, z;
		for(int i=0;i<3;i++) {
			System.out.print("Enter x, y, z : ");
			x = in.nextInt();
			y = in.nextInt();
			z = in.nextInt();
			c[i] = new Circle(x,y,z);
		}
		for(int i=0;i<3;i++) {
			c[i].show();
		}
		
	}

}


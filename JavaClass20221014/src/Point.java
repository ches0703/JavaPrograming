// Training 02
public class Point {

	private int x, y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "P(" + x + ", " + y + ")";
	}

	public boolean equals(Object obj) {
		Point p = (Point) obj;
		if (x == p.x && y == p.y)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Point A = new Point(2, 30);
		Point B = new Point(3, 70);
		System.out.println("A = " + A);
		System.out.println("B = " + B);
		if (A.equals(B)) {
			System.out.println("A == B");
		} else {
			System.out.println("A != B");
		}
	}

}


public class RectTest {

	public static void main(String[] args) {
		Rect r = new Rect();
		Rect s = new Rect(1,1,2,3);
    
		r.show();
		s.show();
		System.out.println(s.square());
		r.set(-2,2,-1,4); 
		r.show();
		System.out.println(r.square());
		if(r.equals(s))
			System.out.println("두 사각형은 같습니다.");
	}

}

class Rect {
	int x1, x2, y1, y2;

	Rect() {
		x1 = x2 = y1 = y2 = 0;
	}

	Rect(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}

	void set(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}

	boolean check() {
		if ((x1 == x2) || (y1 == y2)) { return false; } 
		else { return true; }
	}
	
	int square() {
		return Math.abs(x1 - x2) * Math.abs(y1 - y2);
	}
	
	void show() {
		if (check()) {
			System.out.printf("(%d,%d),(%d,%d)\n", x1, y1, x2, y2);
		} else {
			System.out.println("this is not Rect");
		}
	}
	
	boolean equals(Rect r) {
		if ((Math.abs(x1 - x2) == Math.abs(r.x1 - r.x2)) && (Math.abs(y1 - y2) == Math.abs(r.y1 - r.y2))) {
			return true;
		}
		else {
			return false;
		}
	}
}
package Circle;

class Circle {
	
	static void PrintCircle() {
		System.out.println("Circle!!!");
	}

	private int radius;

	Circle() {
		radius = 1;
	}

	Circle(int radius) {
		this.radius = radius;
	}

	double getArea() {
		return main.PI * radius * radius;
	}

}

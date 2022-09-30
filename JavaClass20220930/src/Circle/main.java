package Circle;

public class main {	
	
	public static final double PI = 3.141592; 
	
	public static void main(String[] args) {

		Circle.PrintCircle();
		
		Circle[] C_array = new Circle[5];
		for(int i= 0;i<5;i++) {
			C_array[i] = new Circle(i);
		}
		for(int i = 0 ; i<5; i++) {
			System.out.printf("%d Circle Area is : %f\n",i,C_array[i].getArea());
		}
		
		
		
	}

}




import java.util.Scanner;

class Grade {

	double math, science, english;

	Grade() {
		math = 0;
		science = 0;
		english = 0;
	}

	Grade(double math, double science, double english) {
		this.math = math;
		this.science = science;
		this.english = english;
	}

	double getAvg() {
		return (math + science + english) / 3;
	}

}

public class HW0930 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Grade student1_grade;
		System.out.print("Enter the Score (math, Science, English) : ");
		double math = in.nextDouble();
		double science = in.nextDouble();
		double english = in.nextDouble();
		student1_grade = new Grade(math, science, english);
		System.out.println("Avg : " + student1_grade.getAvg());
		in.close();
	}

}

import java.util.ArrayList;
import java.util.Scanner;

public class StudentEx {

	static Scanner in = new Scanner(System.in);
	static double sum_of_java_score = 0;
	static double sum_of_algorithm_score = 0;
	static ArrayList<Student> student_list = new ArrayList<Student>();
	
	static void printMenu() {
		for(int i = 0; i < 110; i++) {
			System.out.print("=");
		}
		System.out.println();
		System.out.print(String.format("%-25s","Add Student = 1"));
		System.out.print(String.format("%-25s","Remove Student = 2"));
		System.out.print(String.format("%-25s","Search Student = 3"));
		System.out.println(String.format("%-25s","Retouch Student = 4"));
		
		System.out.print(String.format("%-25s","Print StudentList = 5"));
		System.out.print(String.format("%-25s","Print Class score = 6"));
		System.out.print(String.format("%-25s","Print Class Avg = 7"));
		System.out.println(String.format("%-25s","Print Sorted Student List = 8"));
		for(int i = 0; i < 110; i++) {
			System.out.print("=");
		}
		System.out.println();
	}

	static void addStudentToList() {
		System.out.print("Enter name, agem java_score, algorithm_score : ");
		String name = in.next();
		int age = in.nextInt();
		double java_score = in.nextDouble();
		double algorithm_score = in.nextDouble();
		Student add_student = new Student(in, name, age, java_score, algorithm_score);
		student_list.add(add_student);
		sum_of_java_score += add_student.getJavaScore();
		sum_of_algorithm_score += add_student.getAlgorithmScore();
	}

	static void printStudentList() {
		for (int i = 0; i < student_list.size(); i++) {
			printStudent(i);
		}
	}

	static void printStudent(int i) {
		if((i < 0)||(i > student_list.size() - 1)) {
			System.out.println("Not found...");
			return;
		}
		System.out.println("index : [" + Integer.toString(i) + "] " + student_list.get(i));
	}

	static int search(String name) {
		if(name == null) {
			System.out.print("Enter the Student name : ");
			name = new String(in.next());
		}
		for (int i = 0; i < student_list.size(); i++) {
			if (student_list.get(i).getName().equals(name)) {
				return i;
			}
		}
		return -1;
	}

	static void remove() {
		System.out.print("Delete as name or index?(name : 1, index = 2)");
		int get_choice = in.nextInt();
		int rm_index;
		
		if(get_choice == 1) {
			System.out.print("Enter student name that want remove in list : ");
			String rm_name = in.next();
			rm_index = search(rm_name);
		}
		else if(get_choice == 2) {
			System.out.print("Enter student index that want remove in list : ");
			rm_index = in.nextInt();
			student_list.remove(rm_index);
		
		}
		else {
			System.out.println("Enter Worng Value...");
			return;
		}
		
		if((rm_index < 0)||(rm_index > student_list.size() - 1)) {
			System.out.println("Not found...");
			return;
		}
		System.out.print("Selected Student : ");
		printStudent(rm_index);
		sum_of_java_score -= student_list.get(rm_index).getJavaScore();
		sum_of_algorithm_score -= student_list.get(rm_index).getAlgorithmScore();
		student_list.remove(rm_index);
	}
	
	public static void main(String[] args) {
		int select_menu = 0;
		for(;select_menu != -1;) {
			printMenu();
			switch (select_menu = in.nextInt()) {
			case 1: {
				addStudentToList();
				break;
			}
			case 2: {
				remove();
				break;
			}
			case 3: {
				printStudent(search(null));
				break;
			}
			case 4: {
				break;
			}
			case 5: {
				printStudentList();
			}
			
			
			default:
			}
		}
	}
}

class Student {

	private String name;
	private int age;
	private double java_score;
	private double algorithm_score;
	Scanner in;

	public Student(Scanner in, String name, int age, double java_score, double algorithm_score) {
		this.in = in;
		setName(name);
		setAge(age);
		setJavaScore(java_score);
		setAlgorithmScore(algorithm_score);
	}

	// mutator
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		for (; age < 0;) {
			System.out.println("age do not allow negative value");
			System.out.print("Enter the age again : ");
			age = this.in.nextInt();
		}
		this.age = age;
	}

	public void setJavaScore(double java_score) {
		for (; (java_score < 0) || (java_score > 100);) {
			System.out.println("Entered java_score value is out of range");
			System.out.print("Enter the java_score again : ");
			java_score = this.in.nextDouble();
		}
		this.java_score = java_score;
	}

	public void setAlgorithmScore(double algorithm_score) {
		for (; (algorithm_score < 0) || (algorithm_score > 100);) {
			System.out.println("Entered algorithm_score value is out of range");
			System.out.print("Enter the algorithm_score again : ");
			algorithm_score = this.in.nextDouble();
		}
		this.algorithm_score = algorithm_score;
	}

	// Acessor
	public String getName() { return this.name; }
	public int getAge() { return this.age; }
	public double getJavaScore() { return this.java_score; }
	public double getAlgorithmScore() { return this.algorithm_score; }
	
	public String toString() {
		String str = "";
		str += "Name = " + name + " ";
		str += "Age = " + Integer.toString(getAge()) + " ";
		str += "java_score = " + Double.toString(getJavaScore()) + " ";
		str += "algorithm_score = " + Double.toString(getAlgorithmScore()) + " ";
		return str;

	}

}
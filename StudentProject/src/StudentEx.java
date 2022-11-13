import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

class getValue{
	static Scanner in = new Scanner(System.in);
	static int getInt() {
		int input = 0;
		for(;;) {
			try {
				input = in.nextInt();
			}
			catch(InputMismatchException e) {
				in.nextLine();
				System.out.println("Entered value's type is not allowd...");
				System.out.print("Please re enter the correct value : ");
				continue;
			}	
			break;
		}
		return input;
	}
	static Double getDouble() {
		Double input = 0.0;
		for(;;) {
			try {
				input = in.nextDouble();
			}
			catch(InputMismatchException e) {
				in.nextLine();
				System.out.println("Entered value's type is not allowd...");
				System.out.print("Please re enter the correct value : ");
				continue;
			}	
			break;
		}
		return input;
	}
}

public class StudentEx {

	static ArrayList<Student> student_list = new ArrayList<Student>();
	
	static void printMenu() {
		for(int i = 0; i < 51; i++) {
			System.out.print("=");
		}
		System.out.println();
		System.out.print(String.format("%-20s =  1 ","Add Student"));
		System.out.println(String.format("%-20s =  2 ","Remove Student"));
		System.out.print(String.format("%-20s =  3 ","Search Student"));
		System.out.println(String.format("%-20s =  4 ","Edit Student"));
		
		System.out.print(String.format("%-20s =  5 ","Print StudentList"));
		System.out.println(String.format("%-20s =  6 ","Total_score, Avg"));
		System.out.print(String.format("%-20s =  7 ","Print By Score"));
		System.out.println(String.format("%-20s = -1 ","End..."));
		for(int i = 0; i < 51; i++) {
			System.out.print("=");
		}
		System.out.println();
	}
	
	static boolean isListEmpty() {
		if(student_list.size() == 0) {
			System.out.println("List is Empty...");
			return true;
		}
		else {
			return false;
		}
	}
	
	// Menu 1 : Add Student
	static void addStudentToList() {
		System.out.println("Enter the Student Data :");
		
		System.out.print("Name : ");
		String name = getValue.in.next();
		System.out.print("Age : ");
		int age = getValue.getInt();
		System.out.print("Java score : ");
		double java_score = getValue.getDouble();
		System.out.print("Algorithm score : ");
		double algorithm_score = getValue.getDouble();
		
		Student add_student = new Student(name, age, java_score, algorithm_score);
		if((student_list.size() == 0)||(search(name) == -1)) {
			student_list.add(add_student);
		}
		else{
			System.out.println("This name has already been added to the list");
		}
	}
	
	// Menu 2 : Remove Student
	static void remove() {
		if(isListEmpty()) { return; }
		System.out.print("Delete as name or index?(Name = 1, Index = 2) : ");
		int get_choice = getValue.getInt();
		int rm_index = -1;
		if(get_choice == 1) {
			System.out.print("Enter the name you want to remove : ");
			String rm_name = getValue.in.next();
			rm_index = search(rm_name);
			if(rm_index == -1) {
				System.out.println("Not Found...");
				return;
			}
		}
		else if(get_choice == 2) {
			System.out.print("Enter the index you want to remove : ");
			rm_index = getValue.getInt();
			if((rm_index < 0)||(rm_index > student_list.size() - 1)) {
				System.out.println("Enterd value is out of range");
				return;
			}
		}
		else {
			System.out.println("Enter the Worng Value...");
			return;
		}
		System.out.println("Selected Student : ");
		System.out.println(String.format("Index [%d] : %s" , rm_index,student_list.get(rm_index)));
		student_list.remove(rm_index);
	}
	
	// Menu3 : Search Student
	static void search() {
		if(isListEmpty()) { return; }
		System.out.print("Enter the Student name : ");
		String name = new String(getValue.in.next());
		Iterator<Student> iter = student_list.iterator();
		for(int i = 0;iter.hasNext();i++) {;
		Student temp = iter.next();
			if (temp.getName().equals(name)) {
				System.out.println(String.format("Index [%d] : %s" , i, temp));
				return;
			}
		}
		System.out.println("Not Found...");
	}
	// seach2 : return index
	static int search(String name) {
		if(isListEmpty()) { return -1; }
		Iterator<Student> iter = student_list.iterator();
		for(int i = 0;iter.hasNext();i++) {;
		Student temp = iter.next();
			if (temp.getName().equals(name)) {
				System.out.println(String.format("Index [%d] : %s" , i, temp));
				return i;
			}
		}
		return -1;
	}
	
	// Menu4 : Retouch Student
	static void edit() {
		if(isListEmpty()) { return; }
		System.out.print("Edit as name or index?(name = 1, index = 2) : ");
		int get_choice = getValue.getInt();
		int rt_index = -1;
		if(get_choice == 1) {
			System.out.print("Enter the name you want to edit : ");
			String rt_name = getValue.in.next();
			rt_index = search(rt_name);
			if(rt_index == -1) {
				System.out.println("Not Found...");
				return;
			}
		}
		else if(get_choice == 2) {
			System.out.print("Enter the index you want to edit : ");
			rt_index = getValue.getInt();
			if((rt_index < 0)||(rt_index > student_list.size() - 1)) {
				System.out.println("Enterd value is out of range");
				return;
			}
		}
		else {
			System.out.println("Enter the Worng Value...");
			return;
		}
		System.out.println("Selected Student : ");
		Student selected_student = student_list.get(rt_index);
		System.out.println(String.format("Index [%d] : %s" , rt_index, selected_student));
		System.out.print("Select value to Edit(Name = 1, Age = 2, Java_score = 3, Algorithm_score = 4) : ");
		int selected_value = getValue.getInt();
		switch (selected_value) {
		case 1: {
			System.out.print("Enter the new Name : ");
			selected_student.setName(getValue.in.next());
			break;
		}
		case 2: {
			System.out.print("Enter the new Age : ");
			selected_student.setAge(getValue.getInt());
			break;
		}
		case 3: {
			System.out.print("Enter the new Java_score : ");
			selected_student.setJavaScore(getValue.getDouble());
			break;
		}
		case 4: {
			System.out.print("Enter the new Algorithm_score : ");
			selected_student.setAlgorithmScore(getValue.getDouble());
			break;
		}
		default:
			System.out.println("Enter the Worng Value...");
			return;
		}
		System.out.println("After Edit : ");
		System.out.printf("Index [%d] : %s\n" , rt_index, selected_student);
	}
	
	// Menu5 : Print StudentList
	static void printStudentList() {
		if(isListEmpty()) { return; }
		Iterator<Student> iter = student_list.iterator();
		for(int i = 0;iter.hasNext();i++) {
			Student temp = iter.next();
			System.out.printf("Index [%d] : %s\n" , i, temp);
		}
	}

	
	// Menu6 : Total_score, Avg
	static void printTotalScoreAvg() {
		if(isListEmpty()) { return; }
		double sum_of_java = 0.0;
		double sum_of_algorithm = 0.0;
		Iterator<Student> iter = student_list.iterator();
		for(;iter.hasNext();) {
			Student temp = iter.next();
			sum_of_java += temp.getJavaScore();
			sum_of_algorithm += temp.getAlgorithmScore();
		}
		try {
			System.out.printf("Total_score : Java = %5.2f, Algorithm = %5.2f\n",
					sum_of_java, sum_of_algorithm);
			System.out.printf("Avg         : Java = %5.2f, Algorithm = %5.2f\n",
					sum_of_java/student_list.size(), sum_of_algorithm/student_list.size());			
		}
		catch (ArithmeticException e) {
			System.out.println("List is Empty...");
			System.out.printf("Total_score : Java = 0, Algorithm = 0");
			System.out.printf("Avg         : Java = 0, Algorithm = 0");	
		}
		
	}
	
	static void PrintByScore() {
		if(isListEmpty()) { return; }
		
		HashMap<Integer, Student> connect_index_student = new HashMap<Integer, Student>();
		Iterator<Student> iter = student_list.iterator();
		for(int i = 0;iter.hasNext();i++) {
			Student temp = iter.next();
			connect_index_student.put(i, temp);
		}

		System.out.print("Print By Score as Java or Algorithm(Java = 1, Algorithm = 2) : ");
		int get_choice = getValue.getInt();
		
		for(;!connect_index_student.isEmpty();) {
			Iterator<Integer> it_keys = connect_index_student.keySet().iterator();
			int min_index = it_keys.next();
			for(;it_keys.hasNext();) {
				int compare_index = it_keys.next();
				if(compareStudent(connect_index_student.get(min_index), connect_index_student.get(compare_index), get_choice, 1)) {
					min_index = compare_index;
				}
			}
			System.out.printf("Index [%d] : %s\n" , min_index, connect_index_student.get(min_index));
			connect_index_student.remove(min_index);
		}
		
		
		
		
	}
	public static boolean compareStudent(Student S1, Student S2, int class_code, int sort_mode) {
		// Sort mode : Ascending = 1, Descending = 2
		// class_code : Java = 1, Algorithm = 2
		boolean resulte = true;
		if(class_code == 1) {
			if(S1.getJavaScore() > S2.getJavaScore()) {
				resulte = true;
			}
			else {
				resulte = false;	
			}
			
		}
		else if(class_code == 2) {
			if(S1.getAlgorithmScore() > S2.getAlgorithmScore()) {
				resulte = true;
			}
			else {
				resulte = false;	
			}
		}
		else {
			System.out.println("public static boolean compareStudent's parameter is not correct!");
		}
		
		if(sort_mode == 1) {
			return resulte;			
		}
		else if (sort_mode == 1){
			return !resulte;
		}
		else {
			System.out.println("public static boolean compareStudent's parameter is not correct!");
		}
		return false;
	}


	
	
	public static void main(String[] args) {
		for(int select_menu = 0 ;select_menu != -1;) {
			printMenu();
			System.out.print("Select Menu : ");
			select_menu = getValue.getInt();
			switch (select_menu) {
			case 1: {
				addStudentToList();
				break;
			}
			case 2: {
				remove();
				break;
			}
			case 3: {
				search();
				break;
			}
			case 4: {
				edit();
				break;
			}
			case 5: {
				printStudentList();
				break;
			}
			case 6:{
				printTotalScoreAvg();
				break;
			}
			case 7:{
				PrintByScore();
				break;
			}
			default:
				System.out.println("Enter the Worng Value...");
				break;
			}
		}
		getValue.in.close();
	}
}

class Student {

	private String name;
	private int age;
	private double java_score;
	private double algorithm_score;
	public Student(String name, int age, double java_score, double algorithm_score) {
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
			age = getValue.getInt();
		}
		this.age = age;
	}

	public void setJavaScore(double java_score) {
		for (; (java_score < 0) || (java_score > 100);) {
			System.out.println("Entered java_score value is out of range");
			System.out.print("Enter the java_score again : ");
			java_score = getValue.getDouble();
		}
		this.java_score = java_score;
	}

	public void setAlgorithmScore(double algorithm_score) {
		for (; (algorithm_score < 0) || (algorithm_score > 100);) {
			System.out.println("Entered algorithm_score value is out of range");
			System.out.print("Enter the algorithm_score again : ");
			algorithm_score = getValue.getDouble();
		}
		this.algorithm_score = algorithm_score;
	}

	// Assessor
	public String getName() { return this.name; }
	public int getAge() { return this.age; }
	public double getJavaScore() { return this.java_score; }
	public double getAlgorithmScore() { return this.algorithm_score; }
	
	
	@Override
	public String toString() {
		String str = "";
		str += String.format(" Name : %5s ", getName());
		str += String.format(" Age : %3d ", getAge());
		str += String.format(" Java_score = %5.1f ",getJavaScore());
		str += String.format(" Algorithm_score = %5.1f ",getAlgorithmScore());
		return str;

	}

}
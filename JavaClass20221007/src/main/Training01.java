package main;

public class Training01 {

	public static void main(String[] args) {
		
		yeungnam Y = new yeungnam();
		
		Y.message();
		Y.printStudentID();
		Y.printStudentName();
		Y.printStudentNum();
		
	}

}
interface university{
	int N = 2000;
	void printStudentID();
	void printStudentName();
	default void printStudentNum() {
		System.out.println("Student Num : " + N);
	}
	
}
class yeungnam implements university{
	
	private String id;
	private String name;
	
	public yeungnam() {
		this.id = "00001111";
		this.name = "testing";
	}
	
	public void message() {
		System.out.println("** Computer Engineering **");
	}
	
	@Override
	public void printStudentID() {
		System.out.println("ID : " + id);
	}
	
	@Override
	public void printStudentName() {
		System.out.println("Name : " + name);
	}
	
	
}
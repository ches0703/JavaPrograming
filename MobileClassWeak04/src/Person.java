
public class Person {

	public String name;
	public Person(){ this.name = "blank"; }
	public Person(String name){ this.name = name; }
	public String GetName() {
		return name;
	}
	static public void PrintHello() {
		System.out.println("Hello !");
	}
	
	public static void main(String[] args) {
		Person.PrintHello();
		Person ches = new Person("ches");
		System.out.println(ches.GetName());
		Person blank = new Person();
		System.out.println(blank.GetName());
		int arr[];
	}

}

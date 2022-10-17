package StudentTest;

abstract public class Student {

	private String name;
	private int id;
	
	public Student(String name, int id){
		this.name = name;
		this.id = id;
	}
	
	protected String getName() { return this.name; }
	protected int getId() { return this.id; }
	
	abstract protected int getAnnualSalary();
	
	public String toString() {
		String resulte_str = name + "( " +Integer.toString(id) + " )";
		return resulte_str;
	}
	
	
}

package StudentTest;

public class Undergraduate extends Student{

	private int semester_salary;
	
	public Undergraduate(String name, int id, int semester_salary) {
		super(name, id);
		this.semester_salary = semester_salary;
	}
	
	public String toString() {
		return super.toString() + " Undergraduate Student, "
				+ "semester salary : " + Integer.toString(semester_salary)
				+ ", annual salary : " + Integer.toString(getAnnualSalary());
	}
	
	@Override
	protected int getAnnualSalary() { return semester_salary * 2; }
	
}

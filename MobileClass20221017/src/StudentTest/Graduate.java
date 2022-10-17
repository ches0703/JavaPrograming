package StudentTest;

public class Graduate extends Student {

private int month_salary;
	
	public Graduate(String name, int id, int month_salary) {
		super(name, id);
		this.month_salary = month_salary;
	}
	
	public String toString() {
		return super.toString() + " Graduate Student, "
				+ "semester salary : " + Integer.toString(month_salary)
				+ ", annual salary : " + Integer.toString(getAnnualSalary());
	}
	
	@Override
	protected int getAnnualSalary() { return month_salary * 12; }
	
}

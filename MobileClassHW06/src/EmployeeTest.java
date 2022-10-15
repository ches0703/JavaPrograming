
public class EmployeeTest {
	Employee e1, e2, e3;
	  Manager m1, m2, m3;
	  public EmployeeTest() {
	    e1 = new Employee("아이유", 3000000, "kd039482");
	    e2 = new Employee("에일리", 3500000, "ek827593");
	    e3 = new Employee();
	    m1 = new Manager("김건모", 7000000, "lg837593", "인사부");
	    m2 = new Manager("서태지", 6000000, "je934827", "관리부");
	    m3 = new Manager();
	  }
	  public void showInfo() {
	    String info = "이름\t월급\t사번\t\t관리부서\n";
	    info += "============================================================\n";
	    info += e1 + "\n"  + e2 + "\n" + e3 + "\n" + m1 + "\n" + m2 + "\n" + m3;
	    System.out.println(info);
	  }

	public static void main(String[] args) {
		EmployeeTest myTest = new EmployeeTest();
	    myTest.showInfo();
	    System.exit(0);
	}

}

class Employee {
	protected String name;
	private int salary;
	protected String ID;

	public Employee() {
		this.name = "";
		this.salary = 0;
		this.ID = "";
	}

	public Employee(String name, int salary, String ID) {
		this.name = name;
		this.salary = salary;
		this.ID = ID;
	}

	public String toString() {
		return name + "\t" + salary + "\t" + ID;
	}
}

class Manager extends Employee {
	private String department;

	public Manager() {
		super();
		this.department = "";
	}

	Manager(String name, int salary, String ID, String department) {
		super(name, salary, ID);
		this.department = department;
	}

	public String toString() {
		return super.toString() + "\t" +department;
	}

}

class Person{
    public Person(){ 
    	System.out.println("A");// A
        this.age = 0;
        this.name = "anaymaous";
    }
    public Person(int age){

    	System.out.println("B");// B
        this.age = setAge(age);
        this.name = "anaymaous";
    }
    public Person(int age, String name){  // C

    	System.out.println("C");
    	this.age = setAge(age);
        this.name = name;
    }
    public int setAge(int age)            // D
    {
    	System.out.println("D");
        if (age < 0)
        {
            System.out.println("Wrong Age!!!");
            System.exit(0);
            return 0;
        }
        else{
            return age;
        }
    }
    private int age;
    private String name;
}
class Student extends Person{
	
    public Student(){  

    	System.out.println("E");//E
        this.grade = 1;
    }
    public Student(int grade){            //F
        this.grade = setGrade(grade);

    	System.out.println("F");
    }
    public int setGrade(int grade){ 

    	System.out.println("G");//G
        if(grade > 0 && grade < 5){
            return grade;
        }
        else
        {
            System.out.println("Wrong grade");
            System.exit(0);
            return 0;
        }
    }
    private int grade;
}

public class test {
    public static void main(String[] args){
        Student Kim = new Student();
        //위의 Student객체를 생성할 때 위의 메서드가 실행되는 순서를 적으시오
    }
}

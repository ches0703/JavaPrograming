package List;
import java.util.*;

public class Student {

	String name;
	int class_room;
	int id;
	public Student(String name, int class_room, int id) {
		this.name = name;
		this.class_room =class_room;
		this.id = id;
	}
	
	public static void main(String[] args) {
		var list = new ArrayList<Student>();
		list.add(new Student("first", 1, 11));
		list.add(new Student("second", 1, 12));
		list.add(new Student("new first", 2, 21));
		list.add(new Student("new second", 2, 22));
		list.add(new Student("last", 99, 99));
		
		var it = list.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println("Name : " + s.name + " Class room : " + s.class_room + " ID : " + s.id);
		}
		
	}

}

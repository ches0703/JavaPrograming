package StudentTest;

public class StudentTest {

	public static void main(String[] args) {
		Student[] s_list = new Student[8];
		
		s_list[0] = new Graduate("Giggs", 20163103, 400000);
		s_list[1] = new Graduate("Carrick", 20163003, 500000);
		s_list[2] = new Graduate("Evra", 20155511, 350000);
		s_list[3] = new Graduate("Saha", 20143323, 550000);
		s_list[4] = new Undergraduate("Crouch", 20170103, 1000000);
		s_list[5] = new Undergraduate("Nevile", 20170012, 1200000);
		s_list[6] = new Undergraduate("Ji-sung", 20160429, 1100000);
		s_list[7] = new Undergraduate("Rooney", 20150718, 900000);
		
		for(Student s : s_list) {
			System.out.println(s);
		}

	}

}

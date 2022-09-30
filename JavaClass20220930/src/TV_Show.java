public class TV_Show {

	String company = new String();
	int year;
	int size;
	
	TV_Show(String company, int year, int size){
		this.company = company;
		this.year = year;
		this.size = size;
	}
	
	void Show() {
		System.out.print("Made by " + company);
		System.out.print(", Year of manufacture " + year);
		System.out.print(", size : " + size);
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		
		TV_Show LG_TV = new TV_Show("LG", 2022, 32);
		LG_TV.Show();
		
		
	}

}

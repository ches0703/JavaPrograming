package main;

public class Overriding {

	public static void main(String[] args) {
		
		weapon w = new weapon();
		
		System.out.println("weapon.fire : " + w.fire());
		
		w = new canon();
		
		System.out.println("canon.fire : " + w.fire());
		
		System.out.println("canon.fire : " + ((weapon)w).fire());

	}

}
class weapon{
	protected int fire() {
		return 1;
	}
}
class canon extends weapon{
	protected int fire() {
		return 10;
	}
}
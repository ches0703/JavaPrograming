
public class Wallet {

	static int balance = 0;
	
	void printMoney(int in, int out) {
		System.out.println("Deposit Money : " + in);
		balance += in;
		if(balance < out) {
			System.out.println("Not enough Money!!");
			System.out.println("Balance : " + balance);
		}
		else {
			balance -= out;
		}
	}
	
	
	public static void main(String[] args) {
		
		Wallet P1 = new Wallet();
		Wallet P2 = new Wallet();
		
		P1.printMoney(10000, 4000);
		P2.printMoney(20000, 50000);
		
		
	}

}

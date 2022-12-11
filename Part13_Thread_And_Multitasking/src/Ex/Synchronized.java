package Ex;

public class Synchronized {

	public static void main(String[] args) {

		
		ShareBoard share_board = new ShareBoard();
		
		Thread user1 = new UserThread("user1", share_board);
		Thread user2 = new UserThread("user2", share_board);
		
		user1.start();
		user2.start();

	}

}

class ShareBoard{
	int value = 0;
	synchronized void increase() {
		int n = value;
		
		n += 10;
		
		//Thread.yield();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		
		value = n;
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print(Thread.currentThread().getName());
		System.out.println("  -> value = " + Integer.toString(value));
	}
}


class UserThread extends Thread{
	ShareBoard board;

	UserThread(String name, ShareBoard board){
		super(name);
		this.board = board;
	}
	@Override
	public void run() {
		System.out.println(super.getName() + " is running");
		for(int i = 0; i < 10; i++) {
			this.board.increase();
		}
	}

}


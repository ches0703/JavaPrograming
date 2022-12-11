package Ex;

public class ThreadMainEx {

	public static void main(String[] args) {
		System.out.printf("Thread ID : %d\n", Thread.currentThread().getId());
		System.out.printf("Thread name : %s\n", Thread.currentThread().getName());
		System.out.printf("Thread priority : %d\n", Thread.currentThread().getPriority());
		System.out.printf("Thread State : %s\n", Thread.currentThread().getState());
		
	}

}

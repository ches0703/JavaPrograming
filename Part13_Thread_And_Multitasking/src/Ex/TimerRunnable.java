package Ex;

import javax.swing.JLabel;

class TimerRunnable implements Runnable{
	private JLabel timer_label;
	int n = 0;
	TimerRunnable(JLabel timer_label) {
		this.timer_label = timer_label;
	}
	@Override
	public void run() {
		while(n < 10) {
			this.timer_label.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				return;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

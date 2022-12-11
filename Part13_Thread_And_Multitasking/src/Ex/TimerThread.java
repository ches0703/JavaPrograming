package Ex;

import javax.swing.JLabel;

class TimerThread extends Thread {
	private JLabel timer_label;
	private int n = 0;
	private boolean flag = true;

	TimerThread(JLabel timer_label) {
		this.timer_label = timer_label;
	}
	@Override
	public void run() {
		while(n < 10) {
			
			this.timer_label.setText(Integer.toString(n));
			n++;
			try {
				if(flag == true) {
					sleep(1000);
				}
				else {
					return;
				}
			}
			catch(InterruptedException e){
				return;
			}
		}
	}
	
	void finish(){
		this.flag = false;
	}

	public static void main(String[] args) {

	}

}

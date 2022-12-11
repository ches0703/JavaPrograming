package Ex;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


class TimerGUI extends JFrame{
	private Thread timer;
	TimerGUI() {
		setTitle("Timer Thread");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel timer_label = new JLabel();
		c.add(timer_label);
		
		// Use Thread
		timer = new TimerThread(timer_label);
		
		// Use Runnable
		//timer = new Thread(new TimerRunnable(timer_label));
		timer.start();
		
		// interrupt
		JButton btn = new JButton("Kill Timer");
		btn.addActionListener(new Killtime());
		c.add(btn);
		
		
		setSize(300, 150);
		setVisible(true);
		
		
	}
	
	class Killtime implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// Use interrupt
			//timer.interrupt();
			
			// Use flag
			((TimerThread)timer).finish();
			
			((JButton)e.getSource()).setEnabled(false);
		}
		
	}
	

	public static void main(String[] args) {
		new TimerGUI();
	}

}

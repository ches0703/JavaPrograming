package Ex;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

class Flickering extends JFrame{

	Flickering() {
		setTitle("FlickerringLabel");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		
		JLabel label1 = new JLabel("label 1");
		label1.setOpaque(true);
		FlickeringLabel label1_thread = new FlickeringLabel(label1, 500);
		label1_thread.start();
		
		JLabel label2 = new JLabel("label 2");
		label2.setOpaque(true);
		
		JLabel label3 = new JLabel("label 3");
		label3.setOpaque(true);
		FlickeringLabel label3_thread = new FlickeringLabel(label3, 1000);
		label3_thread.start();
		
		c.add(label1);
		c.add(label2);
		c.add(label3);
		
		setSize(300, 150);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Flickering();
	}

}
class FlickeringLabel extends Thread{

	JLabel label;
	int delay;
	
	@Override
	public void run() {
		for(int n = 0; ; n++) {
			if((n %= 2) == 0) {
				label.setBackground(Color.YELLOW);
			}
			else {
				label.setBackground(Color.GREEN);
			}
			try {
				Thread.sleep(delay);
			} 
			catch (InterruptedException e) {
				return;
			}
		}
	}
	FlickeringLabel(JLabel label, int delay) {
		this.label = label;
		this.delay = delay;
	}

}

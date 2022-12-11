package Ex;

import java.awt.Container;

import javax.swing.JLabel;

public class RandomThread extends Thread{

	private Container c;
	private boolean flag = true;
	
	public RandomThread(Container c) {
		this.c = c;
	}
	
	void finish() {
		this.flag = false;
	}
	
	@Override
	public void run() {
		for(;;) {
			int x = (int)(Math.random() * c.getWidth());
			int y = (int)(Math.random() * c.getHeight());
			
			JLabel label = new JLabel("Java");
			label.setLocation(x, y);
			label.setSize(80, 30);
			c.add(label);
			c.repaint();
			System.out.println("add label");
			try {
				Thread.sleep(500);
				if(!flag) {
					c.removeAll();
					label = new JLabel("Finish");
					label.setSize(80, 30);
					label.setLocation(x, y);
					c.add(label);
					c.repaint();
					System.out.println("break");
					return;
				}
			} 
			catch (InterruptedException e) {
				return;
			}
			
			
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

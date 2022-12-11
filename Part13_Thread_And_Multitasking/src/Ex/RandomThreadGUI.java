package Ex;

import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class RandomThreadGUI extends JFrame{

	private RandomThread random_thread;
	
	public RandomThreadGUI() {
		setTitle("RandomThreadGUI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		
		c.addMouseListener(new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("Press");
				random_thread.finish();
			}
			
		});
		
		
		setSize(500, 500);
		setVisible(true);

		random_thread = new RandomThread(c);
		random_thread.start();
	
	}
	
	public static void main(String[] args) {
		new RandomThreadGUI();
	}
	
}


import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class LoveJava extends JFrame{
	
	JLabel Label = new JLabel("Java");

	public LoveJava() {
		
		setTitle("Love Java");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(Label);
		c.addMouseListener(new MyMouseListener());
		
		setSize(200, 200);
		setVisible(true);
	
	}
	
	class MyMouseListener extends MouseAdapter{

		@Override
		public void mouseEntered(MouseEvent e) {
			Label.setText("I Love Java");
		}

		@Override
		public void mouseExited(MouseEvent e) {
			Label.setText("Java");
			
		}
		
	}
	
	public static void main(String[] args){
		new LoveJava();
	}

}

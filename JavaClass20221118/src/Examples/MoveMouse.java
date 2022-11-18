package Examples;

import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MoveMouse extends JFrame{

	private JLabel text = new JLabel("Here!");
	
	public MoveMouse() {
		setTitle("Move Mouse");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		text.setSize(50, 20);
		text.setLocation(30, 30);
		c.add(text);
		c.addMouseListener(new MoveMouseListener());
		
		setSize(500, 500);
		setVisible(true);
		
	}
	
	class MoveMouseListener extends MouseAdapter{

		@Override
		public void mouseClicked(MouseEvent e) {
			var x = e.getX();
			var y = e.getY();
			text.setLocation(x,y);
		}

		@Override
		public void mousePressed(MouseEvent e) {
			var x = e.getX();
			var y = e.getY();
			text.setLocation(x,y);
		}

		
	}
	
	
	public static void main(String[] args) {
		new MoveMouse();
	}

}

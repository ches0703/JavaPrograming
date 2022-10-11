import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
public class MoveHello extends JFrame{

	private JLabel la;
	
	public MoveHello() {
		
		setTitle("Move Hello");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel contentPane = new JPanel();
		setContentPane(contentPane);
		setLayout(null);
		contentPane.addMouseListener(new MouseListener() {
			@Override
			public void mousePressed(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				la.setLocation(x, y);
			}		
			@Override
			public void mouseReleased(MouseEvent e) {}
			@Override
			public void mouseExited(MouseEvent e) {}
			@Override
			public void mouseEntered(MouseEvent e) {}
			@Override
			public void mouseClicked(MouseEvent e) {}
		});
		
		la = new JLabel("Hello");
		la.setSize(50, 20);
		la.setLocation(30, 30);
		contentPane.add(la);
		
		setSize(500,500);
		setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		new MoveHello();
	}

}

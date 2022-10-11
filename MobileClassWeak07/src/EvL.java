import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
public class EvL extends JFrame{
	
	EvL(){
		setTitle("Event Listener");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn = new JButton("Action");
		btn.setBackground(Color.GRAY);
		MyActionListener listener = new MyActionListener();
		btn.addActionListener(listener);
		btn.addMouseListener(listener);
		add(btn);
		
		setSize(300,150);
		setVisible(true);
	
	}
	

	public static void main(String[] args) {
		new EvL();
	}

}
class MyActionListener implements ActionListener, MouseListener{
	
	// ActionListener------------------------------
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		if(b.getText() == "Action") {
			b.setText("NULL");
		}
		else {
			b.setText("Action");
		}
	}
	
	// MouseLitener--------------------------------
	@Override
	public void mouseEntered(MouseEvent e) {
		JButton b = (JButton)e.getSource();
		b.setBackground(Color.BLUE);
	}


	@Override
	public void mouseExited(MouseEvent e) {
		JButton b = (JButton)e.getSource();
		b.setBackground(Color.GRAY);
	}
	
	
	@Override
	public void mouseClicked(MouseEvent e) {}


	@Override
	public void mousePressed(MouseEvent e) {}


	@Override
	public void mouseReleased(MouseEvent e) {}


	
}

package Event;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseEx extends JFrame{

	public MouseEx() {
	
		setTitle("MouseEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		var listner = new MyMouseListner();
		
		var btn = new JButton("Mouse Event test");
		btn.setBackground(Color.GRAY);
		btn.addMouseListener(listner);
		add(btn);
		
		setSize(300,150);
		setVisible(true);
		
		
	}
	
	
	public static void main(String[] args) {
		new MouseEx();
	}

}
class MyMouseListner implements MouseListener{

	@Override
	public void mouseEntered(MouseEvent e) {
		var btn = (JButton)e.getSource();
		btn.setBackground(Color.BLUE);
	}
	
	@Override
	public void mouseExited(MouseEvent e) {
		var btn = (JButton)e.getSource();
		btn.setBackground(Color.GRAY);
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {}
	@Override
	public void mousePressed(MouseEvent e) {}
	@Override
	public void mouseReleased(MouseEvent e) {}

	
}
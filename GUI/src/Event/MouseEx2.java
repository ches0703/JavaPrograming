package Event;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MouseEx2 extends JFrame{

	JPanel Panel = new JPanel();
	JLabel la = new JLabel();
	
	public MouseEx2() {
		setTitle("MouseEx2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		la = new JLabel("No Mouse Event");
		
		setContentPane(Panel);
		Panel.addMouseListener(new MyMouseListnerEx2());
		Panel.addMouseMotionListener(new MyMouseListnerEx2());
		Panel.add(la);
		
		setSize(500,500);
		setVisible(true);
	}
	
	class MyMouseListnerEx2 implements MouseListener,
	   							       MouseMotionListener{
		@Override
		public void mouseEntered(MouseEvent e) {
			var p = (JPanel)e.getSource();
			p.setBackground(Color.WHITE);
		}
		@Override
		public void mouseExited(MouseEvent e) {
			var p = (JPanel)e.getSource();
			p.setBackground(Color.GRAY);
		}
		
		@Override
		public void mouseMoved(MouseEvent e) {
			la.setText("Mouse Moved( " + 
					   e.getX() + ", " + e.getY() + " )");
		}
		@Override
		public void mouseDragged(MouseEvent e) {
			la.setText("Mouse Dragged( " + 
					   e.getX() + ", " + e.getY() + " )");
		}
		@Override
		public void mousePressed(MouseEvent e) {
			la.setText("Mouse Pressed( " + 
					   e.getX() + ", " + e.getY() + " )");
		}
		@Override
		public void mouseReleased(MouseEvent e) {
			la.setText("Mouse Released( " + 
					   e.getX() + ", " + e.getY() + " )");
		}
		@Override
		public void mouseClicked(MouseEvent e) {}

}
	
	public static void main(String[] args) {
		new MouseEx2();
	}

}

import java.awt.*;
import javax.swing.*;

public class HW02 extends JFrame{

	HW02_Panel MyPanel = new HW02_Panel();
	
	public HW02() {
	
		setTitle("HW02");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(MyPanel);
		setSize(140, 160);
		setVisible(true);
	
	}
	
	class HW02_Panel extends JPanel{
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.RED);
			g.fillArc(10, 10, 100, 100, 90, 120);
			
			g.setColor(Color.BLUE);
			g.fillArc(10, 10, 100, 100, 210, 120);
			
			g.setColor(Color.YELLOW);
			g.fillArc(10, 10, 100, 100, 330, 120);
		}
	}
	
	public static void main(String[] args) {
		new HW02();
	}

}

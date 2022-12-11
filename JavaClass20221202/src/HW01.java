import java.awt.*;
import javax.swing.*;

public class HW01 extends JFrame{
	
	HW01_Pannel panel = new HW01_Pannel();
	
	public HW01() {
	
		setTitle("HW01");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(150, 300);
		setVisible(true);
	
	}
	
	class HW01_Pannel extends JPanel{
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			g.setColor(Color.RED);
			g.drawRect(10, 10, 50, 50);
			g.fillRect(70, 10, 50, 50);
			
			g.setColor(Color.YELLOW);
			g.fillOval(10, 70, 50, 50);
			g.drawOval(70, 70, 50, 50);
			
			g.setColor(Color.GREEN);
			g.drawRoundRect(10, 130, 50, 50, 20, 20);
			g.fillRoundRect(70, 130, 50, 50, 20, 20);
			
			g.setColor(Color.PINK);
			g.fillArc(40, 190, 50, 50, 0, 180);
			
			g.setFont(new Font("Times New Roman", Font.PLAIN, 30));
			g.drawString("We win!!", 20, 240);
			
		}
	}

	public static void main(String[] args) {
		new HW01();
	}

}

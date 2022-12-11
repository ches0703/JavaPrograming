import java.awt.*;
import javax.swing.*;

public class HW03 extends JFrame{

	HW03_Panel MyPanel = new HW03_Panel();
	
	public HW03() {
		setTitle("HW02");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(MyPanel);
		setSize(700, 300);
		setVisible(true);
	
	}
	
	class HW03_Panel extends JPanel{
		Image img01 = new ImageIcon("src/22.gif").getImage();
		Image img02 = new ImageIcon("src/24.gif").getImage();
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			int width = getWidth()/2;
			
			g.drawImage(img01, 0, 0, width, getHeight(), this);
			g.drawImage(img02, width, 0, width, getHeight(), this);
		}
	}
	
	public static void main(String[] args) {
		new HW03();
	}

}

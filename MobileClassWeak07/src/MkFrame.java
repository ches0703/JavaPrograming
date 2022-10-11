import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
public class MkFrame {

	public static void main(String[] args) {
		
		mainFrame main_frame = new mainFrame();
		
	}

}

class mainFrame extends JFrame{
	mainFrame(){
		setTitle("main Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPaneF = getContentPane();
		contentPaneF.setBackground(Color.cyan);
		contentPaneF.setLayout(new FlowLayout());
		contentPaneF.add(new JButton("OK"));
		contentPaneF.add(new JButton("Cancel"));
		contentPaneF.add(new JButton("Ignore"));
		
		Container contentPaneB = getContentPane();
		contentPaneB.setBackground(Color.DARK_GRAY);
		contentPaneB.setLayout(new BorderLayout(30, 20));
		contentPaneB.add(new JButton("North"), BorderLayout.NORTH);
		contentPaneB.add(new JButton("West"), BorderLayout.WEST);
		contentPaneB.add(new JButton("Center"), BorderLayout.CENTER);
		contentPaneB.add(new JButton("East"), BorderLayout.EAST);
		contentPaneB.add(new JButton("South"), BorderLayout.SOUTH);
		
		setSize(500,500);
		setVisible(true);
		
	}
}
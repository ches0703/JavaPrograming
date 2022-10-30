package Frame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;


public class MyFrame extends JFrame{
	
	public MyFrame() {
		setTitle("Content Pane");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.GRAY);
		contentPane.setLayout(new FlowLayout());
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));
		
		setSize(500,500);
		setVisible(true);
		

	}
	
	
	public static void main(String[] args) {
		new MyFrame();
	}
}

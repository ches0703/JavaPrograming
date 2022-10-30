package Layout;
import java.awt.*;
import javax.swing.*;


public class GridEx extends JFrame{
	
	public GridEx() {
		setTitle("GridEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		GridLayout grid = new GridLayout(4,2);
		grid.setVgap(5);
		c.setLayout(grid);
		c.add(new JLabel("Name"));
		c.add(new JTextField(""));
		c.add(new JLabel("ID"));
		c.add(new JTextField(""));
		c.add(new JLabel("Major"));
		c.add(new JTextField(""));
		c.add(new JLabel("Subject"));
		c.add(new JTextField(""));
		
		setSize(500,500);
		setVisible(true);
	
	}
	
	
	public static void main(String[] args) {
		new GridEx();
	}
}

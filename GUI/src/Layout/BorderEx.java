package Layout;
import java.awt.*;
import javax.swing.*;

public class BorderEx extends JFrame{

	public BorderEx() {
		
		setTitle("Border");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout(10,10));
		c.add(new Button("North"),BorderLayout.NORTH);
		c.add(new Button("South"),BorderLayout.SOUTH);
		c.add(new Button("East"),BorderLayout.EAST);
		c.add(new Button("West"),BorderLayout.WEST);
		c.add(new Button("Center"),BorderLayout.CENTER);
		
		
		setSize(500,500);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new BorderEx();
	}
	
}

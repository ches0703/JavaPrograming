package Event;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ActionListnerEx extends JFrame{
	
	public ActionListnerEx() {
	
		setTitle("Action Listner");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		MyActionListner listner = new MyActionListner();
		
		JButton btn = new JButton("Action");
		btn.addActionListener(listner);
		add(btn);
		setSize(300, 150);
		setVisible(true);
		
		
		
	}

	public static void main(String[] args) {
		new ActionListnerEx();
	}

}
class MyActionListner implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		if(b.getText().equals("Action")) {
			b.setText("aCTION");
		}
		else {
			b.setText("Action");	
		}
	}
	
}
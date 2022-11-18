package Examples;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;

public class ActionBtn extends JFrame{

	public ActionBtn() {
	
		setTitle("ActionBtn");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		var Panel01 = new JPanel();
		
		var action_btn = new JButton("Action");
		action_btn.addActionListener(new Action_Btn_Listneer());
		Panel01.add(action_btn);
		
		this.add(Panel01);
		
		setSize(500, 200);
		setVisible(true);
	}
	
	class Action_Btn_Listneer implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton btn = (JButton)e.getSource();
			if(btn.getText().equals("Action")) {
				btn.setText("Stop");
			}
			else {
				btn.setText("Action");
			}
		}
	}
	
	public static void main(String[] args) {
		new ActionBtn();
	}

}

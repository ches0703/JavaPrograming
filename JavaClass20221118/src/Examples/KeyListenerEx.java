package Examples;

import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyListenerEx extends JFrame{
	
	private JLabel [] keyMessage; 
	
	public KeyListenerEx() {
		setTitle("KeyListenerEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.addKeyListener(new MyKeyListener());
		
		keyMessage = new JLabel [3];
		keyMessage[0] = new JLabel(" getKeyCode() ");
		keyMessage[1] = new JLabel(" getKeyChar() ");
		keyMessage[2] = new JLabel(" getKeyText() ");
		for(int i=0; i<keyMessage.length; i++) {
			c.add(keyMessage[i]);
		}
		
		
		setSize(500, 500);
		setVisible(true);
		c.setFocusable(true) ;
		c.requestFocus() ;
		
	}
	
	class MyKeyListener extends KeyAdapter{
		@Override
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			char keyChar = e.getKeyChar();
			
			keyMessage[0].setText(Integer.toString(keyCode));
			keyMessage[1].setText(Character.toString(keyChar));
			keyMessage[2].setText(KeyEvent.getKeyText(keyCode));
			
		}
	}
	

	public static void main(String[] args) {
		new KeyListenerEx();
	}

}

package Training;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.TextField;

import javax.swing.*;

public class Calc extends JFrame{

	public Calc(){
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout(10, 10));
		
		
		JPanel top = new Top();
		JPanel mid = new Mid();
		JPanel bottom = new Bottom();
		
		
		contentPane.add(top, BorderLayout.NORTH);
		contentPane.add(mid, BorderLayout.CENTER);
		contentPane.add(bottom, BorderLayout.SOUTH);
		
		
		setSize(300, 300);
		setVisible(true);
		
	}
	class Top extends JPanel{
		Top(){
			this.setLayout(new FlowLayout());
			this.add(new JLabel("Expression"));
			this.add(new JTextField(15));
			setBackground(Color.GRAY);
			setSize(300, 100);
			setVisible(true);
		}
	}
	class Mid extends JPanel{
		Mid(){
			this.setLayout(new GridLayout(4,4, 10 ,10));
			for(int i = 0; i<10; i++) {
				this.add(new JButton(Integer.toString(i)));
			}
			this.add(new JButton("CE"));
			this.add(new JButton("Calc"));
			var add_btn = new JButton("+");
			add_btn.setBackground(Color.BLUE);
			this.add(add_btn);
			add_btn = new JButton("-");
			add_btn.setBackground(Color.BLUE);
			this.add(add_btn);
			add_btn = new JButton("*");
			add_btn.setBackground(Color.BLUE);
			this.add(add_btn);
			add_btn = new JButton("/");
			add_btn.setBackground(Color.BLUE);
			this.add(add_btn);
			
		}
	}
	
	class Bottom extends JPanel{
		Bottom(){
			this.setLayout(new FlowLayout(FlowLayout.LEFT));
			this.add(new JLabel("resulte"));
			this.add(new JTextField(15));
			setBackground(Color.ORANGE);
			setSize(300, 100);
			setVisible(true);
		}
	}
	
	public static void main(String[] args) {
		new Calc();
	}

}

package javaswing;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FormTest {
	public static void main(String[] args) {
		JFrame form = new JFrame();
		
		form.setSize(800, 500);
		form.setTitle("First Swing App");
		form.setLayout(null);
		
		// create JLabel
		JLabel jl = new JLabel("Welcome");
		jl.setBounds(100, 120, 150, 30);
		form.add(jl);
		
		form.setVisible(true);
	}
}

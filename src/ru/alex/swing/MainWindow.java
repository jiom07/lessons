package ru.alex.swing;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainWindow extends JFrame{

	public static void main(String[] args)
	{
		MainWindow  window = new MainWindow();
		
		JPanel panel = new JPanel();
		JButton button1 = new JButton("Test");
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				button1.setText("Bingo");
				
			}
		});
		
		JLabel label1 = new JLabel("Test Label");
		panel.add(button1);
		panel.add(label1);
		
		window.add(panel);
		window.setSize(400,400);
		window.setVisible(true);
		
		

	}

}

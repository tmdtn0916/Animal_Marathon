package game;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class Frame extends JFrame{

	public Frame(String title) {
		    super(title);

		    this.setResizable(false);
		    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    setBounds(100, 100, 445, 567);
		    getContentPane().setLayout(new CardLayout(0, 0));
		    JPanel panel = new JPanel();
		    getContentPane().add(panel, "name_7306242585800");
		    panel.setLayout(null);
		    
		    JButton btnNewButton = new JButton("START");
		    btnNewButton.addActionListener(new ActionListener() {
		    	public void actionPerformed(ActionEvent e) {
		    		CardLayout c = (CardLayout)getContentPane().getLayout();
		    		c.next(getContentPane());
		    		new app();
		    		
		    	}
		    });
		    btnNewButton.setBounds(159, 236, 97, 23);
		    panel.add(btnNewButton);
		    
		    JPanel panel_1 = new JPanel();
		    getContentPane().add(panel_1, "name_7327005426500");
		    panel_1.setLayout(null);
		    
		    JButton btnNewButton_1 = new JButton("\uC8FC\uC0AC\uC704 \uAD74\uB9AC\uAE30");
		    btnNewButton_1.addActionListener(new ActionListener() {
		    	public void actionPerformed(ActionEvent e) {
		    		Dice();
		    		
		    		
		    	}
		    });
		    btnNewButton_1.setBounds(145, 421, 155, 23);
		    panel_1.add(btnNewButton_1);
		    
		    JTextArea textArea = new JTextArea();
		    textArea.setBounds(12, 87, 415, 259);
		    panel_1.add(textArea);
		    
		    JTextArea textArea_1 = new JTextArea();
		    textArea_1.setBounds(12, 21, 415, 32);
		    panel_1.add(textArea_1);
		  }
	
	
	
	public void Dice() {
		int dice1 = 0;
		int dice2 = 0;
		
		Random random = new Random();
		dice1 = random.nextInt(6) + 1;
		dice2 = random.nextInt(6) + 1;
		
		int sum = dice1 + dice2;

	}
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame frame = new Frame("CE Board Game");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}








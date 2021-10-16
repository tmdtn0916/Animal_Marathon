package game;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicBorders.RolloverButtonBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

import static game.Dice.*;

import static game.DiceImage.*;







public class Frame extends JFrame {
	public static int xpos = 0;
	public static int ypos = 0;
	
	int Turn = 0;
	
	
	private JPanel contentPane;
	
	View mView= new View();
	Dice dice = new Dice();
	
	
	
	public Frame() {
		
		getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, "name_2082211712500");
		panel.setLayout(null);
		
		getContentPane().add(mView, "name_2066570270000");
		mView.setLayout(null);
		
		
		
		JLabel lblNewLabel = new JLabel(""); //1ST_DICE
		lblNewLabel.setIcon(new ImageIcon(Frame.class.getResource("/images/Dice_1.png")));
		lblNewLabel.setBounds(925, 206, 222, 206);
		mView.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(""); //2ND_DICE
		lblNewLabel_1.setIcon(new ImageIcon(Frame.class.getResource("/images/Dice_2.png")));
		lblNewLabel_1.setBounds(1145, 206, 239, 208);
		mView.add(lblNewLabel_1);
		
		
		//
		//
		///
		//////
		/////
		//////
		////////
		////////
		
	
		
		
		JLabel man = new JLabel("");
		man.setIcon(new ImageIcon(Frame.class.getResource("/images/among.gif")));
		man.setLocation(xpos, ypos); // FIRST CHARACTER LOTATE;
		man.setSize(50, 50);
		mView.add(man);
		
		
		
		JButton btnNewButton_1 = new JButton("START");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c = (CardLayout)getContentPane().getLayout();
				c.next(getContentPane());
			}
		});
		btnNewButton_1.setBounds(485, 365, 437, 142);
		panel.add(btnNewButton_1);
		
		////
		//////
		///////
		/////
		//
		//
		//////
		//////
		/////
		/////
		JButton btnNewButton = new JButton("RollDice");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int value = dice.Roll(); 
				Turn++;
				
				//// DICE
				if(dice1 == 1) {
					lblNewLabel.setIcon(new ImageIcon(Frame.class.getResource(image1)));
				}
				
				else if(dice1 == 2) {
					lblNewLabel.setIcon(new ImageIcon(Frame.class.getResource(image2)));
				}
				
				
				else if(dice1 == 3) {
					lblNewLabel.setIcon(new ImageIcon(Frame.class.getResource(image3)));
				}
				
				else if(dice1 == 4) {
					lblNewLabel.setIcon(new ImageIcon(Frame.class.getResource(image4)));
				}
				
				
				else if(dice1 == 5) {
					lblNewLabel.setIcon(new ImageIcon(Frame.class.getResource(image5)));
				}
				
				
				else if(dice1 == 6) {
					lblNewLabel.setIcon(new ImageIcon(Frame.class.getResource(image6)));
				}
				
				if(dice2 == 1) {
					lblNewLabel_1.setIcon(new ImageIcon(Frame.class.getResource(image1)));
				}
				
				else if(dice2 == 2) {
					lblNewLabel_1.setIcon(new ImageIcon(Frame.class.getResource(image2)));
				}
				
				else if(dice2 == 3) {
					lblNewLabel_1.setIcon(new ImageIcon(Frame.class.getResource(image3)));
				}
				
				else if(dice2 == 4) {
					lblNewLabel_1.setIcon(new ImageIcon(Frame.class.getResource(image4)));
				}
				
				else if(dice2 == 5) {
					lblNewLabel_1.setIcon(new ImageIcon(Frame.class.getResource(image5)));
				}
				
				else if(dice2 == 6) {
					lblNewLabel_1.setIcon(new ImageIcon(Frame.class.getResource(image6)));
				}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				//man.setLocation(xpos--,ypos--);

			}
		});
		btnNewButton.setBounds(1084, 792, 150, 44);
		mView.add(btnNewButton);
		
		
		
		setTitle("CE Board Game");
		setSize(1400,1000);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	
	
	
	
}



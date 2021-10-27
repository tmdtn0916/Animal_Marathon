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
import java.awt.Canvas;
import java.awt.Dimension;







public class Frame extends JFrame {
	
	public int xpos = 000;
	public int ypos = 000;
	public int xpos_2 = 050;
	public int ypos_2 = 050;
	
	
	int turn = 1;
	
	
	private JPanel contentPane;
	
	View mView= new View();
	Dice dice = null;
	
	
	private JLabel lblNewLabel = null;
	private JLabel lblNewLabel_1 = null;
	private JLabel player1 = null;
	private JLabel player2 = null;
	
	
	
	public JLabel getLblNewLabel()
	{
		return lblNewLabel;
	}
	
	public JLabel getLblNewLabel_1()
	{
		return lblNewLabel_1;
	}
	
	
	
	
	
	
	public JLabel getPlayer1()
	{
		return player1;
	}
	
	public JLabel getPlayer2()
	{
		return player2;
	}
	
	
	
	private ElephantPlayer elephant;
	private PenguinPlayer penguin;
	
	
	public Frame() {
		dice = new Dice(this);
		elephant = new ElephantPlayer(this);
		penguin = new PenguinPlayer(this);
		
		getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, "name_2082211712500");
		panel.setLayout(null);
		
		getContentPane().add(mView, "name_2066570270000");
		mView.setLayout(null);
		
		
		
		lblNewLabel = new JLabel(""); //1ST_DICE
		lblNewLabel.setIcon(new ImageIcon(Frame.class.getResource("/images/Dice_1.png")));
		lblNewLabel.setBounds(925, 206, 222, 206);
		mView.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel(""); //2ND_DICE
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
		
	
		
		
		player1 = new JLabel("");
		player1.setIcon(new ImageIcon(Frame.class.getResource("/images/Player.png")));
		player1.setLocation(000, 000); // FIRST PLAYER LOCATION
		player1.setSize(50, 50);
		mView.add(player1);
		
		player2 = new JLabel("");
		player2.setIcon(new ImageIcon(Frame.class.getResource("/images/Player2.png")));
		player2.setLocation(050, 050); // SECOND PLAYER LOCATION
		player2.setSize(50, 50);
		mView.add(player2);
		
		
		
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
				
				
				
				//FIRST PLAYER MOVE
				if(turn == 1) {
					
					elephant.checkPos(value);
					turn = 2;
				}
				
				
				/// SECOND PLAYER MOVE
				else if(turn == 2) {
					
					penguin.checkPos(value);
					turn = 1;
				}
				


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



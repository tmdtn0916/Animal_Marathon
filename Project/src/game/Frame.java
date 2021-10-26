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
	int around = 0;
	int around_2 = 0;
	
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
		
	
		
		
		JLabel player1 = new JLabel("");
		player1.setIcon(new ImageIcon(Frame.class.getResource("/images/Player.png")));
		player1.setLocation(xpos, ypos); // FIRST PLAYER LOCATION
		player1.setSize(50, 50);
		mView.add(player1);
		
		JLabel player2 = new JLabel("");
		player2.setIcon(new ImageIcon(Frame.class.getResource("/images/Player2.png")));
		player2.setLocation(xpos_2, ypos_2); // SECOND PLAYER LOCATION
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
				
				
				
				//FIRST PLAYER MOVE
				if(turn == 1) {
					if(xpos == 000 && ypos == 000) {
						if	   (value == 2)		{xpos = 200;	ypos = 000;}
						else if(value == 3)		{xpos = 300;	ypos = 000;}
						else if(value == 4) 	{xpos = 400;	ypos = 000;}
						else if(value == 5) 	{xpos = 500;	ypos = 000;}
						else if(value == 6)		{xpos = 600;	ypos = 000;}
						else if(value == 7)		{xpos = 700;	ypos = 000;}
						else if(value == 8)		{xpos = 800;	ypos = 000;}
						else if(value == 9)		{xpos = 800;	ypos = 100;}
						else if(value == 10)	{xpos = 800;	ypos = 200;}
						else if(value == 11)	{xpos = 800;	ypos = 300;}
						else if(value == 12)	{xpos = 800;	ypos = 400;}
						player1.setLocation(xpos, ypos);
					}
				
					else if(xpos == 100 && ypos == 000) {
						if	   (value == 2)		{xpos = 300;	ypos = 000;}
						else if(value == 3)		{xpos = 400;	ypos = 000;}
						else if(value == 4) 	{xpos = 500;	ypos = 000;}
						else if(value == 5) 	{xpos = 600;	ypos = 000;}
						else if(value == 6)		{xpos = 700;	ypos = 000;}
						else if(value == 7)		{xpos = 800;	ypos = 000;}
						else if(value == 8)		{xpos = 800;	ypos = 100;}
						else if(value == 9)		{xpos = 800;	ypos = 200;}
						else if(value == 10)	{xpos = 800;	ypos = 300;}
						else if(value == 11)	{xpos = 800;	ypos = 400;}
						else if(value == 12)	{xpos = 800;	ypos = 500;}
						player1.setLocation(xpos, ypos);
					}
					
					else if(xpos == 200 && ypos == 000) {
						if	   (value == 2)		{xpos = 400;	ypos = 000;}
						else if(value == 3)		{xpos = 500;	ypos = 000;}
						else if(value == 4) 	{xpos = 600;	ypos = 000;}
						else if(value == 5) 	{xpos = 700;	ypos = 000;}
						else if(value == 6)		{xpos = 800;	ypos = 000;}
						else if(value == 7)		{xpos = 800;	ypos = 100;}
						else if(value == 8)		{xpos = 800;	ypos = 200;}
						else if(value == 9)		{xpos = 800;	ypos = 300;}
						else if(value == 10)	{xpos = 800;	ypos = 400;}
						else if(value == 11)	{xpos = 800;	ypos = 500;}
						else if(value == 12)	{xpos = 800;	ypos = 600;}
						player1.setLocation(xpos, ypos);
					}
					
					else if(xpos == 300 && ypos == 000) {
						if	   (value == 2)		{xpos = 500;	ypos = 000;}
						else if(value == 3)		{xpos = 600;	ypos = 000;}
						else if(value == 4) 	{xpos = 700;	ypos = 000;}
						else if(value == 5) 	{xpos = 800;	ypos = 000;}
						else if(value == 6)		{xpos = 800;	ypos = 100;}
						else if(value == 7)		{xpos = 800;	ypos = 200;}
						else if(value == 8)		{xpos = 800;	ypos = 300;}
						else if(value == 9)		{xpos = 800;	ypos = 400;}
						else if(value == 10)	{xpos = 800;	ypos = 500;}
						else if(value == 11)	{xpos = 800;	ypos = 600;}
						else if(value == 12)	{xpos = 800;	ypos = 700;}
						player1.setLocation(xpos, ypos);
					}
					
					else if(xpos == 400 && ypos == 000) {
						if	   (value == 2)		{xpos = 600;	ypos = 000;}
						else if(value == 3)		{xpos = 700;	ypos = 000;}
						else if(value == 4) 	{xpos = 800;	ypos = 000;}
						else if(value == 5) 	{xpos = 800;	ypos = 100;}
						else if(value == 6)		{xpos = 800;	ypos = 200;}
						else if(value == 7)		{xpos = 800;	ypos = 300;}
						else if(value == 8)		{xpos = 800;	ypos = 400;}
						else if(value == 9)		{xpos = 800;	ypos = 500;}
						else if(value == 10)	{xpos = 800;	ypos = 600;}
						else if(value == 11)	{xpos = 800;	ypos = 700;}
						else if(value == 12)	{xpos = 800;	ypos = 800;}
						player1.setLocation(xpos, ypos);
					}
					
					else if(xpos == 500 && ypos == 000) {
						if	   (value == 2)		{xpos = 700;	ypos = 000;}
						else if(value == 3)		{xpos = 800;	ypos = 000;}
						else if(value == 4) 	{xpos = 800;	ypos = 100;}
						else if(value == 5) 	{xpos = 800;	ypos = 200;}
						else if(value == 6)		{xpos = 800;	ypos = 300;}
						else if(value == 7)		{xpos = 800;	ypos = 400;}
						else if(value == 8)		{xpos = 800;	ypos = 500;}
						else if(value == 9)		{xpos = 800;	ypos = 600;}
						else if(value == 10)	{xpos = 800;	ypos = 700;}
						else if(value == 11)	{xpos = 800;	ypos = 800;}
						else if(value == 12)	{xpos = 700;	ypos = 800;}
						player1.setLocation(xpos, ypos);
					}
					
					else if(xpos == 600 && ypos == 000) {
						if	   (value == 2)		{xpos = 800;	ypos = 000;}
						else if(value == 3)		{xpos = 800;	ypos = 100;}
						else if(value == 4) 	{xpos = 800;	ypos = 200;}
						else if(value == 5) 	{xpos = 800;	ypos = 300;}
						else if(value == 6)		{xpos = 800;	ypos = 400;}
						else if(value == 7)		{xpos = 800;	ypos = 500;}
						else if(value == 8)		{xpos = 800;	ypos = 600;}
						else if(value == 9)		{xpos = 800;	ypos = 700;}
						else if(value == 10)	{xpos = 800;	ypos = 800;}
						else if(value == 11)	{xpos = 700;	ypos = 800;}
						else if(value == 12)	{xpos = 600;	ypos = 800;}
						player1.setLocation(xpos, ypos);
					}
					
					else if(xpos == 700 && ypos == 000) {
						if	   (value == 2)		{xpos = 800;	ypos = 100;}
						else if(value == 3)		{xpos = 800;	ypos = 200;}
						else if(value == 4) 	{xpos = 800;	ypos = 300;}
						else if(value == 5) 	{xpos = 800;	ypos = 400;}
						else if(value == 6)		{xpos = 800;	ypos = 500;}
						else if(value == 7)		{xpos = 800;	ypos = 600;}
						else if(value == 8)		{xpos = 800;	ypos = 700;}
						else if(value == 9)		{xpos = 800;	ypos = 800;}
						else if(value == 10)	{xpos = 700;	ypos = 800;}
						else if(value == 11)	{xpos = 600;	ypos = 800;}
						else if(value == 12)	{xpos = 500;	ypos = 800;}
						player1.setLocation(xpos, ypos);
					}
					
					else if(xpos == 800 && ypos == 000) {
						if	   (value == 2)		{xpos = 800;	ypos = 200;}
						else if(value == 3)		{xpos = 800;	ypos = 300;}
						else if(value == 4) 	{xpos = 800;	ypos = 400;}
						else if(value == 5) 	{xpos = 800;	ypos = 500;}
						else if(value == 6)		{xpos = 800;	ypos = 600;}
						else if(value == 7)		{xpos = 800;	ypos = 700;}
						else if(value == 8)		{xpos = 800;	ypos = 800;}
						else if(value == 9)		{xpos = 700;	ypos = 800;}
						else if(value == 10)	{xpos = 600;	ypos = 800;}
						else if(value == 11)	{xpos = 500;	ypos = 800;}
						else if(value == 12)	{xpos = 400;	ypos = 800;}
						player1.setLocation(xpos, ypos);
					}
					
					else if(xpos == 800 && ypos == 100) {
						if	   (value == 2)		{xpos = 800;	ypos = 300;}
						else if(value == 3)		{xpos = 800;	ypos = 400;}
						else if(value == 4) 	{xpos = 800;	ypos = 500;}
						else if(value == 5) 	{xpos = 800;	ypos = 600;}
						else if(value == 6)		{xpos = 800;	ypos = 700;}
						else if(value == 7)		{xpos = 800;	ypos = 800;}
						else if(value == 8)		{xpos = 700;	ypos = 800;}
						else if(value == 9)		{xpos = 600;	ypos = 800;}
						else if(value == 10)	{xpos = 500;	ypos = 800;}
						else if(value == 11)	{xpos = 400;	ypos = 800;}
						else if(value == 12)	{xpos = 300;	ypos = 800;}
						player1.setLocation(xpos, ypos);
					}
					
					else if(xpos == 800 && ypos == 200) {
						if	   (value == 2)		{xpos = 800;	ypos = 400;}
						else if(value == 3)		{xpos = 800;	ypos = 500;}
						else if(value == 4) 	{xpos = 800;	ypos = 600;}
						else if(value == 5) 	{xpos = 800;	ypos = 700;}
						else if(value == 6)		{xpos = 800;	ypos = 800;}
						else if(value == 7)		{xpos = 700;	ypos = 800;}
						else if(value == 8)		{xpos = 600;	ypos = 800;}
						else if(value == 9)		{xpos = 500;	ypos = 800;}
						else if(value == 10)	{xpos = 400;	ypos = 800;}
						else if(value == 11)	{xpos = 300;	ypos = 800;}
						else if(value == 12)	{xpos = 200;	ypos = 800;}
						player1.setLocation(xpos, ypos);
					}
					
					else if(xpos == 800 && ypos == 300) {
						if	   (value == 2)		{xpos = 800;	ypos = 500;}
						else if(value == 3)		{xpos = 800;	ypos = 600;}
						else if(value == 4) 	{xpos = 800;	ypos = 700;}
						else if(value == 5) 	{xpos = 800;	ypos = 800;}
						else if(value == 6)		{xpos = 700;	ypos = 800;}
						else if(value == 7)		{xpos = 600;	ypos = 800;}
						else if(value == 8)		{xpos = 500;	ypos = 800;}
						else if(value == 9)		{xpos = 400;	ypos = 800;}
						else if(value == 10)	{xpos = 300;	ypos = 800;}
						else if(value == 11)	{xpos = 200;	ypos = 800;}
						else if(value == 12)	{xpos = 100;	ypos = 800;}
						player1.setLocation(xpos, ypos);
					}
					
					else if(xpos == 800 && ypos == 400) {
						if	   (value == 2)		{xpos = 800;	ypos = 600;}
						else if(value == 3)		{xpos = 800;	ypos = 700;}
						else if(value == 4) 	{xpos = 800;	ypos = 800;}
						else if(value == 5) 	{xpos = 700;	ypos = 800;}
						else if(value == 6)		{xpos = 600;	ypos = 800;}
						else if(value == 7)		{xpos = 500;	ypos = 800;}
						else if(value == 8)		{xpos = 400;	ypos = 800;}
						else if(value == 9)		{xpos = 300;	ypos = 800;}
						else if(value == 10)	{xpos = 200;	ypos = 800;}
						else if(value == 11)	{xpos = 100;	ypos = 800;}
						else if(value == 12)	{xpos = 000;	ypos = 800;}
						player1.setLocation(xpos, ypos);
					}
					
					else if(xpos == 800 && ypos == 500) {
						if	   (value == 2)		{xpos = 800;	ypos = 700;}
						else if(value == 3)		{xpos = 800;	ypos = 800;}
						else if(value == 4) 	{xpos = 700;	ypos = 800;}
						else if(value == 5) 	{xpos = 600;	ypos = 800;}
						else if(value == 6)		{xpos = 500;	ypos = 800;}
						else if(value == 7)		{xpos = 400;	ypos = 800;}
						else if(value == 8)		{xpos = 300;	ypos = 800;}
						else if(value == 9)		{xpos = 200;	ypos = 800;}
						else if(value == 10)	{xpos = 100;	ypos = 800;}
						else if(value == 11)	{xpos = 000;	ypos = 800;}
						else if(value == 12)	{xpos = 000;	ypos = 700;}
						player1.setLocation(xpos, ypos);
					}
					
					else if(xpos == 800 && ypos == 600) {
						if	   (value == 2)		{xpos = 800;	ypos = 800;}
						else if(value == 3)		{xpos = 700;	ypos = 800;}
						else if(value == 4) 	{xpos = 600;	ypos = 800;}
						else if(value == 5) 	{xpos = 500;	ypos = 800;}
						else if(value == 6)		{xpos = 400;	ypos = 800;}
						else if(value == 7)		{xpos = 300;	ypos = 800;}
						else if(value == 8)		{xpos = 200;	ypos = 800;}
						else if(value == 9)		{xpos = 100;	ypos = 800;}
						else if(value == 10)	{xpos = 000;	ypos = 800;}
						else if(value == 11)	{xpos = 000;	ypos = 700;}
						else if(value == 12)	{xpos = 000;	ypos = 600;}
						player1.setLocation(xpos, ypos);
					}
					
					else if(xpos == 800 && ypos == 700) {
						if	   (value == 2)		{xpos = 700;	ypos = 800;}
						else if(value == 3)		{xpos = 600;	ypos = 800;}
						else if(value == 4) 	{xpos = 500;	ypos = 800;}
						else if(value == 5) 	{xpos = 400;	ypos = 800;}
						else if(value == 6)		{xpos = 300;	ypos = 800;}
						else if(value == 7)		{xpos = 200;	ypos = 800;}
						else if(value == 8)		{xpos = 100;	ypos = 800;}
						else if(value == 9)		{xpos = 000;	ypos = 800;}
						else if(value == 10)	{xpos = 000;	ypos = 700;}
						else if(value == 11)	{xpos = 000;	ypos = 600;}
						else if(value == 12)	{xpos = 000;	ypos = 500;}
						player1.setLocation(xpos, ypos);
					}
					
					else if(xpos == 800 && ypos == 800) {
						if	   (value == 2)		{xpos = 600;	ypos = 800;}
						else if(value == 3)		{xpos = 500;	ypos = 800;}
						else if(value == 4) 	{xpos = 400;	ypos = 800;}
						else if(value == 5) 	{xpos = 300;	ypos = 800;}
						else if(value == 6)		{xpos = 200;	ypos = 800;}
						else if(value == 7)		{xpos = 100;	ypos = 800;}
						else if(value == 8)		{xpos = 000;	ypos = 800;}
						else if(value == 9)		{xpos = 000;	ypos = 700;}
						else if(value == 10)	{xpos = 000;	ypos = 600;}
						else if(value == 11)	{xpos = 000;	ypos = 500;}
						else if(value == 12)	{xpos = 000;	ypos = 400;}
						player1.setLocation(xpos, ypos);
					}
					
					else if(xpos == 700 && ypos == 800) {
						if	   (value == 2)		{xpos = 500;	ypos = 800;}
						else if(value == 3)		{xpos = 400;	ypos = 800;}
						else if(value == 4) 	{xpos = 300;	ypos = 800;}
						else if(value == 5) 	{xpos = 200;	ypos = 800;}
						else if(value == 6)		{xpos = 100;	ypos = 800;}
						else if(value == 7)		{xpos = 000;	ypos = 800;}
						else if(value == 8)		{xpos = 000;	ypos = 700;}
						else if(value == 9)		{xpos = 000;	ypos = 600;}
						else if(value == 10)	{xpos = 000;	ypos = 500;}
						else if(value == 11)	{xpos = 000;	ypos = 400;}
						else if(value == 12)	{xpos = 000;	ypos = 300;}
						player1.setLocation(xpos, ypos);
					}
					
					else if(xpos == 600 && ypos == 800) {
						if	   (value == 2)		{xpos = 400;	ypos = 800;}
						else if(value == 3)		{xpos = 300;	ypos = 800;}
						else if(value == 4) 	{xpos = 200;	ypos = 800;}
						else if(value == 5) 	{xpos = 100;	ypos = 800;}
						else if(value == 6)		{xpos = 000;	ypos = 800;}
						else if(value == 7)		{xpos = 000;	ypos = 700;}
						else if(value == 8)		{xpos = 000;	ypos = 600;}
						else if(value == 9)		{xpos = 000;	ypos = 500;}
						else if(value == 10)	{xpos = 000;	ypos = 400;}
						else if(value == 11)	{xpos = 000;	ypos = 300;}
						else if(value == 12)	{xpos = 000;	ypos = 200;}
						player1.setLocation(xpos, ypos);
					}
					
					else if(xpos == 500 && ypos == 800) {
						if	   (value == 2)		{xpos = 300;	ypos = 800;}
						else if(value == 3)		{xpos = 200;	ypos = 800;}
						else if(value == 4) 	{xpos = 100;	ypos = 800;}
						else if(value == 5) 	{xpos = 000;	ypos = 800;}
						else if(value == 6)		{xpos = 000;	ypos = 700;}
						else if(value == 7)		{xpos = 000;	ypos = 600;}
						else if(value == 8)		{xpos = 000;	ypos = 500;}
						else if(value == 9)		{xpos = 000;	ypos = 400;}
						else if(value == 10)	{xpos = 000;	ypos = 300;}
						else if(value == 11)	{xpos = 000;	ypos = 200;}
						else if(value == 12)	{xpos = 000;	ypos = 100;}
						player1.setLocation(xpos, ypos);
					}
					
					else if(xpos == 400 && ypos == 800) {
						if	   (value == 2)		{xpos = 200;	ypos = 800;}
						else if(value == 3)		{xpos = 100;	ypos = 800;}
						else if(value == 4) 	{xpos = 000;	ypos = 800;}
						else if(value == 5) 	{xpos = 000;	ypos = 700;}
						else if(value == 6)		{xpos = 000;	ypos = 600;}
						else if(value == 7)		{xpos = 000;	ypos = 500;}
						else if(value == 8)		{xpos = 000;	ypos = 400;}
						else if(value == 9)		{xpos = 000;	ypos = 300;}
						else if(value == 10)	{xpos = 000;	ypos = 200;}
						else if(value == 11)	{xpos = 000;	ypos = 100;}
						else if(value == 12)	{xpos = 000;	ypos = 000;}
						player1.setLocation(xpos, ypos);
					}
					
					else if(xpos == 300 && ypos == 800) {
						if	   (value == 2)		{xpos = 100;	ypos = 800;}
						else if(value == 3)		{xpos = 000;	ypos = 800;}
						else if(value == 4) 	{xpos = 000;	ypos = 700;}
						else if(value == 5) 	{xpos = 000;	ypos = 600;}
						else if(value == 6)		{xpos = 000;	ypos = 500;}
						else if(value == 7)		{xpos = 000;	ypos = 400;}
						else if(value == 8)		{xpos = 000;	ypos = 300;}
						else if(value == 9)		{xpos = 000;	ypos = 200;}
						else if(value == 10)	{xpos = 000;	ypos = 100;}
						else if(value == 11)	{xpos = 000;	ypos = 000;}
						else if(value == 12)	{xpos = 100;	ypos = 000;}
						player1.setLocation(xpos, ypos);
					}
					
					else if(xpos == 200 && ypos == 800) {
						if	   (value == 2)		{xpos = 000;	ypos = 800;}
						else if(value == 3)		{xpos = 000;	ypos = 700;}
						else if(value == 4) 	{xpos = 000;	ypos = 600;}
						else if(value == 5) 	{xpos = 000;	ypos = 500;}
						else if(value == 6)		{xpos = 000;	ypos = 400;}
						else if(value == 7)		{xpos = 000;	ypos = 300;}
						else if(value == 8)		{xpos = 000;	ypos = 200;}
						else if(value == 9)		{xpos = 000;	ypos = 100;}
						else if(value == 10)	{xpos = 000;	ypos = 000;}
						else if(value == 11)	{xpos = 100;	ypos = 000;}
						else if(value == 12)	{xpos = 200;	ypos = 000;}
						player1.setLocation(xpos, ypos);
					}
					
					else if(xpos == 100 && ypos == 800) {
						if	   (value == 2)		{xpos = 000;	ypos = 700;}
						else if(value == 3)		{xpos = 000;	ypos = 600;}
						else if(value == 4) 	{xpos = 000;	ypos = 500;}
						else if(value == 5) 	{xpos = 000;	ypos = 400;}
						else if(value == 6)		{xpos = 000;	ypos = 300;}
						else if(value == 7)		{xpos = 000;	ypos = 200;}
						else if(value == 8)		{xpos = 000;	ypos = 100;}
						else if(value == 9)		{xpos = 000;	ypos = 000;}
						else if(value == 10)	{xpos = 100;	ypos = 000;}
						else if(value == 11)	{xpos = 200;	ypos = 000;}
						else if(value == 12)	{xpos = 300;	ypos = 000;}
						player1.setLocation(xpos, ypos);
					}
					
					else if(xpos == 000 && ypos == 800) {
						if	   (value == 2)		{xpos = 000;	ypos = 600;}
						else if(value == 3)		{xpos = 000;	ypos = 500;}
						else if(value == 4) 	{xpos = 000;	ypos = 400;}
						else if(value == 5) 	{xpos = 000;	ypos = 300;}
						else if(value == 6)		{xpos = 000;	ypos = 200;}
						else if(value == 7)		{xpos = 000;	ypos = 100;}
						else if(value == 8)		{xpos = 000;	ypos = 000;}
						else if(value == 9)		{xpos = 100;	ypos = 000;}
						else if(value == 10)	{xpos = 200;	ypos = 000;}
						else if(value == 11)	{xpos = 300;	ypos = 000;}
						else if(value == 12)	{xpos = 400;	ypos = 000;}
						player1.setLocation(xpos, ypos);
					}
					
					else if(xpos == 000 && ypos == 700) {
						if	   (value == 2)		{xpos = 000;	ypos = 500;}
						else if(value == 3)		{xpos = 000;	ypos = 400;}
						else if(value == 4) 	{xpos = 000;	ypos = 300;}
						else if(value == 5) 	{xpos = 000;	ypos = 200;}
						else if(value == 6)		{xpos = 000;	ypos = 100;}
						else if(value == 7)		{xpos = 000;	ypos = 000;}
						else if(value == 8)		{xpos = 100;	ypos = 000;}
						else if(value == 9)		{xpos = 200;	ypos = 000;}
						else if(value == 10)	{xpos = 300;	ypos = 000;}
						else if(value == 11)	{xpos = 400;	ypos = 000;}
						else if(value == 12)	{xpos = 500;	ypos = 000;}
						player1.setLocation(xpos, ypos);
					}
					
					else if(xpos == 000 && ypos == 600) {
						if	   (value == 2)		{xpos = 000;	ypos = 400;}
						else if(value == 3)		{xpos = 000;	ypos = 300;}
						else if(value == 4) 	{xpos = 000;	ypos = 200;}
						else if(value == 5) 	{xpos = 000;	ypos = 100;}
						else if(value == 6)		{xpos = 000;	ypos = 000;}
						else if(value == 7)		{xpos = 100;	ypos = 000;}
						else if(value == 8)		{xpos = 200;	ypos = 000;}
						else if(value == 9)		{xpos = 300;	ypos = 000;}
						else if(value == 10)	{xpos = 400;	ypos = 000;}
						else if(value == 11)	{xpos = 500;	ypos = 000;}
						else if(value == 12)	{xpos = 600;	ypos = 000;}
						player1.setLocation(xpos, ypos);
					}
					
					else if(xpos == 000 && ypos == 500) {
						if	   (value == 2)		{xpos = 000;	ypos = 300;}
						else if(value == 3)		{xpos = 000;	ypos = 200;}
						else if(value == 4) 	{xpos = 000;	ypos = 100;}
						else if(value == 5) 	{xpos = 000;	ypos = 000;}
						else if(value == 6)		{xpos = 100;	ypos = 000;}
						else if(value == 7)		{xpos = 200;	ypos = 000;}
						else if(value == 8)		{xpos = 300;	ypos = 000;}
						else if(value == 9)		{xpos = 400;	ypos = 000;}
						else if(value == 10)	{xpos = 500;	ypos = 000;}
						else if(value == 11)	{xpos = 600;	ypos = 000;}
						else if(value == 12)	{xpos = 700;	ypos = 000;}
						player1.setLocation(xpos, ypos);
					}
					
					else if(xpos == 000 && ypos == 400) {
						if	   (value == 2)		{xpos = 000;	ypos = 200;}
						else if(value == 3)		{xpos = 000;	ypos = 100;}
						else if(value == 4) 	{xpos = 000;	ypos = 000;}
						else if(value == 5) 	{xpos = 100;	ypos = 000;}
						else if(value == 6)		{xpos = 200;	ypos = 000;}
						else if(value == 7)		{xpos = 300;	ypos = 000;}
						else if(value == 8)		{xpos = 400;	ypos = 000;}
						else if(value == 9)		{xpos = 500;	ypos = 000;}
						else if(value == 10)	{xpos = 600;	ypos = 000;}
						else if(value == 11)	{xpos = 700;	ypos = 000;}
						else if(value == 12)	{xpos = 800;	ypos = 000;}
						player1.setLocation(xpos, ypos);
					}
					
					else if(xpos == 000 && ypos == 300) {
						if	   (value == 2)		{xpos = 000;	ypos = 100;}
						else if(value == 3)		{xpos = 000;	ypos = 000;}
						else if(value == 4) 	{xpos = 100;	ypos = 000;}
						else if(value == 5) 	{xpos = 200;	ypos = 000;}
						else if(value == 6)		{xpos = 300;	ypos = 000;}
						else if(value == 7)		{xpos = 400;	ypos = 000;}
						else if(value == 8)		{xpos = 500;	ypos = 000;}
						else if(value == 9)		{xpos = 600;	ypos = 000;}
						else if(value == 10)	{xpos = 700;	ypos = 000;}
						else if(value == 11)	{xpos = 800;	ypos = 000;}
						else if(value == 12)	{xpos = 800;	ypos = 100;}
						player1.setLocation(xpos, ypos);
					}
					
					else if(xpos == 000 && ypos == 200) {
						if	   (value == 2)		{xpos = 000;	ypos = 000;}
						else if(value == 3)		{xpos = 100;	ypos = 000;}
						else if(value == 4) 	{xpos = 200;	ypos = 000;}
						else if(value == 5) 	{xpos = 300;	ypos = 000;}
						else if(value == 6)		{xpos = 400;	ypos = 000;}
						else if(value == 7)		{xpos = 500;	ypos = 000;}
						else if(value == 8)		{xpos = 600;	ypos = 000;}
						else if(value == 9)		{xpos = 700;	ypos = 000;}
						else if(value == 10)	{xpos = 800;	ypos = 000;}
						else if(value == 11)	{xpos = 800;	ypos = 100;}
						else if(value == 12)	{xpos = 800;	ypos = 200;}
						player1.setLocation(xpos, ypos);
					}
					
					else if(xpos == 000 && ypos == 100) {
						if	   (value == 2)		{xpos = 100;	ypos = 000;}
						else if(value == 3)		{xpos = 200;	ypos = 000;}
						else if(value == 4) 	{xpos = 300;	ypos = 000;}
						else if(value == 5) 	{xpos = 400;	ypos = 000;}
						else if(value == 6)		{xpos = 500;	ypos = 000;}
						else if(value == 7)		{xpos = 600;	ypos = 000;}
						else if(value == 8)		{xpos = 700;	ypos = 000;}
						else if(value == 9)		{xpos = 800;	ypos = 000;}
						else if(value == 10)	{xpos = 800;	ypos = 100;}
						else if(value == 11)	{xpos = 800;	ypos = 200;}
						else if(value == 12)	{xpos = 800;	ypos = 300;}
						player1.setLocation(xpos, ypos);
					}
					
					
					System.out.println(value +"   "+xpos + "   " + ypos);
					
					
					turn = 2;
				}
				
				
				/////// SECOND PLAYER MOVE
				else if(turn == 2) {
					if(xpos_2 == 050 && ypos_2 == 050) {
						if	   (value == 2) 	 xpos_2 = 250;
						else if(value == 3) 	 xpos_2 = 350;
						else if(value == 4) 	 xpos_2 = 450;
						else if(value == 5) 	 xpos_2 = 550;
						else if(value == 6) 	 xpos_2 = 650;
						else if(value == 7) 	 xpos_2 = 750;
						else if(value == 8) 	 xpos_2 = 850;
						else if(value == 9) 	{xpos_2 = 850;	ypos_2 = 150;}
						else if(value == 10) 	{xpos_2 = 850;	ypos_2 = 250;}
						else if(value == 11) 	{xpos_2 = 850;	ypos_2 = 350;}
						else if(value == 12) 	{xpos_2 = 850;	ypos_2 = 450;}
						player2.setLocation(xpos_2, ypos_2);
					}
					
					
					else if(xpos_2 == 150 && ypos_2 == 050) {
						if	   (value == 2) 	 xpos_2 = 350;
						else if(value == 3) 	 xpos_2 = 450;
						else if(value == 4)		 xpos_2 = 550;
						else if(value == 5) 	 xpos_2 = 650;
						else if(value == 6) 	 xpos_2 = 750;
						else if(value == 7) 	 xpos_2 = 850;
						else if(value == 8)     {xpos_2 = 850;	ypos_2 = 150;}
						else if(value == 9)     {xpos_2 = 850;	ypos_2 = 250;}
						else if(value == 10)    {xpos_2 = 850;	ypos_2 = 350;}
						else if(value == 11)    {xpos_2 = 850;	ypos_2 = 450;}
						else if(value == 12)	{xpos_2 = 850;	ypos_2 = 550;}
						player2.setLocation(xpos_2, ypos_2);
					}
					
					
					else if(xpos_2 == 250 && ypos_2 == 050) {
						if	   (value == 2) 	 xpos_2 = 450;
						else if(value == 3) 	 xpos_2 = 550;
						else if(value == 4) 	 xpos_2 = 650;
						else if(value == 5) 	 xpos_2 = 750;
						else if(value == 6) 	 xpos_2 = 850;
						else if(value == 7)     {xpos_2 = 850;	ypos_2 = 150;}
						else if(value == 8)     {xpos_2 = 850;	ypos_2 = 250;}
						else if(value == 9)     {xpos_2 = 850;	ypos_2 = 350;}
						else if(value == 10)    {xpos_2 = 850;	ypos_2 = 450;}
						else if(value == 11)    {xpos_2 = 850;	ypos_2 = 550;}
						else if(value == 12)	{xpos_2 = 850;	ypos_2 = 650;}
						player2.setLocation(xpos_2, ypos_2);
					}
					
					
					else if(xpos_2 == 350 && ypos_2 == 050) {
						if	   (value == 2) 	 xpos_2 = 550;
						else if(value == 3) 	 xpos_2 = 650;
						else if(value == 4) 	 xpos_2 = 750;
						else if(value == 5)		 xpos_2 = 850;
						else if(value == 6) 	{xpos_2 = 850;	ypos_2 = 150;}
						else if(value == 7) 	{xpos_2 = 850;	ypos_2 = 250;}
						else if(value == 8) 	{xpos_2 = 850;	ypos_2 = 350;}
						else if(value == 9) 	{xpos_2 = 850;	ypos_2 = 450;}
						else if(value == 10) 	{xpos_2 = 850;	ypos_2 = 550;}
						else if(value == 11) 	{xpos_2 = 850;	ypos_2 = 650;}
						else if(value == 12) 	{xpos_2 = 850;	ypos_2 = 750;}
						player2.setLocation(xpos_2, ypos_2);
					}
					
					
					else if(xpos_2 == 450 && ypos_2 == 050) {
						if	   (value == 2) 	 xpos_2 = 650;
						else if(value == 3) 	 xpos_2 = 750;
						else if(value == 4) 	 xpos_2 = 850;
						else if(value == 5) 	{xpos_2 = 850;	ypos_2 = 150;}
						else if(value == 6) 	{xpos_2 = 850;	ypos_2 = 250;}
						else if(value == 7) 	{xpos_2 = 850;	ypos_2 = 350;}
						else if(value == 8) 	{xpos_2 = 850;	ypos_2 = 450;}
						else if(value == 9) 	{xpos_2 = 850;	ypos_2 = 550;}
						else if(value == 10) 	{xpos_2 = 850;	ypos_2 = 650;}
						else if(value == 11) 	{xpos_2 = 850;	ypos_2 = 750;}
						else if(value == 12) 	{xpos_2 = 850;	ypos_2 = 850;}
						player2.setLocation(xpos_2, ypos_2);					
					}
				
					else if(xpos_2 == 550 && ypos_2 == 050) {
						if	   (value == 2) 	 xpos_2 = 750;
						else if(value == 3) 	 xpos_2 = 850;
						else if(value == 4) 	{xpos_2 = 850;	ypos_2 = 150;}
						else if(value == 5) 	{xpos_2 = 850;	ypos_2 = 250;}
						else if(value == 6) 	{xpos_2 = 850;	ypos_2 = 350;}
						else if(value == 7) 	{xpos_2 = 850;	ypos_2 = 450;}
						else if(value == 8) 	{xpos_2 = 850;	ypos_2 = 550;}
						else if(value == 9) 	{xpos_2 = 850;	ypos_2 = 650;}
						else if(value == 10) 	{xpos_2 = 850;	ypos_2 = 750;}
						else if(value == 11) 	{xpos_2 = 850;	ypos_2 = 850;}
						else if(value == 12) 	{xpos_2 = 750;	ypos_2 = 850;}
						player2.setLocation(xpos_2, ypos_2);					
					}
					
					else if(xpos_2 == 650 && ypos_2 == 050) {
						if	   (value == 2) 	 xpos_2 = 850;
						else if(value == 3) 	{xpos_2 = 850;	ypos_2 = 150;}
						else if(value == 4) 	{xpos_2 = 850;	ypos_2 = 250;}
						else if(value == 5) 	{xpos_2 = 850;	ypos_2 = 350;}
						else if(value == 6) 	{xpos_2 = 850;	ypos_2 = 450;}
						else if(value == 7) 	{xpos_2 = 850;	ypos_2 = 550;}
						else if(value == 8) 	{xpos_2 = 850;	ypos_2 = 650;}
						else if(value == 9) 	{xpos_2 = 850;	ypos_2 = 750;}
						else if(value == 10) 	{xpos_2 = 850;	ypos_2 = 850;}
						else if(value == 11) 	{xpos_2 = 750;	ypos_2 = 850;}
						else if(value == 12) 	{xpos_2 = 650;	ypos_2 = 850;}
						player2.setLocation(xpos_2, ypos_2);					
					}
					
					else if(xpos_2 == 750 && ypos_2 == 050) {
						if	   (value == 2) 	{xpos_2 = 850;	ypos_2 = 150;}
						else if(value == 3) 	{xpos_2 = 850;	ypos_2 = 250;}
						else if(value == 4) 	{xpos_2 = 850;	ypos_2 = 350;}
						else if(value == 5) 	{xpos_2 = 850;	ypos_2 = 450;}
						else if(value == 6) 	{xpos_2 = 850;	ypos_2 = 550;}
						else if(value == 7) 	{xpos_2 = 850;	ypos_2 = 650;}
						else if(value == 8) 	{xpos_2 = 850;	ypos_2 = 750;}
						else if(value == 9) 	{xpos_2 = 850;	ypos_2 = 850;}
						else if(value == 10) 	{xpos_2 = 750;	ypos_2 = 850;}
						else if(value == 11) 	{xpos_2 = 650;	ypos_2 = 850;}
						else if(value == 12) 	{xpos_2 = 550;	ypos_2 = 850;}
						player2.setLocation(xpos_2, ypos_2);				
					}
					
					else if(xpos_2 == 850 && ypos_2 == 050) {
						if	   (value == 2) 	{xpos_2 = 850;	ypos_2 = 250;}
						else if(value == 3) 	{xpos_2 = 850;	ypos_2 = 350;}
						else if(value == 4) 	{xpos_2 = 850;	ypos_2 = 450;}
						else if(value == 5) 	{xpos_2 = 850;	ypos_2 = 550;}
						else if(value == 6) 	{xpos_2 = 850;	ypos_2 = 650;}
						else if(value == 7) 	{xpos_2 = 850;	ypos_2 = 750;}
						else if(value == 8) 	{xpos_2 = 850;	ypos_2 = 850;}
						else if(value == 9) 	{xpos_2 = 750;	ypos_2 = 850;}
						else if(value == 10) 	{xpos_2 = 650;	ypos_2 = 850;}
						else if(value == 11) 	{xpos_2 = 550;	ypos_2 = 850;}
						else if(value == 12) 	{xpos_2 = 450;	ypos_2 = 850;}
						player2.setLocation(xpos_2, ypos_2);					
					}
					
					
					else if(xpos_2 == 850 && ypos_2 == 150) {
						if	   (value == 2) 	{xpos_2 = 850;	ypos_2 = 350;}
						else if(value == 3) 	{xpos_2 = 850;	ypos_2 = 450;}
						else if(value == 4) 	{xpos_2 = 850;	ypos_2 = 550;}
						else if(value == 5) 	{xpos_2 = 850;	ypos_2 = 650;}
						else if(value == 6) 	{xpos_2 = 850;	ypos_2 = 750;}
						else if(value == 7) 	{xpos_2 = 850;	ypos_2 = 850;}
						else if(value == 8) 	{xpos_2 = 750;	ypos_2 = 850;}
						else if(value == 9) 	{xpos_2 = 650;	ypos_2 = 850;}
						else if(value == 10) 	{xpos_2 = 550;	ypos_2 = 850;}
						else if(value == 11) 	{xpos_2 = 450;	ypos_2 = 850;}
						else if(value == 12) 	{xpos_2 = 350;	ypos_2 = 850;}
						player2.setLocation(xpos_2, ypos_2);					
					}
					
					else if(xpos_2 == 850 && ypos_2 == 250) {
						if	   (value == 2) 	{xpos_2 = 850;	ypos_2 = 450;}
						else if(value == 3) 	{xpos_2 = 850;	ypos_2 = 550;}
						else if(value == 4) 	{xpos_2 = 850;	ypos_2 = 650;}
						else if(value == 5) 	{xpos_2 = 850;	ypos_2 = 750;}
						else if(value == 6) 	{xpos_2 = 850;	ypos_2 = 850;}
						else if(value == 7) 	{xpos_2 = 750;	ypos_2 = 850;}
						else if(value == 8) 	{xpos_2 = 650;	ypos_2 = 850;}
						else if(value == 9) 	{xpos_2 = 550;	ypos_2 = 850;}
						else if(value == 10) 	{xpos_2 = 450;	ypos_2 = 850;}
						else if(value == 11) 	{xpos_2 = 350;	ypos_2 = 850;}
						else if(value == 12) 	{xpos_2 = 250;	ypos_2 = 850;}
						player2.setLocation(xpos_2, ypos_2);					
					}

					else if(xpos_2 == 850 && ypos_2 == 350) {
						if	   (value == 2) 	{xpos_2 = 850;	ypos_2 = 550;}
						else if(value == 3) 	{xpos_2 = 850;	ypos_2 = 650;}
						else if(value == 4) 	{xpos_2 = 850;	ypos_2 = 750;}
						else if(value == 5) 	{xpos_2 = 850;	ypos_2 = 850;}
						else if(value == 6) 	{xpos_2 = 750;	ypos_2 = 850;}
						else if(value == 7) 	{xpos_2 = 650;	ypos_2 = 850;}
						else if(value == 8) 	{xpos_2 = 550;	ypos_2 = 850;}
						else if(value == 9) 	{xpos_2 = 450;	ypos_2 = 850;}
						else if(value == 10) 	{xpos_2 = 350;	ypos_2 = 850;}
						else if(value == 11) 	{xpos_2 = 250;	ypos_2 = 850;}
						else if(value == 12) 	{xpos_2 = 150;	ypos_2 = 850;}
						player2.setLocation(xpos_2, ypos_2);					
					}
					
					else if(xpos_2 == 850 && ypos_2 == 450) {
						if	   (value == 2) 	{xpos_2 = 850;	ypos_2 = 650;}
						else if(value == 3) 	{xpos_2 = 850;	ypos_2 = 750;}
						else if(value == 4) 	{xpos_2 = 850;	ypos_2 = 850;}
						else if(value == 5) 	{xpos_2 = 750;	ypos_2 = 850;}
						else if(value == 6) 	{xpos_2 = 650;	ypos_2 = 850;}
						else if(value == 7) 	{xpos_2 = 550;	ypos_2 = 850;}
						else if(value == 8) 	{xpos_2 = 450;	ypos_2 = 850;}
						else if(value == 9) 	{xpos_2 = 350;	ypos_2 = 850;}
						else if(value == 10) 	{xpos_2 = 250;	ypos_2 = 850;}
						else if(value == 11) 	{xpos_2 = 150;	ypos_2 = 850;}
						else if(value == 12) 	{xpos_2 = 050;	ypos_2 = 850;}
						
						player2.setLocation(xpos_2, ypos_2);					
					}
					
					else if(xpos_2 == 850 && ypos_2 == 550) {
						if	   (value == 2) 	{xpos_2 = 850;	ypos_2 = 750;}
						else if(value == 3) 	{xpos_2 = 850;	ypos_2 = 850;}
						else if(value == 4) 	{xpos_2 = 750;	ypos_2 = 850;}
						else if(value == 5) 	{xpos_2 = 650;	ypos_2 = 850;}
						else if(value == 6) 	{xpos_2 = 550;	ypos_2 = 850;}
						else if(value == 7) 	{xpos_2 = 450;	ypos_2 = 850;}
						else if(value == 8) 	{xpos_2 = 350;	ypos_2 = 850;}
						else if(value == 9) 	{xpos_2 = 250;	ypos_2 = 850;}
						else if(value == 10) 	{xpos_2 = 150;	ypos_2 = 850;}
						else if(value == 11) 	{xpos_2 = 050;	ypos_2 = 850;}
						else if(value == 12) 	{xpos_2 = 050;	ypos_2 = 750;}
						
						player2.setLocation(xpos_2, ypos_2);					
					}
					
					else if(xpos_2 == 850 && ypos_2 == 650) {
						if	   (value == 2) 	{xpos_2 = 850;	ypos_2 = 850;}
						else if(value == 3) 	{xpos_2 = 750;	ypos_2 = 850;}
						else if(value == 4) 	{xpos_2 = 650;	ypos_2 = 850;}
						else if(value == 5) 	{xpos_2 = 550;	ypos_2 = 850;}
						else if(value == 6) 	{xpos_2 = 450;	ypos_2 = 850;}
						else if(value == 7) 	{xpos_2 = 350;	ypos_2 = 850;}
						else if(value == 8) 	{xpos_2 = 250;	ypos_2 = 850;}
						else if(value == 9) 	{xpos_2 = 150;	ypos_2 = 850;}
						else if(value == 10) 	{xpos_2 = 050;	ypos_2 = 850;}
						else if(value == 11) 	{xpos_2 = 050;	ypos_2 = 750;}
						else if(value == 12) 	{xpos_2 = 050;	ypos_2 = 650;}
						
						player2.setLocation(xpos_2, ypos_2);					
					}
					
					else if(xpos_2 == 850 && ypos_2 == 750) {
						if	   (value == 2) 	{xpos_2 = 750;	ypos_2 = 850;}
						else if(value == 3) 	{xpos_2 = 650;	ypos_2 = 850;}
						else if(value == 4) 	{xpos_2 = 550;	ypos_2 = 850;}
						else if(value == 5) 	{xpos_2 = 450;	ypos_2 = 850;}
						else if(value == 6) 	{xpos_2 = 350;	ypos_2 = 850;}
						else if(value == 7) 	{xpos_2 = 250;	ypos_2 = 850;}
						else if(value == 8) 	{xpos_2 = 150;	ypos_2 = 850;}
						else if(value == 9) 	{xpos_2 = 050;	ypos_2 = 850;}
						else if(value == 10) 	{xpos_2 = 050;	ypos_2 = 750;}
						else if(value == 11) 	{xpos_2 = 050;	ypos_2 = 650;}
						else if(value == 12) 	{xpos_2 = 050;	ypos_2 = 550;}
						
						player2.setLocation(xpos_2, ypos_2);					
					}
					
					else if(xpos_2 == 850 && ypos_2 == 850) {
						if	   (value == 2) 	{xpos_2 = 650;	ypos_2 = 850;}
						else if(value == 3) 	{xpos_2 = 550;	ypos_2 = 850;}
						else if(value == 4) 	{xpos_2 = 450;	ypos_2 = 850;}
						else if(value == 5) 	{xpos_2 = 350;	ypos_2 = 850;}
						else if(value == 6) 	{xpos_2 = 250;	ypos_2 = 850;}
						else if(value == 7) 	{xpos_2 = 150;	ypos_2 = 850;}
						else if(value == 8) 	{xpos_2 = 050;	ypos_2 = 850;}
						else if(value == 9) 	{xpos_2 = 050;	ypos_2 = 750;}
						else if(value == 10) 	{xpos_2 = 050;	ypos_2 = 650;}
						else if(value == 11) 	{xpos_2 = 050;	ypos_2 = 550;}
						else if(value == 12) 	{xpos_2 = 050;	ypos_2 = 450;}
						
						player2.setLocation(xpos_2, ypos_2);					
					}
					
					else if(xpos_2 == 750 && ypos_2 == 850) {
						if	   (value == 2) 	{xpos_2 = 550;	ypos_2 = 850;}
						else if(value == 3) 	{xpos_2 = 450;	ypos_2 = 850;}
						else if(value == 4) 	{xpos_2 = 350;	ypos_2 = 850;}
						else if(value == 5) 	{xpos_2 = 250;	ypos_2 = 850;}
						else if(value == 6) 	{xpos_2 = 150;	ypos_2 = 850;}
						else if(value == 7) 	{xpos_2 = 050;	ypos_2 = 850;}
						else if(value == 8) 	{xpos_2 = 050;	ypos_2 = 750;}
						else if(value == 9) 	{xpos_2 = 050;	ypos_2 = 650;}
						else if(value == 10) 	{xpos_2 = 050;	ypos_2 = 550;}
						else if(value == 11) 	{xpos_2 = 050;	ypos_2 = 450;}
						else if(value == 12) 	{xpos_2 = 050;	ypos_2 = 350;}
						
						player2.setLocation(xpos_2, ypos_2);					
					}
					
					else if(xpos_2 == 650 && ypos_2 == 850) {
						if	   (value == 2) 	{xpos_2 = 450;	ypos_2 = 850;}
						else if(value == 3) 	{xpos_2 = 350;	ypos_2 = 850;}
						else if(value == 4) 	{xpos_2 = 250;	ypos_2 = 850;}
						else if(value == 5) 	{xpos_2 = 150;	ypos_2 = 850;}
						else if(value == 6) 	{xpos_2 = 050;	ypos_2 = 850;}
						else if(value == 7) 	{xpos_2 = 050;	ypos_2 = 750;}
						else if(value == 8) 	{xpos_2 = 050;	ypos_2 = 650;}
						else if(value == 9) 	{xpos_2 = 050;	ypos_2 = 550;}
						else if(value == 10) 	{xpos_2 = 050;	ypos_2 = 450;}
						else if(value == 11) 	{xpos_2 = 050;	ypos_2 = 350;}
						else if(value == 12) 	{xpos_2 = 050;	ypos_2 = 250;}
						
						player2.setLocation(xpos_2, ypos_2);					
					}
					
					else if(xpos_2 == 550 && ypos_2 == 850) {
						if	   (value == 2) 	{xpos_2 = 350;	ypos_2 = 850;}
						else if(value == 3) 	{xpos_2 = 250;	ypos_2 = 850;}
						else if(value == 4) 	{xpos_2 = 150;	ypos_2 = 850;}
						else if(value == 5) 	{xpos_2 = 050;	ypos_2 = 850;}
						else if(value == 6) 	{xpos_2 = 050;	ypos_2 = 750;}
						else if(value == 7) 	{xpos_2 = 050;	ypos_2 = 650;}
						else if(value == 8) 	{xpos_2 = 050;	ypos_2 = 550;}
						else if(value == 9) 	{xpos_2 = 050;	ypos_2 = 450;}
						else if(value == 10) 	{xpos_2 = 050;	ypos_2 = 350;}
						else if(value == 11) 	{xpos_2 = 050;	ypos_2 = 250;}
						else if(value == 12) 	{xpos_2 = 050;	ypos_2 = 150;}
						
						player2.setLocation(xpos_2, ypos_2);					
					}
					
					else if(xpos_2 == 450 && ypos_2 == 850) {
						if	   (value == 2) 	{xpos_2 = 250;	ypos_2 = 850;}
						else if(value == 3) 	{xpos_2 = 150;	ypos_2 = 850;}
						else if(value == 4) 	{xpos_2 = 050;	ypos_2 = 850;}
						else if(value == 5) 	{xpos_2 = 050;	ypos_2 = 750;}
						else if(value == 6) 	{xpos_2 = 050;	ypos_2 = 650;}
						else if(value == 7) 	{xpos_2 = 050;	ypos_2 = 550;}
						else if(value == 8) 	{xpos_2 = 050;	ypos_2 = 450;}
						else if(value == 9) 	{xpos_2 = 050;	ypos_2 = 350;}
						else if(value == 10) 	{xpos_2 = 050;	ypos_2 = 250;}
						else if(value == 11) 	{xpos_2 = 050;	ypos_2 = 150;}
						else if(value == 12) 	{xpos_2 = 050;	ypos_2 = 050;		around_2++;}
						
						player2.setLocation(xpos_2, ypos_2);					
					}
					
					
					else if(xpos_2 == 350 && ypos_2 == 850) {
						if	   (value == 2) 	{xpos_2 = 150;	ypos_2 = 850;}
						else if(value == 3) 	{xpos_2 = 050;	ypos_2 = 850;}
						else if(value == 4) 	{xpos_2 = 050;	ypos_2 = 750;}
						else if(value == 5) 	{xpos_2 = 050;	ypos_2 = 650;}
						else if(value == 6) 	{xpos_2 = 050;	ypos_2 = 550;}
						else if(value == 7) 	{xpos_2 = 050;	ypos_2 = 450;}
						else if(value == 8) 	{xpos_2 = 050;	ypos_2 = 350;}
						else if(value == 9) 	{xpos_2 = 050;	ypos_2 = 250;}
						else if(value == 10) 	{xpos_2 = 050;	ypos_2 = 150;}
						else if(value == 11) 	{xpos_2 = 050;	ypos_2 = 050;		around++;}
						else if(value == 12) 	{xpos_2 = 150;	ypos_2 = 050;		around++;}
						
						player2.setLocation(xpos_2, ypos_2);				
					}
					
					else if(xpos_2 == 250 && ypos_2 == 850) {
						if	   (value == 2) 	{xpos_2 = 050;	ypos_2 = 850;}
						else if(value == 3) 	{xpos_2 = 050;	ypos_2 = 750;}
						else if(value == 4) 	{xpos_2 = 050;	ypos_2 = 650;}
						else if(value == 5) 	{xpos_2 = 050;	ypos_2 = 550;}
						else if(value == 6) 	{xpos_2 = 050;	ypos_2 = 450;}
						else if(value == 7) 	{xpos_2 = 050;	ypos_2 = 350;}
						else if(value == 8) 	{xpos_2 = 050;	ypos_2 = 250;}
						else if(value == 9) 	{xpos_2 = 050;	ypos_2 = 150;}
						else if(value == 10) 	{xpos_2 = 050;	ypos_2 = 050;		around_2++;}
						else if(value == 11) 	{xpos_2 = 150;	ypos_2 = 050;		around_2++;}
						else if(value == 12) 	{xpos_2 = 250;	ypos_2 = 050;		around_2++;}
						
						player2.setLocation(xpos_2, ypos_2);					
					}
					
					else if(xpos_2 == 150 && ypos_2 == 850) {
						if	   (value == 2) 	{xpos_2 = 050;	ypos_2 = 750;}
						else if(value == 3) 	{xpos_2 = 050;	ypos_2 = 650;}
						else if(value == 4) 	{xpos_2 = 050;	ypos_2 = 550;}
						else if(value == 5) 	{xpos_2 = 050;	ypos_2 = 450;}
						else if(value == 6) 	{xpos_2 = 050;	ypos_2 = 350;}
						else if(value == 7) 	{xpos_2 = 050;	ypos_2 = 250;}
						else if(value == 8) 	{xpos_2 = 050;	ypos_2 = 150;}
						else if(value == 9) 	{xpos_2 = 050;	ypos_2 = 050;		around_2++;}
						else if(value == 10) 	{xpos_2 = 150;	ypos_2 = 050;		around_2++;}
						else if(value == 11) 	{xpos_2 = 250;	ypos_2 = 050;		around_2++;}
						else if(value == 12) 	{xpos_2 = 350;	ypos_2 = 050;		around_2++;}
						
						player2.setLocation(xpos_2, ypos_2);					
					}
					
					else if(xpos_2 == 050 && ypos_2 == 850) {
						if	   (value == 2) 	{xpos_2 = 050;	ypos_2 = 650;}
						else if(value == 3) 	{xpos_2 = 050;	ypos_2 = 550;}
						else if(value == 4) 	{xpos_2 = 050;	ypos_2 = 450;}
						else if(value == 5) 	{xpos_2 = 050;	ypos_2 = 350;}
						else if(value == 6) 	{xpos_2 = 050;	ypos_2 = 250;}
						else if(value == 7) 	{xpos_2 = 050;	ypos_2 = 150;}
						else if(value == 8) 	{xpos_2 = 050;	ypos_2 = 050;		around_2++;}
						else if(value == 9) 	{xpos_2 = 150;	ypos_2 = 050;		around_2++;}
						else if(value == 10) 	{xpos_2 = 250;	ypos_2 = 050;		around_2++;}
						else if(value == 11) 	{xpos_2 = 350;	ypos_2 = 050;		around_2++;}
						else if(value == 12) 	{xpos_2 = 450;	ypos_2 = 050;		around_2++;}
						
						player2.setLocation(xpos_2, ypos_2);					
					}
					
					else if(xpos_2 == 050 && ypos_2 == 750) {
						if	   (value == 2) 	{xpos_2 = 050;	ypos_2 = 550;}
						else if(value == 3) 	{xpos_2 = 050;	ypos_2 = 450;}
						else if(value == 4) 	{xpos_2 = 050;	ypos_2 = 350;}
						else if(value == 5) 	{xpos_2 = 050;	ypos_2 = 250;}
						else if(value == 6) 	{xpos_2 = 050;	ypos_2 = 150;}
						else if(value == 7) 	{xpos_2 = 050;	ypos_2 = 050;		around_2++;}
						else if(value == 8) 	{xpos_2 = 150;	ypos_2 = 050;		around_2++;}
						else if(value == 9) 	{xpos_2 = 250;	ypos_2 = 050;		around_2++;}
						else if(value == 10) 	{xpos_2 = 350;	ypos_2 = 050;		around_2++;}
						else if(value == 11) 	{xpos_2 = 450;	ypos_2 = 050;		around_2++;}
						else if(value == 12) 	{xpos_2 = 550;	ypos_2 = 050;		around_2++;}
						
						player2.setLocation(xpos_2, ypos_2);					
					}
					
					else if(xpos_2 == 050 && ypos_2 == 650) {
						if	   (value == 2) 	{xpos_2 = 050;	ypos_2 = 450;}
						else if(value == 3) 	{xpos_2 = 050;	ypos_2 = 350;}
						else if(value == 4) 	{xpos_2 = 050;	ypos_2 = 250;}
						else if(value == 5) 	{xpos_2 = 050;	ypos_2 = 150;}
						else if(value == 6) 	{xpos_2 = 050;	ypos_2 = 050;		around_2++;}
						else if(value == 7) 	{xpos_2 = 150;	ypos_2 = 050;		around_2++;}
						else if(value == 8) 	{xpos_2 = 250;	ypos_2 = 050;		around_2++;}
						else if(value == 9) 	{xpos_2 = 350;	ypos_2 = 050;		around_2++;}
						else if(value == 10) 	{xpos_2 = 450;	ypos_2 = 050;		around_2++;}
						else if(value == 11) 	{xpos_2 = 550;	ypos_2 = 050;		around_2++;}
						else if(value == 12) 	{xpos_2 = 650;	ypos_2 = 050;		around_2++;}
						
						player2.setLocation(xpos_2, ypos_2);					
					}
					
					else if(xpos_2 == 050 && ypos_2 == 550) {
						if	   (value == 2) 	{xpos_2 = 050;	ypos_2 = 350;}
						else if(value == 3) 	{xpos_2 = 050;	ypos_2 = 250;}
						else if(value == 4) 	{xpos_2 = 050;	ypos_2 = 150;}
						else if(value == 5) 	{xpos_2 = 050;	ypos_2 = 050;		around_2++;}
						else if(value == 6) 	{xpos_2 = 150;	ypos_2 = 050;		around_2++;}
						else if(value == 7) 	{xpos_2 = 250;	ypos_2 = 050;		around_2++;}
						else if(value == 8) 	{xpos_2 = 350;	ypos_2 = 050;		around_2++;}
						else if(value == 9) 	{xpos_2 = 450;	ypos_2 = 050;		around_2++;}
						else if(value == 10) 	{xpos_2 = 550;	ypos_2 = 050;		around_2++;}
						else if(value == 11) 	{xpos_2 = 650;	ypos_2 = 050;		around_2++;}
						else if(value == 12) 	{xpos_2 = 750;	ypos_2 = 050;		around_2++;}
						
						player2.setLocation(xpos_2, ypos_2);	
					}
					
					else if(xpos_2 == 050 && ypos_2 == 450) {
						if	   (value == 2) 	{xpos_2 = 050;	ypos_2 = 250;}
						else if(value == 3) 	{xpos_2 = 050;	ypos_2 = 150;}
						else if(value == 4) 	{xpos_2 = 050;	ypos_2 = 050;		around_2++;}
						else if(value == 5) 	{xpos_2 = 150;	ypos_2 = 050;		around_2++;}
						else if(value == 6) 	{xpos_2 = 250;	ypos_2 = 050;		around_2++;}
						else if(value == 7) 	{xpos_2 = 350;	ypos_2 = 050;		around_2++;}
						else if(value == 8) 	{xpos_2 = 450;	ypos_2 = 050;		around_2++;}
						else if(value == 9) 	{xpos_2 = 550;	ypos_2 = 050;		around_2++;}
						else if(value == 10) 	{xpos_2 = 650;	ypos_2 = 050;		around_2++;}
						else if(value == 11) 	{xpos_2 = 750;	ypos_2 = 050;		around_2++;}
						else if(value == 12) 	{xpos_2 = 850;	ypos_2 = 050;		around_2++;}
						
						player2.setLocation(xpos_2, ypos_2);					
					}
					
					else if(xpos_2 == 050 && ypos_2 == 350) {
						if	   (value == 2) 	{xpos_2 = 050;	ypos_2 = 150;}
						else if(value == 3) 	{xpos_2 = 050;	ypos_2 = 050;		around_2++;}
						else if(value == 4) 	{xpos_2 = 150;	ypos_2 = 050;		around_2++;}
						else if(value == 5) 	{xpos_2 = 250;	ypos_2 = 050;		around_2++;}
						else if(value == 6) 	{xpos_2 = 350;	ypos_2 = 050;		around_2++;}
						else if(value == 7) 	{xpos_2 = 450;	ypos_2 = 050;		around_2++;}
						else if(value == 8) 	{xpos_2 = 550;	ypos_2 = 050;		around_2++;}
						else if(value == 9) 	{xpos_2 = 650;	ypos_2 = 050;		around_2++;}
						else if(value == 10) 	{xpos_2 = 750;	ypos_2 = 050;		around_2++;}
						else if(value == 11) 	{xpos_2 = 850;	ypos_2 = 050;		around_2++;}
						else if(value == 12) 	{xpos_2 = 850;	ypos_2 = 050;		around_2++;}
						
						player2.setLocation(xpos_2, ypos_2);	
					}
					
					else if(xpos_2 == 050 && ypos_2 == 250) {
						if	   (value == 2) 	{xpos = 050;	ypos_2 = 050;		around_2++;}
						else if(value == 3) 	{xpos = 150;	ypos_2 = 050;		around_2++;}
						else if(value == 4) 	{xpos = 250;	ypos_2 = 050;		around_2++;}
						else if(value == 5) 	{xpos = 350;	ypos_2 = 050;		around_2++;}
						else if(value == 6) 	{xpos = 450;	ypos_2 = 050;		around_2++;}
						else if(value == 7) 	{xpos = 550;	ypos_2 = 050;		around_2++;}
						else if(value == 8) 	{xpos = 650;	ypos_2 = 050;		around_2++;}
						else if(value == 9) 	{xpos = 750;	ypos_2 = 050;		around_2++;}
						else if(value == 10) 	{xpos = 850;	ypos_2 = 050;		around_2++;}
						else if(value == 11) 	{xpos = 850;	ypos_2 = 150;		around_2++;}
						else if(value == 12) 	{xpos = 850;	ypos_2 = 250;		around_2++;}
						
						player2.setLocation(xpos_2, ypos_2);	
					}
					
					else if(xpos_2 == 050 && ypos_2 == 150) {
						if	   (value == 2) 	{xpos_2 = 150;	ypos_2 = 050;		around_2++;}
						else if(value == 3) 	{xpos_2 = 250;	ypos_2 = 050;		around_2++;}
						else if(value == 4) 	{xpos_2 = 350;	ypos_2 = 050;		around_2++;}
						else if(value == 5) 	{xpos_2 = 450;	ypos_2 = 050;		around_2++;}
						else if(value == 6) 	{xpos_2 = 550;	ypos_2 = 050;		around_2++;}
						else if(value == 7) 	{xpos_2 = 650;	ypos_2 = 050;		around_2++;}
						else if(value == 8) 	{xpos_2 = 750;	ypos_2 = 050;		around_2++;}
						else if(value == 9) 	{xpos_2 = 850;	ypos_2 = 050;		around_2++;}
						else if(value == 10) 	{xpos_2 = 850;	ypos_2 = 150;		around_2++;}
						else if(value == 11) 	{xpos_2 = 850;	ypos_2 = 250;		around_2++;}
						else if(value == 12) 	{xpos_2 = 850;	ypos_2 = 350;		around_2++;}
						
						player2.setLocation(xpos_2, ypos_2);					
					}
					
						turn = 1;
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



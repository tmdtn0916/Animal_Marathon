package game;

import static game.DiceImage.image1;
import static game.DiceImage.image2;
import static game.DiceImage.image3;
import static game.DiceImage.image4;
import static game.DiceImage.image5;
import static game.DiceImage.image6;

import java.util.Random;

import javax.swing.ImageIcon;

import game.Frame;

public class Dice {
		
		private Frame frame = null;
		private int dice1 = 0;
		private int dice2 = 0;
		private Thread thread;
		public Dice(Frame frame)
		{
			this.frame = frame;
			initDice();
			initDice_2();
			
		}
			
		public int Roll() {
			
			
			Random random = new Random();
			dice1 = random.nextInt(6) + 1;
			dice2 = random.nextInt(6) + 1;
			
			int sum = (int)(dice1 + dice2);
			
			drawDice();
			return sum;
			
		}
		
		private ImageIcon[] diceObject = new ImageIcon[6];
		private ImageIcon[] diceObject_2 = new ImageIcon[6];
		private void initDice()
		{
			diceObject[0] = new ImageIcon(Frame.class.getResource(image1));
			diceObject[1] = new ImageIcon(Frame.class.getResource(image2));
			diceObject[2] = new ImageIcon(Frame.class.getResource(image3));
			diceObject[3] = new ImageIcon(Frame.class.getResource(image4));
			diceObject[4] = new ImageIcon(Frame.class.getResource(image5));
			diceObject[5] = new ImageIcon(Frame.class.getResource(image6));
		}
		
		
		private void initDice_2()
		{
			diceObject_2[0] = new ImageIcon(Frame.class.getResource(image6));
			diceObject_2[1] = new ImageIcon(Frame.class.getResource(image5));
			diceObject_2[2] = new ImageIcon(Frame.class.getResource(image4));
			diceObject_2[3] = new ImageIcon(Frame.class.getResource(image3));
			diceObject_2[4] = new ImageIcon(Frame.class.getResource(image2));
			diceObject_2[5] = new ImageIcon(Frame.class.getResource(image1));
		}
		
		private void drawDice()
		{
			thread = new Thread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					for(int i=0; i < 12; i++)
					{
						
						frame.getLblNewLabel().setIcon(diceObject[i % 6]);
						frame.getLblNewLabel_1().setIcon(diceObject_2[i % 6]);
						
						try {
							Thread.sleep(60);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					}
				
	
					
				//// DICE
					if(dice1 == 1) {
						frame.getLblNewLabel().setIcon(new ImageIcon(Frame.class.getResource(image1)));
					}
					
					else if(dice1 == 2) {
						frame.getLblNewLabel().setIcon(new ImageIcon(Frame.class.getResource(image2)));
					}
					
					
					else if(dice1 == 3) {
						frame.getLblNewLabel().setIcon(new ImageIcon(Frame.class.getResource(image3)));
					}
					
					else if(dice1 == 4) {
						frame.getLblNewLabel().setIcon(new ImageIcon(Frame.class.getResource(image4)));
					}
					
					
					else if(dice1 == 5) {
						frame.getLblNewLabel().setIcon(new ImageIcon(Frame.class.getResource(image5)));
					}
					
					
					else if(dice1 == 6) {
						frame.getLblNewLabel().setIcon(new ImageIcon(Frame.class.getResource(image6)));
					}
					
					
					if(dice2 == 1) {
						frame.getLblNewLabel_1().setIcon(new ImageIcon(Frame.class.getResource(image1)));
					}
					
					else if(dice2 == 2) {
						frame.getLblNewLabel_1().setIcon(new ImageIcon(Frame.class.getResource(image2)));
					}
					
					else if(dice2 == 3) {
						frame.getLblNewLabel_1().setIcon(new ImageIcon(Frame.class.getResource(image3)));
					}
					
					else if(dice2 == 4) {
						frame.getLblNewLabel_1().setIcon(new ImageIcon(Frame.class.getResource(image4)));
					}
					
					else if(dice2 == 5) {
						frame.getLblNewLabel_1().setIcon(new ImageIcon(Frame.class.getResource(image5)));
					}
					
					else if(dice2 == 6) {
						frame.getLblNewLabel_1().setIcon(new ImageIcon(Frame.class.getResource(image6)));
					}
				}
			});
			
			thread.start();
			
		}
		
}

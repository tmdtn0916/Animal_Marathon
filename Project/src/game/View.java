package game;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;


public class View extends JPanel {
	
	 
   final int WIDTH_COUNT;
   final int HEIGHT_COUNT;
   
   int[] road = new int[32];
   
   
   
   
   public View() {
	   WIDTH_COUNT = 9;
	   HEIGHT_COUNT = 9;
   }
   
   public void paint(Graphics g) {
	   super.paint(g);
	   drawMap(g);
   }
   
   public void drawMap(Graphics g) {
	   int xpos, ypos;
	   
	   for(int y = 0; y<HEIGHT_COUNT; y++) {
		   for(int x= 0; x< WIDTH_COUNT; x++) {
			   
			   xpos = x*100;
			   ypos = y*100;
			   
			   
			   g.setColor(Color.red);
			   g.drawRect(xpos, ypos, 100, 100);
			   
			   
			   
		   }
	   } 
	   
	    
	   
	   for(int y = 1; y<HEIGHT_COUNT - 1; y++) {
		   for(int x= 1; x< WIDTH_COUNT - 1; x++) {
			   
			   xpos = x*100;
			   ypos = y*100;
			   
			   
			   g.setColor(Color.gray);
			   g.fillRect(xpos, ypos, 100, 100);
			   
			   
			   
		   }
	   }   
   }
   
   
   
   
   
   
   
    
}
package game;

import java.awt.*;
import java.lang.reflect.InvocationTargetException;

import javax.swing.SwingUtilities;

import game.Board;
import game.Frame;

public class app implements Runnable {
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		initialize(); 
		
	}
	
	public static final String APP_NAME = "CE Board Game";
	
	private Frame Frame;
	private Board checkerBoard;
	
	private player icon;
	
	protected void initialize() {
	    Frame = new Frame(APP_NAME);
	    
	    icon = new player(0, 0);


	    checkerBoard = new Board(10, 10);

	    checkerBoard.setPreferredSize(new Dimension(1200, 850));
	    Frame.setContentPane(checkerBoard);
	     
	    // JLable 어떻게 추가?
	    // ????
	    Frame.add(icon);
	    
	
	    
	    Frame.pack();
	    Frame.setVisible(true);
	    Frame.setLocation(450, 50); //
	    

	 
	}
	
	public app() {
		initialize();
	}
	
}


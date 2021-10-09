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
	
	
	protected void initialize() {
	    Frame = new Frame(APP_NAME);


	    checkerBoard = new Board(10, 10);

	    checkerBoard.setPreferredSize(new Dimension(1200, 850));
	    Frame.setContentPane(checkerBoard);

	    Frame.pack();
	    Frame.setVisible(true);
	 
	}
	
	public app() {
		initialize();
	}
	
}


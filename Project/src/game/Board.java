package game;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import game.BoardZone;

public class Board extends JPanel{
	private static final Color[] DEFAULT_TILE_COLORS = new Color[] { Color.LIGHT_GRAY, Color.WHITE };
	
	private BoardZone[][] zones;
	  private Color[] tileColors;
	  private int rows;
	  private int cols;
	  
	  public int getRows() {
		    return rows;
		  }

	  public void setRows(int rows) {
		    this.rows = rows;
		  }

	  public int getCols() {
		    return cols;
		  }

	  public void setCols(int cols) {
		    this.cols = cols;
		  }

	  public Board(int rows, int cols, Color[] tileColors) {
		    super();

		    this.rows = rows;
		    
		    this.cols = cols;
		    this.tileColors = tileColors;

		    initialize();
		  }

	  public Board(int rows, int cols) {
		    this(rows, cols, DEFAULT_TILE_COLORS);
		  }

	  protected void initialize() {
		    this.setLayout(new GridLayout(rows, cols, 0, 0));

		    generateZones();
		  }
		  
	  private void generateZones() {
			    this.setLayout(new GridLayout(rows, cols, 0, 0));

			    this.zones = new BoardZone[rows][cols];
			    for (int row = 0; row < rows; row++) {
			      for (int col = 0; col < cols; col++) {
			        this.add(zones[row][col] = new BoardZone());
			      }
			    }
			  }
		  
	  public void paintComponent(Graphics g) {		// 판 배열
		    super.paintComponent(g);

		    int tileWidth = this.getWidth() / cols;
		    int tileHeight = this.getHeight() / rows;

		    for (int row = 0; row < rows; row++) {
		      for (int col = 0; col < cols; col++) {
		        int x = col * tileWidth;
		        int y = row * tileHeight;
		        
		        
		        g.setColor(tileColors[(row + col) % 2]);
		        
		        g.fillRect(x, y, tileWidth, tileHeight);
		      }
		    }
		    
		    for( int row = 1; row < 9; row++) {			// 중간 화면 가리기
		    	for (int col = 1; col < 9; col++) {
		    		int x = col * tileWidth;
		    		int y = row * tileHeight;
		    		
		    		
		    		g.setColor(Color.gray);
				    g.fillRect(x,y, tileWidth, tileHeight);
		    	}
		    }
		   
		    
	  }
	  
	  
	  
}


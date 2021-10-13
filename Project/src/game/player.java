package game;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class player extends JLabel{
	
	private ImageIcon imgicon;
	private int playX;
	private int playY;

	
	public player(int x, int y) {
		this.playX = x;
		this.playY = y;
		
	
	
		
		imgicon = new ImageIcon("src/game/image/among.gif");
		
		setIcon(imgicon);

//		setSize(10,10); //크기 설정 // 해도 왜 안먹지?
		setLocation(playX, playY); // 시작 좌표 설
	}
	
}

package game;

public class ElephantPlayer extends Player {
	private Thread thread;
	public ElephantPlayer(Frame frame) {
		super(frame);
		// TODO Auto-generated constructor stub
	}

	private int xpos, ypos;
	
	public void setLocation(int x, int y)
	{	
		this.xpos = x;
		this.ypos = y;
		thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					Thread.sleep(720);
					getFrame().getPlayer1().setLocation(xpos, ypos);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
		});
		thread.start();

	}

	public void checkPos(int value)
	{	
		
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
			setLocation(xpos, ypos);
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
			setLocation(xpos, ypos);
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
			setLocation(xpos, ypos);
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
			setLocation(xpos, ypos);
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
			setLocation(xpos, ypos);
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
			setLocation(xpos, ypos);
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
			setLocation(xpos, ypos);
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
			setLocation(xpos, ypos);
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
			setLocation(xpos, ypos);
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
			setLocation(xpos, ypos);
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
			setLocation(xpos, ypos);
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
			setLocation(xpos, ypos);
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
			setLocation(xpos, ypos);
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
			setLocation(xpos, ypos);
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
			setLocation(xpos, ypos);
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
			setLocation(xpos, ypos);
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
			setLocation(xpos, ypos);
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
			setLocation(xpos, ypos);
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
			setLocation(xpos, ypos);
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
			setLocation(xpos, ypos);
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
			setLocation(xpos, ypos);
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
			setLocation(xpos, ypos);
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
			setLocation(xpos, ypos);
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
			setLocation(xpos, ypos);
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
			setLocation(xpos, ypos);
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
			setLocation(xpos, ypos);
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
			setLocation(xpos, ypos);
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
			setLocation(xpos, ypos);
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
			setLocation(xpos, ypos);
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
			setLocation(xpos, ypos);
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
			setLocation(xpos, ypos);
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
			setLocation(xpos, ypos);
		}
	}
	
	
	
}

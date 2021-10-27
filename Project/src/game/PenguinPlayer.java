package game;

public class PenguinPlayer extends Player {
	private Thread thread;
	public PenguinPlayer(Frame frame) {
		super(frame);
		// TODO Auto-generated constructor stub
	}

	private int xpos, ypos;
	private int round = 0;
	

	public void setLocation(int x, int y)
	{
		this.xpos = x;
		this.ypos = y;
		thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					thread.sleep(720);
					getFrame().getPlayer2().setLocation(xpos, ypos);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				// TODO Auto-generated method stub
				
			}
		});
		thread.start();		
	}
	
	public void checkPos(int value)
	{
		if(xpos == 000 && ypos == 000)
			{xpos = 050; ypos = 050;}
		
		if(xpos == 050 && ypos == 050) {
			if	   (value == 2) 	 xpos = 250;
			else if(value == 3) 	 xpos = 350;
			else if(value == 4) 	 xpos = 450;
			else if(value == 5) 	 xpos = 550;
			else if(value == 6) 	 xpos = 650;
			else if(value == 7) 	 xpos = 750;
			else if(value == 8) 	 xpos = 850;
			else if(value == 9) 	{xpos = 850;	ypos = 150;}
			else if(value == 10) 	{xpos = 850;	ypos = 250;}
			else if(value == 11) 	{xpos = 850;	ypos = 350;}
			else if(value == 12) 	{xpos = 850;	ypos = 450;}
			setLocation(xpos, ypos);
		}
		
		
		else if(xpos == 150 && ypos == 050) {
			if	   (value == 2) 	 xpos = 350;
			else if(value == 3) 	 xpos = 450;
			else if(value == 4)		 xpos = 550;
			else if(value == 5) 	 xpos = 650;
			else if(value == 6) 	 xpos = 750;
			else if(value == 7) 	 xpos = 850;
			else if(value == 8)     {xpos = 850;	ypos = 150;}
			else if(value == 9)     {xpos = 850;	ypos = 250;}
			else if(value == 10)    {xpos = 850;	ypos = 350;}
			else if(value == 11)    {xpos = 850;	ypos = 450;}
			else if(value == 12)	{xpos = 850;	ypos = 550;}
			setLocation(xpos, ypos);
		}
		
		
		else if(xpos == 250 && ypos == 050) {
			if	   (value == 2) 	 xpos = 450;
			else if(value == 3) 	 xpos = 550;
			else if(value == 4) 	 xpos = 650;
			else if(value == 5) 	 xpos = 750;
			else if(value == 6) 	 xpos = 850;
			else if(value == 7)     {xpos = 850;	ypos = 150;}
			else if(value == 8)     {xpos = 850;	ypos = 250;}
			else if(value == 9)     {xpos = 850;	ypos = 350;}
			else if(value == 10)    {xpos = 850;	ypos = 450;}
			else if(value == 11)    {xpos = 850;	ypos = 550;}
			else if(value == 12)	{xpos = 850;	ypos = 650;}
			setLocation(xpos, ypos);
		}
		
		
		else if(xpos == 350 && ypos == 050) {
			if	   (value == 2) 	 xpos = 550;
			else if(value == 3) 	 xpos = 650;
			else if(value == 4) 	 xpos = 750;
			else if(value == 5)		 xpos = 850;
			else if(value == 6) 	{xpos = 850;	ypos = 150;}
			else if(value == 7) 	{xpos = 850;	ypos = 250;}
			else if(value == 8) 	{xpos = 850;	ypos = 350;}
			else if(value == 9) 	{xpos = 850;	ypos = 450;}
			else if(value == 10) 	{xpos = 850;	ypos = 550;}
			else if(value == 11) 	{xpos = 850;	ypos = 650;}
			else if(value == 12) 	{xpos = 850;	ypos = 750;}
			setLocation(xpos, ypos);
		}
		
		
		else if(xpos == 450 && ypos == 050) {
			if	   (value == 2) 	 xpos = 650;
			else if(value == 3) 	 xpos = 750;
			else if(value == 4) 	 xpos = 850;
			else if(value == 5) 	{xpos = 850;	ypos = 150;}
			else if(value == 6) 	{xpos = 850;	ypos = 250;}
			else if(value == 7) 	{xpos = 850;	ypos = 350;}
			else if(value == 8) 	{xpos = 850;	ypos = 450;}
			else if(value == 9) 	{xpos = 850;	ypos = 550;}
			else if(value == 10) 	{xpos = 850;	ypos = 650;}
			else if(value == 11) 	{xpos = 850;	ypos = 750;}
			else if(value == 12) 	{xpos = 850;	ypos = 850;}
			setLocation(xpos, ypos);					
		}
	
		else if(xpos == 550 && ypos == 050) {
			if	   (value == 2) 	 xpos = 750;
			else if(value == 3) 	 xpos = 850;
			else if(value == 4) 	{xpos = 850;	ypos = 150;}
			else if(value == 5) 	{xpos = 850;	ypos = 250;}
			else if(value == 6) 	{xpos = 850;	ypos = 350;}
			else if(value == 7) 	{xpos = 850;	ypos = 450;}
			else if(value == 8) 	{xpos = 850;	ypos = 550;}
			else if(value == 9) 	{xpos = 850;	ypos = 650;}
			else if(value == 10) 	{xpos = 850;	ypos = 750;}
			else if(value == 11) 	{xpos = 850;	ypos = 850;}
			else if(value == 12) 	{xpos = 750;	ypos = 850;}
			setLocation(xpos, ypos);					
		}
		
		else if(xpos == 650 && ypos == 050) {
			if	   (value == 2) 	 xpos = 850;
			else if(value == 3) 	{xpos = 850;	ypos = 150;}
			else if(value == 4) 	{xpos = 850;	ypos = 250;}
			else if(value == 5) 	{xpos = 850;	ypos = 350;}
			else if(value == 6) 	{xpos = 850;	ypos = 450;}
			else if(value == 7) 	{xpos = 850;	ypos = 550;}
			else if(value == 8) 	{xpos = 850;	ypos = 650;}
			else if(value == 9) 	{xpos = 850;	ypos = 750;}
			else if(value == 10) 	{xpos = 850;	ypos = 850;}
			else if(value == 11) 	{xpos = 750;	ypos = 850;}
			else if(value == 12) 	{xpos = 650;	ypos = 850;}
			setLocation(xpos, ypos);					
		}
		
		else if(xpos == 750 && ypos == 050) {
			if	   (value == 2) 	{xpos = 850;	ypos = 150;}
			else if(value == 3) 	{xpos = 850;	ypos = 250;}
			else if(value == 4) 	{xpos = 850;	ypos = 350;}
			else if(value == 5) 	{xpos = 850;	ypos = 450;}
			else if(value == 6) 	{xpos = 850;	ypos = 550;}
			else if(value == 7) 	{xpos = 850;	ypos = 650;}
			else if(value == 8) 	{xpos = 850;	ypos = 750;}
			else if(value == 9) 	{xpos = 850;	ypos = 850;}
			else if(value == 10) 	{xpos = 750;	ypos = 850;}
			else if(value == 11) 	{xpos = 650;	ypos = 850;}
			else if(value == 12) 	{xpos = 550;	ypos = 850;}
			setLocation(xpos, ypos);				
		}
		
		else if(xpos == 850 && ypos == 050) {
			if	   (value == 2) 	{xpos = 850;	ypos = 250;}
			else if(value == 3) 	{xpos = 850;	ypos = 350;}
			else if(value == 4) 	{xpos = 850;	ypos = 450;}
			else if(value == 5) 	{xpos = 850;	ypos = 550;}
			else if(value == 6) 	{xpos = 850;	ypos = 650;}
			else if(value == 7) 	{xpos = 850;	ypos = 750;}
			else if(value == 8) 	{xpos = 850;	ypos = 850;}
			else if(value == 9) 	{xpos = 750;	ypos = 850;}
			else if(value == 10) 	{xpos = 650;	ypos = 850;}
			else if(value == 11) 	{xpos = 550;	ypos = 850;}
			else if(value == 12) 	{xpos = 450;	ypos = 850;}
			setLocation(xpos, ypos);					
		}
		
		
		else if(xpos == 850 && ypos == 150) {
			if	   (value == 2) 	{xpos = 850;	ypos = 350;}
			else if(value == 3) 	{xpos = 850;	ypos = 450;}
			else if(value == 4) 	{xpos = 850;	ypos = 550;}
			else if(value == 5) 	{xpos = 850;	ypos = 650;}
			else if(value == 6) 	{xpos = 850;	ypos = 750;}
			else if(value == 7) 	{xpos = 850;	ypos = 850;}
			else if(value == 8) 	{xpos = 750;	ypos = 850;}
			else if(value == 9) 	{xpos = 650;	ypos = 850;}
			else if(value == 10) 	{xpos = 550;	ypos = 850;}
			else if(value == 11) 	{xpos = 450;	ypos = 850;}
			else if(value == 12) 	{xpos = 350;	ypos = 850;}
			setLocation(xpos, ypos);					
		}
		
		else if(xpos == 850 && ypos == 250) {
			if	   (value == 2) 	{xpos = 850;	ypos = 450;}
			else if(value == 3) 	{xpos = 850;	ypos = 550;}
			else if(value == 4) 	{xpos = 850;	ypos = 650;}
			else if(value == 5) 	{xpos = 850;	ypos = 750;}
			else if(value == 6) 	{xpos = 850;	ypos = 850;}
			else if(value == 7) 	{xpos = 750;	ypos = 850;}
			else if(value == 8) 	{xpos = 650;	ypos = 850;}
			else if(value == 9) 	{xpos = 550;	ypos = 850;}
			else if(value == 10) 	{xpos = 450;	ypos = 850;}
			else if(value == 11) 	{xpos = 350;	ypos = 850;}
			else if(value == 12) 	{xpos = 250;	ypos = 850;}
			setLocation(xpos, ypos);					
		}

		else if(xpos == 850 && ypos == 350) {
			if	   (value == 2) 	{xpos = 850;	ypos = 550;}
			else if(value == 3) 	{xpos = 850;	ypos = 650;}
			else if(value == 4) 	{xpos = 850;	ypos = 750;}
			else if(value == 5) 	{xpos = 850;	ypos = 850;}
			else if(value == 6) 	{xpos = 750;	ypos = 850;}
			else if(value == 7) 	{xpos = 650;	ypos = 850;}
			else if(value == 8) 	{xpos = 550;	ypos = 850;}
			else if(value == 9) 	{xpos = 450;	ypos = 850;}
			else if(value == 10) 	{xpos = 350;	ypos = 850;}
			else if(value == 11) 	{xpos = 250;	ypos = 850;}
			else if(value == 12) 	{xpos = 150;	ypos = 850;}
			setLocation(xpos, ypos);					
		}
		
		else if(xpos == 850 && ypos == 450) {
			if	   (value == 2) 	{xpos = 850;	ypos = 650;}
			else if(value == 3) 	{xpos = 850;	ypos = 750;}
			else if(value == 4) 	{xpos = 850;	ypos = 850;}
			else if(value == 5) 	{xpos = 750;	ypos = 850;}
			else if(value == 6) 	{xpos = 650;	ypos = 850;}
			else if(value == 7) 	{xpos = 550;	ypos = 850;}
			else if(value == 8) 	{xpos = 450;	ypos = 850;}
			else if(value == 9) 	{xpos = 350;	ypos = 850;}
			else if(value == 10) 	{xpos = 250;	ypos = 850;}
			else if(value == 11) 	{xpos = 150;	ypos = 850;}
			else if(value == 12) 	{xpos = 050;	ypos = 850;}
			
			setLocation(xpos, ypos);					
		}
		
		else if(xpos == 850 && ypos == 550) {
			if	   (value == 2) 	{xpos = 850;	ypos = 750;}
			else if(value == 3) 	{xpos = 850;	ypos = 850;}
			else if(value == 4) 	{xpos = 750;	ypos = 850;}
			else if(value == 5) 	{xpos = 650;	ypos = 850;}
			else if(value == 6) 	{xpos = 550;	ypos = 850;}
			else if(value == 7) 	{xpos = 450;	ypos = 850;}
			else if(value == 8) 	{xpos = 350;	ypos = 850;}
			else if(value == 9) 	{xpos = 250;	ypos = 850;}
			else if(value == 10) 	{xpos = 150;	ypos = 850;}
			else if(value == 11) 	{xpos = 050;	ypos = 850;}
			else if(value == 12) 	{xpos = 050;	ypos = 750;}
			
			setLocation(xpos, ypos);					
		}
		
		else if(xpos == 850 && ypos == 650) {
			if	   (value == 2) 	{xpos = 850;	ypos = 850;}
			else if(value == 3) 	{xpos = 750;	ypos = 850;}
			else if(value == 4) 	{xpos = 650;	ypos = 850;}
			else if(value == 5) 	{xpos = 550;	ypos = 850;}
			else if(value == 6) 	{xpos = 450;	ypos = 850;}
			else if(value == 7) 	{xpos = 350;	ypos = 850;}
			else if(value == 8) 	{xpos = 250;	ypos = 850;}
			else if(value == 9) 	{xpos = 150;	ypos = 850;}
			else if(value == 10) 	{xpos = 050;	ypos = 850;}
			else if(value == 11) 	{xpos = 050;	ypos = 750;}
			else if(value == 12) 	{xpos = 050;	ypos = 650;}
			
			setLocation(xpos, ypos);					
		}
		
		else if(xpos == 850 && ypos == 750) {
			if	   (value == 2) 	{xpos = 750;	ypos = 850;}
			else if(value == 3) 	{xpos = 650;	ypos = 850;}
			else if(value == 4) 	{xpos = 550;	ypos = 850;}
			else if(value == 5) 	{xpos = 450;	ypos = 850;}
			else if(value == 6) 	{xpos = 350;	ypos = 850;}
			else if(value == 7) 	{xpos = 250;	ypos = 850;}
			else if(value == 8) 	{xpos = 150;	ypos = 850;}
			else if(value == 9) 	{xpos = 050;	ypos = 850;}
			else if(value == 10) 	{xpos = 050;	ypos = 750;}
			else if(value == 11) 	{xpos = 050;	ypos = 650;}
			else if(value == 12) 	{xpos = 050;	ypos = 550;}
			
			setLocation(xpos, ypos);					
		}
		
		else if(xpos == 850 && ypos == 850) {
			if	   (value == 2) 	{xpos = 650;	ypos = 850;}
			else if(value == 3) 	{xpos = 550;	ypos = 850;}
			else if(value == 4) 	{xpos = 450;	ypos = 850;}
			else if(value == 5) 	{xpos = 350;	ypos = 850;}
			else if(value == 6) 	{xpos = 250;	ypos = 850;}
			else if(value == 7) 	{xpos = 150;	ypos = 850;}
			else if(value == 8) 	{xpos = 050;	ypos = 850;}
			else if(value == 9) 	{xpos = 050;	ypos = 750;}
			else if(value == 10) 	{xpos = 050;	ypos = 650;}
			else if(value == 11) 	{xpos = 050;	ypos = 550;}
			else if(value == 12) 	{xpos = 050;	ypos = 450;}
			
			setLocation(xpos, ypos);					
		}
		
		else if(xpos == 750 && ypos == 850) {
			if	   (value == 2) 	{xpos = 550;	ypos = 850;}
			else if(value == 3) 	{xpos = 450;	ypos = 850;}
			else if(value == 4) 	{xpos = 350;	ypos = 850;}
			else if(value == 5) 	{xpos = 250;	ypos = 850;}
			else if(value == 6) 	{xpos = 150;	ypos = 850;}
			else if(value == 7) 	{xpos = 050;	ypos = 850;}
			else if(value == 8) 	{xpos = 050;	ypos = 750;}
			else if(value == 9) 	{xpos = 050;	ypos = 650;}
			else if(value == 10) 	{xpos = 050;	ypos = 550;}
			else if(value == 11) 	{xpos = 050;	ypos = 450;}
			else if(value == 12) 	{xpos = 050;	ypos = 350;}
			
			setLocation(xpos, ypos);					
		}
		
		else if(xpos == 650 && ypos == 850) {
			if	   (value == 2) 	{xpos = 450;	ypos = 850;}
			else if(value == 3) 	{xpos = 350;	ypos = 850;}
			else if(value == 4) 	{xpos = 250;	ypos = 850;}
			else if(value == 5) 	{xpos = 150;	ypos = 850;}
			else if(value == 6) 	{xpos = 050;	ypos = 850;}
			else if(value == 7) 	{xpos = 050;	ypos = 750;}
			else if(value == 8) 	{xpos = 050;	ypos = 650;}
			else if(value == 9) 	{xpos = 050;	ypos = 550;}
			else if(value == 10) 	{xpos = 050;	ypos = 450;}
			else if(value == 11) 	{xpos = 050;	ypos = 350;}
			else if(value == 12) 	{xpos = 050;	ypos = 250;}
			
			setLocation(xpos, ypos);					
		}
		
		else if(xpos == 550 && ypos == 850) {
			if	   (value == 2) 	{xpos = 350;	ypos = 850;}
			else if(value == 3) 	{xpos = 250;	ypos = 850;}
			else if(value == 4) 	{xpos = 150;	ypos = 850;}
			else if(value == 5) 	{xpos = 050;	ypos = 850;}
			else if(value == 6) 	{xpos = 050;	ypos = 750;}
			else if(value == 7) 	{xpos = 050;	ypos = 650;}
			else if(value == 8) 	{xpos = 050;	ypos = 550;}
			else if(value == 9) 	{xpos = 050;	ypos = 450;}
			else if(value == 10) 	{xpos = 050;	ypos = 350;}
			else if(value == 11) 	{xpos = 050;	ypos = 250;}
			else if(value == 12) 	{xpos = 050;	ypos = 150;}
			
			setLocation(xpos, ypos);					
		}
		
		else if(xpos == 450 && ypos == 850) {
			if	   (value == 2) 	{xpos = 250;	ypos = 850;}
			else if(value == 3) 	{xpos = 150;	ypos = 850;}
			else if(value == 4) 	{xpos = 050;	ypos = 850;}
			else if(value == 5) 	{xpos = 050;	ypos = 750;}
			else if(value == 6) 	{xpos = 050;	ypos = 650;}
			else if(value == 7) 	{xpos = 050;	ypos = 550;}
			else if(value == 8) 	{xpos = 050;	ypos = 450;}
			else if(value == 9) 	{xpos = 050;	ypos = 350;}
			else if(value == 10) 	{xpos = 050;	ypos = 250;}
			else if(value == 11) 	{xpos = 050;	ypos = 150;}
			else if(value == 12) 	{xpos = 050;	ypos = 050;		round++;}
			
			setLocation(xpos, ypos);					
		}
		
		
		else if(xpos == 350 && ypos == 850) {
			if	   (value == 2) 	{xpos = 150;	ypos = 850;}
			else if(value == 3) 	{xpos = 050;	ypos = 850;}
			else if(value == 4) 	{xpos = 050;	ypos = 750;}
			else if(value == 5) 	{xpos = 050;	ypos = 650;}
			else if(value == 6) 	{xpos = 050;	ypos = 550;}
			else if(value == 7) 	{xpos = 050;	ypos = 450;}
			else if(value == 8) 	{xpos = 050;	ypos = 350;}
			else if(value == 9) 	{xpos = 050;	ypos = 250;}
			else if(value == 10) 	{xpos = 050;	ypos = 150;}
			else if(value == 11) 	{xpos = 050;	ypos = 050;		round++;}
			else if(value == 12) 	{xpos = 150;	ypos = 050;		round++;}
			
			setLocation(xpos, ypos);				
		}
		
		else if(xpos == 250 && ypos == 850) {
			if	   (value == 2) 	{xpos = 050;	ypos = 850;}
			else if(value == 3) 	{xpos = 050;	ypos = 750;}
			else if(value == 4) 	{xpos = 050;	ypos = 650;}
			else if(value == 5) 	{xpos = 050;	ypos = 550;}
			else if(value == 6) 	{xpos = 050;	ypos = 450;}
			else if(value == 7) 	{xpos = 050;	ypos = 350;}
			else if(value == 8) 	{xpos = 050;	ypos = 250;}
			else if(value == 9) 	{xpos = 050;	ypos = 150;}
			else if(value == 10) 	{xpos = 050;	ypos = 050;		round++;}
			else if(value == 11) 	{xpos = 150;	ypos = 050;		round++;}
			else if(value == 12) 	{xpos = 250;	ypos = 050;		round++;}
			
			setLocation(xpos, ypos);					
		}
		
		else if(xpos == 150 && ypos == 850) {
			if	   (value == 2) 	{xpos = 050;	ypos = 750;}
			else if(value == 3) 	{xpos = 050;	ypos = 650;}
			else if(value == 4) 	{xpos = 050;	ypos = 550;}
			else if(value == 5) 	{xpos = 050;	ypos = 450;}
			else if(value == 6) 	{xpos = 050;	ypos = 350;}
			else if(value == 7) 	{xpos = 050;	ypos = 250;}
			else if(value == 8) 	{xpos = 050;	ypos = 150;}
			else if(value == 9) 	{xpos = 050;	ypos = 050;		round++;}
			else if(value == 10) 	{xpos = 150;	ypos = 050;		round++;}
			else if(value == 11) 	{xpos = 250;	ypos = 050;		round++;}
			else if(value == 12) 	{xpos = 350;	ypos = 050;		round++;}
			
			setLocation(xpos, ypos);					
		}
		
		else if(xpos == 050 && ypos == 850) {
			if	   (value == 2) 	{xpos = 050;	ypos = 650;}
			else if(value == 3) 	{xpos = 050;	ypos = 550;}
			else if(value == 4) 	{xpos = 050;	ypos = 450;}
			else if(value == 5) 	{xpos = 050;	ypos = 350;}
			else if(value == 6) 	{xpos = 050;	ypos = 250;}
			else if(value == 7) 	{xpos = 050;	ypos = 150;}
			else if(value == 8) 	{xpos = 050;	ypos = 050;		round++;}
			else if(value == 9) 	{xpos = 150;	ypos = 050;		round++;}
			else if(value == 10) 	{xpos = 250;	ypos = 050;		round++;}
			else if(value == 11) 	{xpos = 350;	ypos = 050;		round++;}
			else if(value == 12) 	{xpos = 450;	ypos = 050;		round++;}
			
			setLocation(xpos, ypos);					
		}
		
		else if(xpos == 050 && ypos == 750) {
			if	   (value == 2) 	{xpos = 050;	ypos = 550;}
			else if(value == 3) 	{xpos = 050;	ypos = 450;}
			else if(value == 4) 	{xpos = 050;	ypos = 350;}
			else if(value == 5) 	{xpos = 050;	ypos = 250;}
			else if(value == 6) 	{xpos = 050;	ypos = 150;}
			else if(value == 7) 	{xpos = 050;	ypos = 050;		round++;}
			else if(value == 8) 	{xpos = 150;	ypos = 050;		round++;}
			else if(value == 9) 	{xpos = 250;	ypos = 050;		round++;}
			else if(value == 10) 	{xpos = 350;	ypos = 050;		round++;}
			else if(value == 11) 	{xpos = 450;	ypos = 050;		round++;}
			else if(value == 12) 	{xpos = 550;	ypos = 050;		round++;}
			
			setLocation(xpos, ypos);					
		}
		
		else if(xpos == 050 && ypos == 650) {
			if	   (value == 2) 	{xpos = 050;	ypos = 450;}
			else if(value == 3) 	{xpos = 050;	ypos = 350;}
			else if(value == 4) 	{xpos = 050;	ypos = 250;}
			else if(value == 5) 	{xpos = 050;	ypos = 150;}
			else if(value == 6) 	{xpos = 050;	ypos = 050;		round++;}
			else if(value == 7) 	{xpos = 150;	ypos = 050;		round++;}
			else if(value == 8) 	{xpos = 250;	ypos = 050;		round++;}
			else if(value == 9) 	{xpos = 350;	ypos = 050;		round++;}
			else if(value == 10) 	{xpos = 450;	ypos = 050;		round++;}
			else if(value == 11) 	{xpos = 550;	ypos = 050;		round++;}
			else if(value == 12) 	{xpos = 650;	ypos = 050;		round++;}
			
			setLocation(xpos, ypos);					
		}
		
		else if(xpos == 050 && ypos == 550) {
			if	   (value == 2) 	{xpos = 050;	ypos = 350;}
			else if(value == 3) 	{xpos = 050;	ypos = 250;}
			else if(value == 4) 	{xpos = 050;	ypos = 150;}
			else if(value == 5) 	{xpos = 050;	ypos = 050;		round++;}
			else if(value == 6) 	{xpos = 150;	ypos = 050;		round++;}
			else if(value == 7) 	{xpos = 250;	ypos = 050;		round++;}
			else if(value == 8) 	{xpos = 350;	ypos = 050;		round++;}
			else if(value == 9) 	{xpos = 450;	ypos = 050;		round++;}
			else if(value == 10) 	{xpos = 550;	ypos = 050;		round++;}
			else if(value == 11) 	{xpos = 650;	ypos = 050;		round++;}
			else if(value == 12) 	{xpos = 750;	ypos = 050;		round++;}
			
			setLocation(xpos, ypos);	
		}
		
		else if(xpos == 050 && ypos == 450) {
			if	   (value == 2) 	{xpos = 050;	ypos = 250;}
			else if(value == 3) 	{xpos = 050;	ypos = 150;}
			else if(value == 4) 	{xpos = 050;	ypos = 050;		round++;}
			else if(value == 5) 	{xpos = 150;	ypos = 050;		round++;}
			else if(value == 6) 	{xpos = 250;	ypos = 050;		round++;}
			else if(value == 7) 	{xpos = 350;	ypos = 050;		round++;}
			else if(value == 8) 	{xpos = 450;	ypos = 050;		round++;}
			else if(value == 9) 	{xpos = 550;	ypos = 050;		round++;}
			else if(value == 10) 	{xpos = 650;	ypos = 050;		round++;}
			else if(value == 11) 	{xpos = 750;	ypos = 050;		round++;}
			else if(value == 12) 	{xpos = 850;	ypos = 050;		round++;}
			
			setLocation(xpos, ypos);					
		}
		
		else if(xpos == 050 && ypos == 350) {
			if	   (value == 2) 	{xpos = 050;	ypos = 150;}
			else if(value == 3) 	{xpos = 050;	ypos = 050;		round++;}
			else if(value == 4) 	{xpos = 150;	ypos = 050;		round++;}
			else if(value == 5) 	{xpos = 250;	ypos = 050;		round++;}
			else if(value == 6) 	{xpos = 350;	ypos = 050;		round++;}
			else if(value == 7) 	{xpos = 450;	ypos = 050;		round++;}
			else if(value == 8) 	{xpos = 550;	ypos = 050;		round++;}
			else if(value == 9) 	{xpos = 650;	ypos = 050;		round++;}
			else if(value == 10) 	{xpos = 750;	ypos = 050;		round++;}
			else if(value == 11) 	{xpos = 850;	ypos = 050;		round++;}
			else if(value == 12) 	{xpos = 850;	ypos = 050;		round++;}
			
			setLocation(xpos, ypos);	
		}
		
		else if(xpos == 050 && ypos == 250) {
			if	   (value == 2) 	{xpos = 050;	ypos = 050;		round++;}
			else if(value == 3) 	{xpos = 150;	ypos = 050;		round++;}
			else if(value == 4) 	{xpos = 250;	ypos = 050;		round++;}
			else if(value == 5) 	{xpos = 350;	ypos = 050;		round++;}
			else if(value == 6) 	{xpos = 450;	ypos = 050;		round++;}
			else if(value == 7) 	{xpos = 550;	ypos = 050;		round++;}
			else if(value == 8) 	{xpos = 650;	ypos = 050;		round++;}
			else if(value == 9) 	{xpos = 750;	ypos = 050;		round++;}
			else if(value == 10) 	{xpos = 850;	ypos = 050;		round++;}
			else if(value == 11) 	{xpos = 850;	ypos = 150;		round++;}
			else if(value == 12) 	{xpos = 850;	ypos = 250;		round++;}
			
			setLocation(xpos, ypos);	
		}
		
		else if(xpos == 050 && ypos == 150) {
			if	   (value == 2) 	{xpos = 150;	ypos = 050;		round++;}
			else if(value == 3) 	{xpos = 250;	ypos = 050;		round++;}
			else if(value == 4) 	{xpos = 350;	ypos = 050;		round++;}
			else if(value == 5) 	{xpos = 450;	ypos = 050;		round++;}
			else if(value == 6) 	{xpos = 550;	ypos = 050;		round++;}
			else if(value == 7) 	{xpos = 650;	ypos = 050;		round++;}
			else if(value == 8) 	{xpos = 750;	ypos = 050;		round++;}
			else if(value == 9) 	{xpos = 850;	ypos = 050;		round++;}
			else if(value == 10) 	{xpos = 850;	ypos = 150;		round++;}
			else if(value == 11) 	{xpos = 850;	ypos = 250;		round++;}
			else if(value == 12) 	{xpos = 850;	ypos = 350;		round++;}
			
			setLocation(xpos, ypos);					
		}
	
	}
}

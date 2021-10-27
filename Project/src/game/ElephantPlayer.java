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
	/*	thread = new Thread(new Runnable() {
			
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
		thread.start(); */
		getFrame().getPlayer1().setLocation(xpos, ypos);

	}

	public void checkPos(int value)
	{		thread = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i = 0; i < value ; i++) {
					
					if(ypos == 0 && xpos < 800) {
						xpos +=100;
					}
					else if(xpos == 800 && ypos < 800) {
						ypos +=100;
					}
					else if(ypos == 800 && xpos > 0) {
						xpos -=100;
					}
					else {
						ypos -=100;
					}
				try {
					thread.sleep(160);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				setLocation(xpos, ypos);}
			}
		});
		
		thread.start();
		
	}
	
	
	
}

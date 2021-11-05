package game;

public class PenguinPlayer extends Player {
	private Thread thread;

	int count;

	public PenguinPlayer(Frame frame) {
		super(frame);
		// TODO Auto-generated constructor stub
	}

	private int xpos, ypos;

	public void setLocation(int x, int y) {
		this.xpos = x;
		this.ypos = y;

		getFrame().getPlayer2().setLocation(xpos, ypos);
	}

	public void checkPos(int value) {
		thread = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				if (xpos == 0 && ypos == 0) {
					xpos = 50;
					ypos = 50;
				}
				
				for (int i = 0; i < value; i++) {
					if(count != 96) {
					
						if (ypos == 50 && xpos < 850) {
							xpos += 100;

						} else if (xpos == 850 && ypos < 850) {
							ypos += 100;
						} else if (ypos == 850 && xpos > 50) {
							xpos -= 100;
						} else {
							ypos -= 100;
						}
						try {
							thread.sleep(160);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						setLocation(xpos, ypos);
						count += 1;
						}
					
					else {  // result
						EndFrame endFrame = new EndFrame();
						endFrame.setVisible(true);
						
						break;
					}
				}
			}
		});
		thread.start();
	} 
}

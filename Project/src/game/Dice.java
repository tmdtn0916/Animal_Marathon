package game;
import java.util.Random;
import game.Frame;

public class Dice {
		
	
		static int dice1 = 0;
		static int dice2 = 0;
		
			
		public static int Roll() {
			
			
			Random random = new Random();
			dice1 = random.nextInt(6) + 1;
			dice2 = random.nextInt(6) + 1;
			
			int sum = (int)(dice1 + dice2);
			
			
			return sum;
			
		}
		
}

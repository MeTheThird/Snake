package Snake;

import zen.core.Zen;

public class SnakeGame {

	public static void main(String[] args) {
		Zen.create(500, 500);
		
		Snake s = new Snake();
		Food f = new Food();
		f.showAt(200, 200);
		
		while (true) {
			Zen.setBackground("black");
			
			s.draw();
			s.move();
			s.check();
			
			f.draw();
			
			if (s.isEating(f)) {
				s.grow();
				f.showAt(Zen.getRandomNumber(1, 49)*10, Zen.getRandomNumber(1, 49)*10);
			}

			Zen.buffer(33);
		}
	}

}

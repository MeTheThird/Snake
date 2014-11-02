package Snake;

import zen.core.Zen;

public class Food {
	int x;
	int y;
	
	
	public void showAt(int i, int j) {
		x = i;
		y = j;
	}
	public void draw() {
		Zen.setColor("red");
		Zen.fillOval(x, y, 10, 10);
	}
}


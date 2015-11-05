package pontus.walljumper.game.spawner;

import pontus.walljumper.game.Game;
import pontus.walljumper.game.entities.Wall;

public class Spawner {

	Game g;
	
	public Spawner(Game g) {
		this.g = g;
	}
	
	float timer = 0;
	float spawnRate = 0.5f;
	
	double side = 0;

	public void update(float delta) {
		
		timer += delta;
		if (timer >= 1 / spawnRate) {
			timer = 0;
			float x = 0;
			if (side % 2 == 0) {
				x = -g.camera.viewportWidth / 2;
			} else {
				x = g.camera.viewportWidth / 2;
			}
			side++;
			g.entities.add(new Wall(x, g.camera.viewportHeight / 2));
		}
		
	}
	
}

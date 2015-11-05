package pontus.walljumper.game.entities;

import pontus.walljumper.game.Game;

public class Wall extends Entity {

	public Wall(float x, float y) {
		
		height = 300;
		width = 100;
		position.set(x, y + height / 2);
	}

	@Override
	public void render(float delta) {
		super.render(delta);

		velocity.y = -Game.speed;
	
	}
	
}

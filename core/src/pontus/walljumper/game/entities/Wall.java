package pontus.walljumper.game.entities;

import pontus.walljumper.game.Game;

public class Wall extends Entity {

	public float speedMultiplier = 1;
	
	public Wall(float x, float y, float speedMultiplier) {
		
		this.speedMultiplier = speedMultiplier;
		height = 300;
		width = 50;
		position.set(x, y + height / 2);
	}

	@Override
	public void render(float delta) {
		super.render(delta);

		velocity.y = -Game.speed * speedMultiplier;
	
	}
	
}

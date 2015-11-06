package pontus.walljumper.game.entities;

import pontus.walljumper.game.effects.ParticleHandler;
import pontus.walljumper.game.effects.particles.Trail;

public class Player extends Entity {

	public Player() {
		width = 75;
		height = 75;
		velocity.y = 0;
	}

	float timer = 0;
	
	@Override
	public void render(float delta) {
		super.render(delta);

		timer += delta;
		if (timer > 0.2f) {
			timer = 0;
			ParticleHandler.spawn(new Trail(position));
		}
		
		
//		velocity.y -= 75;
	
	}

}

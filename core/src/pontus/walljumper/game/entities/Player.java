package pontus.walljumper.game.entities;

import pontus.walljumper.core.Input;
import pontus.walljumper.core.Swipe;
import pontus.walljumper.game.effects.ParticleHandler;
import pontus.walljumper.game.effects.particles.Trail;

public class Player extends Entity {

	public Player() {
		position.setX(75);
		width = 75;
		height = 75;
		velocity.y = 0;
	}

	float timer = 0;

	@Override
	public void render(float delta) {
		super.render(delta);

		Swipe s = Input.getSwipe();
		if (s.time != -1) {
			if (s.direction.angle() > 0 && s.direction.angle() < 90 || s.direction.angle() > 270 && s.direction.angle() < 360) {
				velocity.x = 500;
			} else {
				velocity.x = -500;
			}
		}

		timer += delta;
		if (timer > 0.2f) {
			timer = 0;
			ParticleHandler.spawn(new Trail(position));
		}

		// velocity.y -= 75;

	}

}

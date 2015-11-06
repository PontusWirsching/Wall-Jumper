package pontus.walljumper.game.effects.particles;

import pontus.walljumper.core.math.Point;
import pontus.walljumper.game.Colors;
import pontus.walljumper.game.Game;
import pontus.walljumper.game.effects.Particle;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;


public class Trail extends Particle {

	private float size = 75;
	
	private Color c = Colors.PLAYER;
	
	public Trail(Point p) {
		super(p.x, p.y);
		
	}
	
	float a = 1;

	@Override
	public void render(ShapeRenderer sr, float delta) {
		vel.y = -Game.speed;
		
		size -= 50 * delta;
		
		a -= 1 * delta;
		if (a <= 0) a = 0;
		
		sr.setColor(c.r, c.g, c.b, a);
		sr.rect(position.x - size / 2, position.y - size / 2, size, size);
	}

}

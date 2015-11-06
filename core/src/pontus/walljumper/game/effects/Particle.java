package pontus.walljumper.game.effects;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Vector2;

import pontus.walljumper.core.math.Point;

public abstract class Particle {

	public Point position = new Point();
	
	public Vector2 vel = new Vector2();
	
	public Particle(float x, float y) {
		position.set(x, y);
	}
	
	public abstract void render(ShapeRenderer sr, float delta);

}

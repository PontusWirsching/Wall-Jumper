package pontus.walljumper.game.entities;

import com.badlogic.gdx.math.Vector2;

import pontus.walljumper.core.math.Point;

public class Entity {

	public Point position = new Point();
	
	public Vector2 velocity = new Vector2();
	
	public float width = 50;
	public float height = 50;
	
	public Entity() {
		
	}
	
	public void render(float delta) {
		position.set(position.getX() + velocity.x * delta, position.getY() + velocity.y * delta);
	}

}

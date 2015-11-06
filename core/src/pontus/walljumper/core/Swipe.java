package pontus.walljumper.core;

import com.badlogic.gdx.math.Vector2;

public class Swipe {

	public Vector2 direction;
	public float time;
	
	public Swipe(Vector2 v, float time) {
		this.direction = v;
		this.time = time;
	}

}

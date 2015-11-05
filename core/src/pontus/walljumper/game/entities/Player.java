package pontus.walljumper.game.entities;

public class Player extends Entity {

	public Player() {
		size = 75;
		velocity.y = -200;
	}
	
	@Override
	public void render(float delta) {
		super.render(delta);

		velocity.y -= 50;
		
	}

}

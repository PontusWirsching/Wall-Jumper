package pontus.walljumper.game.entities;

public class Player extends Entity {

	public Player() {
		width = 75;
		height = 75;
		velocity.y = 0;
	}
	
	@Override
	public void render(float delta) {
		super.render(delta);

//		velocity.y -= 75;
	
	}

}

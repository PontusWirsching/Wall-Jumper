package pontus.walljumper.game;

import pontus.walljumper.core.graphics.Screen;
import pontus.walljumper.game.entities.Entity;
import pontus.walljumper.game.entities.Player;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;


public class Game extends Screen {

	public Entity player;
	
	public Game() {
		super("GAME");
		
		player = new Player();
		
	}
	
	@Override
	public void render(float delta) {
		super.render(delta);

		Gdx.gl.glClearColor(Colors.BACKGROUND.r, Colors.BACKGROUND.g, Colors.BACKGROUND.b, Colors.BACKGROUND.a);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		
		sr.begin(ShapeType.Filled);
		{
			sr.setColor(Colors.PLAYER);
			player.render(delta);
			sr.rect(player.position.getX(), player.position.getY(), player.size, player.size);
		}
		sr.end();
	
	}

}

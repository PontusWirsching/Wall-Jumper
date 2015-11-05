package pontus.walljumper.game;

import java.util.ArrayList;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;

import pontus.walljumper.core.graphics.Screen;
import pontus.walljumper.game.entities.Entity;
import pontus.walljumper.game.entities.Player;
import pontus.walljumper.game.spawner.Spawner;


public class Game extends Screen {

	public Entity player;

	public ArrayList<Entity> entities = new ArrayList<Entity>();
	
	public Spawner level1 = new Spawner(this);
	
	public static int speed = 300;
	
	public Game() {
		super("GAME");
		
		player = new Player();
		
	}
	
	@Override
	public void render(float delta) {
		super.render(delta);

		Gdx.gl.glClearColor(Colors.BACKGROUND.r, Colors.BACKGROUND.g, Colors.BACKGROUND.b, Colors.BACKGROUND.a);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		level1.update(delta);
		
		sr.begin(ShapeType.Filled);
		{
			
			sr.setColor(Colors.WALL_02);
			for (int i = 0; i < entities.size(); i++) {
				if (i >= entities.size()) break;
				Entity e = entities.get(i);
				if (e == null) continue;
				
				e.render(delta);
				sr.rect(e.position.getX() - e.width / 2, e.position.getY() - e.height / 2, e.width, e.height);
			}
			
			
			sr.setColor(Colors.PLAYER);
			player.render(delta);
			sr.rect(player.position.getX() - player.width / 2, player.position.getY() - player.height / 2, player.width, player.height);
		}
		sr.end();
	
	}

}

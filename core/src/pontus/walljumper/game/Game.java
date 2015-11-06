package pontus.walljumper.game;

import java.util.ArrayList;

import pontus.walljumper.core.Input;
import pontus.walljumper.core.Swipe;
import pontus.walljumper.core.graphics.Screen;
import pontus.walljumper.game.effects.ParticleHandler;
import pontus.walljumper.game.entities.Entity;
import pontus.walljumper.game.entities.Player;
import pontus.walljumper.game.spawner.Spawner;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;


public class Game extends Screen {

	public Entity player;
	
	public ArrayList<Entity> entities = new ArrayList<Entity>();
	
	public Spawner level1 = new Spawner(this);
	
	public static int speed = 300;
	
	public Game() {
		super("GAME");
		
		player = new Player();
		
		ParticleHandler.init(this);
		
		
	}
	
	@Override
	public void render(float delta) {
		super.render(delta);
		Input.update();

		Gdx.gl.glEnable(GL20.GL_BLEND);
	    Gdx.gl.glBlendFunc(GL20.GL_SRC_ALPHA, GL20.GL_ONE_MINUS_SRC_ALPHA);
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
			
			ParticleHandler.render(sr, delta);
			
			sr.setColor(Colors.PLAYER);
			player.render(delta);
			sr.rect(player.position.getX() - player.width / 2, player.position.getY() - player.height / 2, player.width, player.height);
		
			sr.setColor(Color.RED);
			sr.rect(Input.getX() - 5, Input.getY() - 5, 10, 10);
		
			Swipe s  = Input.getSwipe();
			
			if (s.time != -1) {
				System.out.println(s.direction.angle());
			}
			
			
			
			if (Input.isTouched()) {
				sr.rect(Input.getX() - 10, Input.getY() - 10, 20, 20);

			}
			
		}
		sr.end();
	
	}

}

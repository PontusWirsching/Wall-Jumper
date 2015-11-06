package pontus.walljumper;

import pontus.walljumper.core.Input;
import pontus.walljumper.core.graphics.ScreenManager;
import pontus.walljumper.game.Game;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;

public class WallJumper implements ApplicationListener {

	public static final int VIRTUAL_WIDTH = 500;
	
	@Override
	public void create() {
		
		ScreenManager.add(new Game());
		
		
		
		ScreenManager.setSelected("GAME");
		
		
		
		Gdx.input.setInputProcessor(new Input());

	}

	@Override
	public void resize(int width, int height) {
		ScreenManager.resize(width, height);
	}

	@Override
	public void render() {
		ScreenManager.render(Gdx.graphics.getDeltaTime());
	}

	@Override
	public void pause() {
		
	}

	@Override
	public void resume() {
		
	}

	@Override
	public void dispose() {
		
	}

}

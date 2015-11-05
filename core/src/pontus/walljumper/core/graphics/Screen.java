package pontus.walljumper.core.graphics;

import pontus.walljumper.WallJumper;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class Screen implements com.badlogic.gdx.Screen {

	public OrthographicCamera camera;
	
	public SpriteBatch sb;
	public ShapeRenderer sr;
	
	public String name = "UNDEFINED";
	
	public Screen(String name) {
		this.name = name;
		sb = new SpriteBatch();
		sr = new ShapeRenderer();
		
		float w = Gdx.graphics.getWidth(); // Real screen width.
		float h = Gdx.graphics.getHeight(); // Real screen height.
		
		//Initialize camera.
		camera = new OrthographicCamera(WallJumper.VIRTUAL_WIDTH, WallJumper.VIRTUAL_WIDTH * (h / w));
	}

	@Override
	public void show() {

	}

	@Override
	public void render(float delta) {
		camera.update();
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		sb.setProjectionMatrix(camera.combined);
		sr.setProjectionMatrix(camera.combined);
	}

	@Override
	public void resize(int width, int height) {
		float w = Gdx.graphics.getWidth(); // Real screen width.
		float h = Gdx.graphics.getHeight(); // Real screen height.
		
		//Initialize camera.
		camera = new OrthographicCamera((WallJumper.VIRTUAL_WIDTH + 1) / 2 * 2, (WallJumper.VIRTUAL_WIDTH * (h / w) + 1) / 2 * 2);
		
	}

	@Override
	public void pause() {

	}

	@Override
	public void resume() {

	}

	@Override
	public void hide() {

	}

	@Override
	public void dispose() {
		sr.dispose();
		sb.dispose();
	}
}

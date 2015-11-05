package pontus.walljumper.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import pontus.walljumper.WallJumper;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = 1080 / 2;
		config.height = 1920 / 2;
		config.resizable = false;
		new LwjglApplication(new WallJumper(), config);
	}
}

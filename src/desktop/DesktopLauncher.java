package com.mygdx.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.badlogic.gdx.graphics.g3d.particles.batches.BillboardParticleBatch.Config;
import com.mygdx.game.MyGdxGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title=MyGdxGame.TITLE;
		config.height=(int)(MyGdxGame.HEIGHT*0.7);
			config.width=(int)(MyGdxGame.WIDTH*0.7);
			
		new LwjglApplication(new MyGdxGame(), config);
	}
}

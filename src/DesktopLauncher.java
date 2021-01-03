package com.mygdx.sevimlikodlar.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.sevimlikodlar.SevimliKodlar;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		
		config.title=SevimliKodlar.TITLE;
		config.height=(int) (SevimliKodlar.HEIGHT*0.7);
				config.width=(int) (SevimliKodlar.WIDHT*0.7);
		new LwjglApplication(new SevimliKodlar(), config);
	}
}

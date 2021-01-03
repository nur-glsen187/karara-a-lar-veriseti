package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.imageloader.ResimEkleme;
import com.mygdx.states.DurumYoneticisi;
import com.mygdx.states.OyunDurum;

public class MyGdxGame extends Game {
	public static int WIDTH=480;
	public static int HEIGHT=800;
	public static String TITLE="SEVÝMLÝ KODLAR";
	
	
	private SpriteBatch sb;
	
	private  static DurumYoneticisi sm;
	public void create () {
		
		Gdx.gl.glClearColor(0.1f, 0.1f, 0.1f,1 );
		ResimEkleme.load();
		sb= new SpriteBatch();
		sm=new DurumYoneticisi();
		sm.pushState(new OyunDurum());
		System.out.println("oyun oluþturuldu..");
		
	}

	@Override
	public void render () {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		sm.render(sb);
		sm.update(Gdx.graphics.getDeltaTime());
	
	}
	
	@Override
	public void dispose () {
		ResimEkleme.dispose();
		System.out.println("oyun yok edildi");
		
	}
}

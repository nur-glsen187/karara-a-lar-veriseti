package com.mygdx.girisHandle;

import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.InputProcessor;

public class OyunDurumInput implements  InputProcessor{

	@Override
	public boolean keyDown(int keycode) {
	
		
		switch(keycode) {
		case Keys.A:
			System.out.println("A'ya bas�ld�");
			break;
		case Keys.S:
			System.out.println("S'ya bas�ld�");
			break;
		case Keys.D:
			System.out.println("D'ye bas�ld�");
			break;
		case Keys.W:
			System.out.println("W'ye bas�ld�");
			break;
		default:
			break;
		}
		return false;
	}

	@Override
	public boolean keyUp(int keycode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean keyTyped(char character) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean scrolled(float amountX, float amountY) {
		// TODO Auto-generated method stub
		return false;
	}

}

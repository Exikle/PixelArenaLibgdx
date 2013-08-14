package com.xidstudios.pixelarena;

import com.badlogic.gdx.Game;
import com.xidstudios.pixelarena.screens.SplashScreen;

public class PixelArenaMain extends Game {
	public static final String PIXELARENA_VERSION = "0.0.0.01 Pre-Alpha";
	public static final String LOG = "Pixel Arena";
	
	@Override
	public void create() {
		setScreen(new SplashScreen(this));
	}

	@Override
	public void dispose() {
		super.dispose();
	}

	@Override
	public void render() {
		super.render();
	}

	@Override
	public void resize(int width, int height) {
		super.resize(width, height);
	}

	@Override
	public void pause() {
		super.pause();
	}

	@Override
	public void resume() {
		super.resume();
	}
}

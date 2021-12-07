package com.monorun.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;

public class GameScreen implements Screen {
MonoRun game;
	public GameScreen(MonoRun game) {
		this.game = game;
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub

	}

	@Override
	public void render(float delta) {
		// TODO Auto-generated method stub
		Gdx.gl.glClearColor(0, 0, 1, 1); //Establezco el color de la pantalla con OpenGL
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT); //Limpio buffer de color OpenGL
		game.batch.begin();
		game.font.draw(game.batch, "PLACEHOLDER", 200, 200);
		game.batch.end();
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub

	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub

	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub

	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

}

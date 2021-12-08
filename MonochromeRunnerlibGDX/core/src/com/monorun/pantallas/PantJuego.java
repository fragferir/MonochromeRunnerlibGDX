package com.monorun.pantallas;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.monorun.game.MonoRun;

public class PantJuego implements Screen {
private MonoRun game;
Texture textura;
private OrthographicCamera camjuego;
private Viewport portVistajuego;
private PantHUD PantHUD;

public PantJuego(MonoRun game) {
this.game = game;
textura = new Texture("badlogic.jpg");
camjuego = new OrthographicCamera();
portVistajuego = new FitViewport(MonoRun.alto, MonoRun.ancho, camjuego);
PantHUD = new PantHUD(game.batch);



}
@Override
public void show() {
	// TODO Auto-generated method stub
	
}

@Override
public void render(float delta) {
	// TODO Auto-generated method stub
	Gdx.gl.glClearColor(0,0,0,1);
	Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
	camjuego.update();
	game.batch.setProjectionMatrix(camjuego.combined);
	game.batch.setProjectionMatrix(PantHUD.escenarioHUD.getCamera().combined);
	PantHUD.escenarioHUD.draw();
	
}

@Override
public void resize(int width, int height) {
	// TODO Auto-generated method stub
	portVistajuego.update(width, height);
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

package com.monorun.pantallas;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.monorun.game.MonoRun;

public class PantMenuPrincipal implements Screen {
	MonoRun game;
	Texture BotSalir;
	Texture BotJugar;
	Texture JuegoLogo;
	private static final int BotSalirAncho = 250;
	private static final int BotSalirAlto = 100;
	private static final int BotJugarAncho = 250;
	private static final int BotJugarAlto = 100;
	private static final int JuegoLogoAncho = 800;
	private static final int JuegoLogoAlto = 344;
	private static final int BotSalirY=0;
	private static final int BotJugarY=150;
	
	
	public PantMenuPrincipal (MonoRun game){
		this.game = game;
		BotJugar = new Texture("Jugar.png");
		BotSalir = new Texture("Salir.png");
		JuegoLogo = new Texture("JuegoLogo.png");
	}
	
	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor((float) 0.10, (float) 0.10,(float) 0.11, 0); //Establezco el color de la pantalla con OpenGL
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT); //Limpio buffer de color OpenGL
		game.batch.begin();
		game.batch.draw(JuegoLogo, MonoRun.ancho/2 - JuegoLogoAncho/2, 350, JuegoLogoAncho, JuegoLogoAlto);
		game.batch.draw(BotJugar, MonoRun.ancho/2 - BotJugarAncho / 2, 150, BotJugarAncho, BotJugarAlto);
		game.batch.draw(BotSalir, MonoRun.ancho/2 - BotSalirAncho / 2, 0, BotSalirAncho, BotSalirAlto);
		int x = MonoRun.ancho / 2 - BotSalirAncho / 2;
		if (Gdx.input.getX() < x + BotSalirAncho && Gdx.input.getX() > x && MonoRun.alto - Gdx.input.getY() < BotSalirY + BotSalirAlto && MonoRun.alto - Gdx.input.getY() > BotSalirY) {
			game.font.draw(game.batch, "Desea salir..?", 100, 100);
			if (Gdx.input.isTouched()){
				this.dispose();
				Gdx.app.exit();
			}
		}
		x = MonoRun.ancho / 2 - BotJugarAncho / 2;
		if(Gdx.input.getX() < x + BotJugarAncho && Gdx.input.getX() > x && MonoRun.alto - Gdx.input.getY() < BotJugarY + BotJugarAlto && MonoRun.alto - Gdx.input.getY() > BotJugarY) {
			game.font.draw(game.batch, "Desea jugar..?", 100, 100);
			if(Gdx.input.isTouched()) {
				game.setScreen(new PantJuego(game));
				dispose();
			}
		}
		game.batch.end();
	}
    
    @Override
	public void show() {
		// TODO Auto-generated method stub	
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub

	}

	@Override
	public void pause() {}

	@Override
	public void resume() {}

	@Override
	public void hide() {}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
	}

}

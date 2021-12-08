package com.monorun.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.monorun.pantallas.PantMenuPrincipal;

public class MonoRun extends Game {
	   public SpriteBatch batch;
	   public BitmapFont font;
	   public static int alto = 600;
	   public static int ancho = 800;
		@Override
		public void create() {
			
			batch = new SpriteBatch();
			font = new BitmapFont();
			this.setScreen(new PantMenuPrincipal(this));
		}
		public void render() {
			super.render();
		}
		public void dispose() {
			batch.dispose();
			font.dispose();
		}
}

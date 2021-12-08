package com.monorun.pantallas;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.monorun.game.MonoRun;

public class PantHUD {
public Stage escenarioHUD;
private Viewport viewportHUD;
private Integer nivCronometro;
private Integer nivPuntos;
private String nivCronometroTXT;

Label nivCronometroLabel;
Label puntosLabel;
Label nivCronometroTXTLabel;
public PantHUD(SpriteBatch sb) {
	nivCronometro = 0;
	nivPuntos = 0;
	nivCronometroTXT = "";
	viewportHUD = new FitViewport(MonoRun.ancho, MonoRun.alto, new OrthographicCamera());
	escenarioHUD = new Stage(viewportHUD, sb);
	//Despues de crear la logica para la Interfaz, realizo una tabla:
	Table tablaHUD = new Table();
	tablaHUD.top(); //pongo la tabla encima de la pantalla.
	tablaHUD.setFillParent(true); //la Interfaz tiene el mismo tamaño que la pantalla.
	//Inicializo las Labels
	nivCronometroLabel = new Label(String.format("%03d", nivCronometro), new Label.LabelStyle(new BitmapFont(), Color.WHITE));
	nivCronometroTXTLabel = new Label("TIEMPO", new Label.LabelStyle(new BitmapFont(), Color.WHITE));
	nivCronometroLabel.setFontScale(2f,2f);
	nivCronometroTXTLabel.setFontScale(2f,2f);
	//Y ahora las añado a la Tabla:
	tablaHUD.add(nivCronometroTXTLabel).expandX();
	tablaHUD.row();
	tablaHUD.add(nivCronometroLabel).expandX();
	escenarioHUD.addActor(tablaHUD);
	}
}

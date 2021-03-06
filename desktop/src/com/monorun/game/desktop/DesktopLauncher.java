package com.monorun.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.monorun.game.MonoRun;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.resizable = false;
		config.width = MonoRun.ancho;
		config.height = MonoRun.alto; 
		new LwjglApplication(new MonoRun(), config);
	}
}

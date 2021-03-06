package ru.pin_ka.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

import ru.pin_ka.Sweet2DGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		float acpect=3f/4f;
		config.width=400;
		config.height=(int)(config.width/acpect);
		config.resizable=false;
		new LwjglApplication(new Sweet2DGame(), config);
	}
}

package com.github.hanyaeger.tutorial;

import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.YaegerGame;

public class KillerPanda extends YaegerGame{
		
		/**
		 * Activate the Game engine?
		 * @param args
		 */
		public static void main(String[] args) {
			launch(args);
		}

		@Override
		public void setupGame() {
			setGameTitle("Killer Panda");
			setSize(new Size(800, 600));
		}

		@Override
		public void setupScenes() {
			addScene(0, new StartScreen(this));
			addScene(1, new Farm(this));
			addScene(2, new EndScreen(this));
			addScene(3, new SettingsScreen(this));
			addScene(4, new MultiplayerFarm(this));
		}

}

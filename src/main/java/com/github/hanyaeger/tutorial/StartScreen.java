package com.github.hanyaeger.tutorial;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.scenes.StaticScene;

import Button.SettingsButton;
import Button.StartButton;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class StartScreen extends StaticScene{
	
	private KillerPanda killerPanda;
	
	/**
	 * Set the main class in the start screen
	 * @param killerPanda the main class
	 */
	public StartScreen(KillerPanda killerPanda) {
		this.killerPanda = killerPanda;
	}

	@Override
	public void setupScene() {
		setBackgroundImage("backgrounds/panda.jpg");
	}

	@Override
	public void setupEntities() {
		var killerPandaText = new TextEntity(
				new Coordinate2D((getWidth() / 3) * 2, getHeight() / 2),
				"Killer Panda"
		);
		killerPandaText.setAnchorPoint(AnchorPoint.CENTER_CENTER);
		killerPandaText.setFill(Color.BLACK);
		killerPandaText.setFont(Font.font("Roboto", FontWeight.SEMI_BOLD, 80));
		addEntity(killerPandaText);
		
		var playGameButton = new StartButton(
				new Coordinate2D((getWidth() / 3) * 2, (getHeight() / 2) + 40),
				killerPanda
		);
		playGameButton.setAnchorPoint(AnchorPoint.TOP_CENTER);
		addEntity(playGameButton);
		
		var settingsButton = new SettingsButton(
				new Coordinate2D(getWidth() - 5, 0),
				killerPanda
		);
		settingsButton.setAnchorPoint(AnchorPoint.TOP_RIGHT);
		addEntity(settingsButton);
		
	}

}

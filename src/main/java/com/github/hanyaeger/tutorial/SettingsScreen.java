package com.github.hanyaeger.tutorial;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.scenes.StaticScene;

import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class SettingsScreen extends StaticScene{
	
	KillerPanda killerPanda;

	public SettingsScreen(KillerPanda killerPanda) {
		this.killerPanda = killerPanda;
	}
	
	@Override
	public void setupScene() {
		setBackgroundImage("backgrounds/farm.jpg");
	}

	@Override
	public void setupEntities() {
		var settingsText = new TextEntity(
				new Coordinate2D(getWidth() / 2, 0),
				"Settings"
		);
		settingsText.setAnchorPoint(AnchorPoint.TOP_CENTER);
		settingsText.setFill(Color.BLACK);
		settingsText.setFont(Font.font("Roboto", FontWeight.BOLD, 60));
		addEntity(settingsText);
		
		var playersText = new TextEntity(
				new Coordinate2D(25, getHeight() / 5),
				"Players:"
		);
		playersText.setAnchorPoint(AnchorPoint.TOP_LEFT);
		playersText.setFill(Color.BLACK);
		playersText.setFont(Font.font("Roboto", FontWeight.SEMI_BOLD, 30));
		addEntity(playersText);
	}

}

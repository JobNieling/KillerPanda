package com.github.hanyaeger.tutorial;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;

import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class AnimalsKilledText extends TextEntity{

	public AnimalsKilledText(Coordinate2D initialLocation) {
		super(initialLocation);

		setFont(Font.font("Roboto", FontWeight.NORMAL, 30));
		setFill(Color.BLACK);
	}
	
	public void setText(int animalsKilled) {
		setText("Animals Killed: " + animalsKilled);
	}

}

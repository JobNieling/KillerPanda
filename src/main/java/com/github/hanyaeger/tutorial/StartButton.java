package com.github.hanyaeger.tutorial;

import com.github.hanyaeger.api.Coordinate2D;

import javafx.scene.Cursor;
import javafx.scene.input.MouseButton;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class StartButton extends Button{

	public StartButton(Coordinate2D initialLocation, KillerPanda killerPanda) {
		super(initialLocation, "Play Game", killerPanda);
		setFill(Color.PURPLE);
		setFont(Font.font("Roboto", FontWeight.BOLD, 30));
	}

	@Override
	public void onMouseButtonPressed(MouseButton button, Coordinate2D coordinate2d) {
		killerPanda.setActiveScene(1);
	}

	@Override
	public void onMouseExited() {
		setFill(Color.PURPLE);
		setCursor(Cursor.DEFAULT);
	}

	@Override
	public void onMouseEntered() {
		setFill(Color.VIOLET);
		setCursor(Cursor.HAND);
	}

}

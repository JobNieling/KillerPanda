package com.github.hanyaeger.tutorial;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;

public class Turtle extends Animal{
	
	protected Turtle(Coordinate2D initialLocation) {
		super("sprites/turtle.png", initialLocation, new Size(75, 35), 1, 1);
		
		setLives(2);
	}

	@Override
	public void action() {
		hide();
	}

	
	public void hide() {
		
	}

}

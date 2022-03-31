package com.github.hanyaeger.tutorial;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;

public class Turtle extends Animal{

	protected Turtle(Coordinate2D initialLocation) {
		super("sprites/turtle.png", initialLocation, new Size(75, 35), 1, 1, 2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void action() {
		hide();
	}

	@Override
	public void setLives() {
		 int lives = 2;
	}
	
	public void hide() {
		
	}

}

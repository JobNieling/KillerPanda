package com.github.hanyaeger.tutorial;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;

public class Bird extends Animal{

	protected Bird(Coordinate2D initialLocation) {
		super("sprites/bird.png", initialLocation, new Size(60, 30), 1, 1, 1);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void action() {
		teleport();
	}

	@Override
	public void setLives() {
		int lives = 1;
	}
	
	public void teleport() {
		
	}

}

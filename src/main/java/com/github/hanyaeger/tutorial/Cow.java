package com.github.hanyaeger.tutorial;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;

public class Cow extends Animal{

	protected Cow(Coordinate2D initialLocation) {
		super("sprites/cow_finished.png", initialLocation, new Size(120, 60), 1, 1, 5);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void action() {
		healing();
	}

	@Override
	public void setLives() {
		int lives = 5;
	}
	
	public void healing() {
		
	}

}

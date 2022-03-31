package com.github.hanyaeger.tutorial;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;

public class Cow extends Animal{

	protected Cow(Coordinate2D initialLocation) {
		super("sprites/cow_finished.png", initialLocation, new Size(120, 60), 1, 1);
		
		setLives(5);
	}

	@Override
	public void action() {
		healing();
	}
	
	public void healing() {
		
	}

}

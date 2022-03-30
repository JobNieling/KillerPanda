package com.github.hanyaeger.tutorial;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.tutorial.entities.Hanny;

public class Farm extends GameScreen{

	Farm(KillerPanda killerPanda) {
		super(killerPanda);
	}

	@Override
	public void setupScene() {
		setBackgroundImage("backgrounds/panda_world_xl.png");
	}

	@Override
	public void setupEntities() {
		
		var Sebastian = new Panda(new Coordinate2D(0, 0), healthText, waterworld, bubblesPoppedText);
		addEntity(Sebastian);
		
	}

}

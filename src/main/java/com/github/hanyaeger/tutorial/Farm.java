package com.github.hanyaeger.tutorial;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;

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
		
		var healthText = new HealthText(new Coordinate2D((getWidth() / 3), 0));
		healthText.setAnchorPoint(AnchorPoint.TOP_CENTER);
		addEntity(healthText);
		
		var Sebastian = new Panda(new Coordinate2D(0, 0), healthText, killerPanda);
		addEntity(Sebastian);
		
	}

}

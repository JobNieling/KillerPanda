package com.github.hanyaeger.tutorial;

import java.util.Random;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.EntitySpawnerContainer;

public class Farm extends GameScreen implements EntitySpawnerContainer{

	Farm(KillerPanda killerPanda) {
		super(killerPanda);
	}

	@Override
	public void setupScene() {
		setBackgroundImage("backgrounds/panda_world_xl.png");
	}

	@Override
	public void setupEntities() {
		
		/*
		var cow = new Cow(new Coordinate2D(new Random().nextInt((int) getWidth() - 81), new Random().nextInt((int) getHeight()- 81)));
		addEntity(cow);
		
		var bird = new Bird(new Coordinate2D(new Random().nextInt((int) getWidth() - 81), new Random().nextInt((int) getHeight()- 81)));
		addEntity(bird);
		
		var turtle = new Turtle(new Coordinate2D(new Random().nextInt((int) getWidth() - 81), new Random().nextInt((int) getHeight()- 81)));
		addEntity(turtle);
		*/
		
		var baby = new Baby(new Coordinate2D(new Random().nextInt((int) getWidth() - 81), new Random().nextInt((int) getHeight()- 81)));
		addEntity(baby);
		
		var farmer = new Farmer(new Coordinate2D(new Random().nextInt((int) getWidth() - 81), new Random().nextInt((int) getHeight()- 81)));
		addEntity(farmer);
		
		var knife = new Knife(new Coordinate2D(new Random().nextInt((int) getWidth() - 81), new Random().nextInt((int) getHeight()- 81)));
		addEntity(knife);
		
		 var healthText = new HealthText(new Coordinate2D(0, 0));
		healthText.setAnchorPoint(AnchorPoint.TOP_LEFT);
		addEntity(healthText);
		
		var Sebastian = new Panda(new Coordinate2D(0, 0), healthText, killerPanda);
		addEntity(Sebastian);
		
	}

	@Override
	public void setupEntitySpawners() {
		addEntitySpawner(new AnimalSpawner(getWidth(), getHeight()));
	}

}

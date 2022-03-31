package com.github.hanyaeger.tutorial;

import java.util.Random;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.EntitySpawner;

public class AnimalSpawner extends EntitySpawner{
	
	private final double sceneWidth;
    private final double sceneHeight;

    public AnimalSpawner(double sceneWidth, double sceneHeight) {
        super(7000);
        this.sceneWidth = sceneWidth;
        this.sceneHeight = sceneHeight;
    }

    @Override
    protected void spawnEntities() {
    	if(new Random().nextInt(10) < 3){
            spawn(new Cow(randomLocation()));
            
        } else if(new Random().nextInt(10) > 6) {
            spawn(new Bird(randomLocation()));
            
        } else {
        	spawn(new Turtle(randomLocation()));
        	
        }
    }

    private Coordinate2D randomLocation() {
        double x = new Random().nextInt((int) sceneWidth - 200);
        double y = new Random().nextInt((int) sceneHeight - 100);
        return new Coordinate2D(x, y);
    }
}

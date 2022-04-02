package com.github.hanyaeger.tutorial;

import java.util.Set;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.userinput.KeyListener;

import javafx.scene.input.KeyCode;

public class Farmer extends Enemy implements KeyListener{

	protected Farmer(Coordinate2D initialLocation) {
		super(initialLocation);
	}

	@Override
	public void action() {
		damage();
	}
	
	public void damage() {
		
	}

	@Override
	public void onPressedKeysChange(Set<KeyCode> pressedKeys) {
		if(pressedKeys.contains(KeyCode.A)){
	        setMotion(2,270d);
	    } else if(pressedKeys.contains(KeyCode.D)){
	        setMotion(2,90d);
	    } else if(pressedKeys.contains(KeyCode.W)){
	        setMotion(2,180d);
	    } else if(pressedKeys.contains(KeyCode.S)){
	        setMotion(2,0d);
	    } 
	}

	@Override
	protected void setupEntities() {
		var farmerSprite = new FarmerSprite(new Coordinate2D(0, 0));
		addEntity(farmerSprite);
		
		var hitBox = new FarmerHitBox(new Coordinate2D(0, 30));
		addEntity(hitBox);
		
		var hitBox2 = new FarmerHitBox(new Coordinate2D(52, 20));
		addEntity(hitBox2);
	}

}

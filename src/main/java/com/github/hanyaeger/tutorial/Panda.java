package com.github.hanyaeger.tutorial;

import java.util.Set;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.scenes.SceneBorder;
import com.github.hanyaeger.api.userinput.KeyListener;

import javafx.scene.input.KeyCode;

public class Panda extends Character implements KeyListener, Collider, Collided{
	
	KillerPanda killerPanda;
	
	private HealthText healthText;
	private int health = 9;

	public Panda(Coordinate2D initialLocation, HealthText healthText, KillerPanda killerPanda) {
		super("sprites/hanny.png", initialLocation, new Size(20, 40), 1, 2);
		
		this.healthText = healthText;
	    healthText.setHealthText(health);
	    
	    this.killerPanda = killerPanda;
	}

	@Override
	public void notifyBoundaryTouching(SceneBorder border) {
		setSpeed(0);

	    switch(border){
	        case TOP:
	            setAnchorLocationY(1);
	            break;
	        case BOTTOM:
	            setAnchorLocationY(getSceneHeight() - getHeight() - 1);
	            break;
	        case LEFT:
	            setAnchorLocationX(1);
	            break;
	        case RIGHT:
	            setAnchorLocationX(getSceneWidth() - getWidth() - 1);
	        default:
	            break;
	        }
	}

	@Override
	public void onCollision(Collider collidingObject) {
		healthText.setHealthText(health);
		if (health == 0) {
			killerPanda.setActiveScene(2);
		}
		
	}

	@Override
	public void onPressedKeysChange(Set<KeyCode> pressedKeys) {
		if(pressedKeys.contains(KeyCode.LEFT)){
	        setMotion(3,270d);
	        setCurrentFrameIndex(0);
	    } else if(pressedKeys.contains(KeyCode.RIGHT)){
	        setMotion(3,90d);
	        setCurrentFrameIndex(1);
	    } else if(pressedKeys.contains(KeyCode.UP)){
	        setMotion(3,180d);
	    } else if(pressedKeys.contains(KeyCode.DOWN)){
	        setMotion(3,0d);
	    } 
		
	}

}

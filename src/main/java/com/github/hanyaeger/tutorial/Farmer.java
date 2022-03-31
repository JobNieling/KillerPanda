package com.github.hanyaeger.tutorial;

import java.util.Set;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.userinput.KeyListener;

import javafx.scene.input.KeyCode;

public class Farmer extends Enemy implements KeyListener{

	protected Farmer(Coordinate2D initialLocation) {
		super("sprites/farmer.png", initialLocation, new Size(60, 120), 1, 1);
		// TODO Auto-generated constructor stub
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
	        setMotion(3,270d);
	        setCurrentFrameIndex(0);
	    } else if(pressedKeys.contains(KeyCode.D)){
	        setMotion(3,90d);
	        setCurrentFrameIndex(0);
	    } else if(pressedKeys.contains(KeyCode.W)){
	        setMotion(3,180d);
	        setCurrentFrameIndex(1);
	    } else if(pressedKeys.contains(KeyCode.S)){
	        setMotion(3,0d);
	        setCurrentFrameIndex(2);
	    } 
	}

}

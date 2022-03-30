package com.github.hanyaeger.tutorial;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;

public class Bird extends Animal{

	protected Bird(String resource, Coordinate2D initialLocation, Size size, int rows, int columns) {
		super(resource, initialLocation, size, rows, columns);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void action() {
		teleport();
	}

	@Override
	public void setLives() {
		// TODO Auto-generated method stub
		
	}
	
	public void teleport() {
		
	}

}

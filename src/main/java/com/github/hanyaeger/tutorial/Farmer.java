package com.github.hanyaeger.tutorial;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;

public class Farmer extends Enemy{

	protected Farmer(Coordinate2D initialLocation) {
		super("", initialLocation, new Size(100, 50), 1, 1);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void action() {
		damage();
	}
	
	public void damage() {
		
	}

}

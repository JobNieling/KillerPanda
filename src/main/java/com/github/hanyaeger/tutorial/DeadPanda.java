package com.github.hanyaeger.tutorial;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;

public class DeadPanda extends SpriteEntity{

	protected DeadPanda(Coordinate2D initialLocation) {
		super("sprites/deadPanda.png", initialLocation, new Size(300, 600));
		// TODO Auto-generated constructor stub
	}

}

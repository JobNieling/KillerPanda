package com.github.hanyaeger.tutorial;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;

public class FarmerSprite extends SpriteEntity{

	protected FarmerSprite(Coordinate2D location) {
		super("sprites/farmer.png", location, new Size(60, 120), 1, 1);
	}

}

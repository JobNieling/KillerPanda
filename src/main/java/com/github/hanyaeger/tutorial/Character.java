package com.github.hanyaeger.tutorial;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.SceneBorderTouchingWatcher;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.scenes.SceneBorder;

public abstract class Character extends DynamicSpriteEntity implements SceneBorderTouchingWatcher{

	protected Character(String resource, Coordinate2D initialLocation) {
		super(resource, initialLocation);
	}

	@Override
	public abstract void notifyBoundaryTouching(SceneBorder border) ;

}

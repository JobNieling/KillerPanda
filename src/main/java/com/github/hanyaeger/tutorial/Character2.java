package com.github.hanyaeger.tutorial;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.SceneBorderTouchingWatcher;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.scenes.SceneBorder;

public abstract class Character2 extends DynamicSpriteEntity implements SceneBorderTouchingWatcher{

	protected Character2(String resource, Coordinate2D initialLocation, Size size, int rows, int columns) {
		super(resource, initialLocation, size, rows, columns);
	}

	@Override
	public abstract void notifyBoundaryTouching(SceneBorder border) ;

}

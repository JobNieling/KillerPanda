package com.github.hanyaeger.tutorial;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.RectangleEntity;

import javafx.scene.paint.Color;

public class PandaHitBox extends RectangleEntity implements Collider {

    public PandaHitBox(final Coordinate2D initialPosition) {
        super(initialPosition);
        setWidth(60);
        setHeight(2);
        setFill(Color.TRANSPARENT);
    }
}

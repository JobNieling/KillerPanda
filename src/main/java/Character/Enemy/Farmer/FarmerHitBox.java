package Character.Enemy.Farmer;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.RectangleEntity;

import javafx.scene.paint.Color;

public class FarmerHitBox extends RectangleEntity implements Collider {

    public FarmerHitBox(final Coordinate2D initialPosition) {
        super(initialPosition);
        setWidth(5);
        setHeight(35);
        setFill(Color.TRANSPARENT);
    }
}
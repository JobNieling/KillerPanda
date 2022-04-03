package Character.Animal.Cow;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.RectangleEntity;

import javafx.scene.paint.Color;

public class CowHitBox extends RectangleEntity implements Collider{

	public CowHitBox(final Coordinate2D initialPosition) {
		super(initialPosition);
		setWidth(60);
        setHeight(60);
        setFill(Color.RED);
	}

}

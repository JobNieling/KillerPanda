package Character.Animal;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;

public abstract class AnimalSprite extends SpriteEntity{

	protected AnimalSprite(String resource, Coordinate2D location, Size size, int rows, int columns) {
		super(resource, location, size, rows, columns);
	}



}

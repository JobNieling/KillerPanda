package Character.Animal.Cow;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;

public class CowSprite extends SpriteEntity{

	/**
	 * Set the location, size and picture of the cow
	 * @param initialLocation The location of the cow
	 */
	public CowSprite(Coordinate2D initialLocation) {
		super("sprites/cow_finished.png", initialLocation, new Size(120, 60), 1, 1);
	}

}

package Character.Enemy.Baby;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;

public class BabySprite extends SpriteEntity{

	/**
	 * Set the location, size and picture of the baby
	 * @param location the location of the baby
	 */
	protected BabySprite(Coordinate2D location) {
		super("sprites/baby.png", location, new Size(35, 70), 1, 1);
	}

}

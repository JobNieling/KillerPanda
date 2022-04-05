package Character.Enemy.Farmer;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;

public class FarmerSprite extends SpriteEntity{

	/**
	 * Set the initial location, size and picture of the farmer
	 * @param location the initial location of the farmer
	 */
	protected FarmerSprite(Coordinate2D location) {
		super("sprites/farmer.png", location, new Size(60, 120), 1, 1);
	}

}

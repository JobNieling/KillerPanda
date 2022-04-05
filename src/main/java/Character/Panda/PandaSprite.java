package Character.Panda;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;

public class PandaSprite extends SpriteEntity{

	/**
	 * Set the initial location, size and picture of the panda
	 * @param location the initial location of the panda
	 */
	public PandaSprite(Coordinate2D location) {
		super("sprites/walkingPanda.png", location, new Size(40, 80), 1, 3);
	}

}

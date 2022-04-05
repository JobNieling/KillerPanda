package Character.Panda;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;

public abstract class Weapon extends SpriteEntity{

	/**
	 * Set the initial location, picture and size of the weapon
	 * @param resource The picture
	 * @param location The initial location
	 * @param size The size of the weapon
	 * @param rows How many rows exist in the picture
	 * @param columns How many columns exist in the picture
	 */
	protected Weapon(String resource, Coordinate2D location, Size size, int rows, int columns) {
		super(resource, location, size, rows, columns);
	}
}

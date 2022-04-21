package Character.Enemy;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.SceneBorder;

import Character.Character;

public abstract class Enemy extends Character{

	/**
	 * Set the initial location of the enemy
	 * @param initialLocation The initial location
	 */
	public Enemy(Coordinate2D initialLocation) {
		super(initialLocation);
	}
}

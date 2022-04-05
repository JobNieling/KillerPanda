package Character.Panda;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;

public class DeadPanda extends SpriteEntity{

	/**
	 * Set the location of the dead panda
	 * @param initialLocation The location of the dead panda
	 */
	public DeadPanda(Coordinate2D initialLocation) {
		super("sprites/deadPanda.png", initialLocation, new Size(300, 600));
	}

}

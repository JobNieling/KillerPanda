package Character.Panda;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;

public class Knife extends Weapon{

	/**
	 * Set the initial location of the knife that the panda will be holding
	 * @param location The initial location of the knife
	 */
	protected Knife(Coordinate2D location) {
		super("sprites/bloodyKnife.png", location, new Size(40, 80), 1, 1);
	}

}

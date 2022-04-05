package Character.Animal.Turtle;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;

public class TurtleSprite extends SpriteEntity{

	/**
	 * Set the location, size and picture of the turtle
	 * @param location The location of the turtle
	 */
	protected TurtleSprite(Coordinate2D location) {
		super("sprites/hidingTurtle2.png", location, new Size(75, 35), 1, 2);
	}

}

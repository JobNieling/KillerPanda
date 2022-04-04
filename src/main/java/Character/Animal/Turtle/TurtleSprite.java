package Character.Animal.Turtle;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;

public class TurtleSprite extends SpriteEntity{

	protected TurtleSprite(Coordinate2D location) {
		super("sprites/hidingTurtle2.png", location, new Size(75, 35), 1, 2);
		// TODO Auto-generated constructor stub
	}

}

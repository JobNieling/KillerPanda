package Character.Animal.Turtle;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;

import Character.Animal.AnimalSprite;

public class TurtleSprite extends AnimalSprite{

	protected TurtleSprite(Coordinate2D location) {
		super("sprites/turtle.png", location, new Size(75, 35), 1, 1);
		// TODO Auto-generated constructor stub
	}

}

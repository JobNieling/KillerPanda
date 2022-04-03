package Character.Animal.Bird;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;

public class BirdSprite extends SpriteEntity{

	protected BirdSprite(Coordinate2D location) {
		super("sprites/bird.png", location, new Size(60, 30), 1, 1);
	}

}

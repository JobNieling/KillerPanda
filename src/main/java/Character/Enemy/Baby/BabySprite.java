package Character.Enemy.Baby;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;

public class BabySprite extends SpriteEntity{

	protected BabySprite(Coordinate2D location) {
		super("sprites/baby.png", location, new Size(35, 70), 1, 1);
	}

}

package Character.Enemy.Baby;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collider;

import Character.Enemy.Enemy;

public class Baby extends Enemy implements Collider{

	public Baby(Coordinate2D initialLocation) {
		super(initialLocation);
	}

	@Override
	protected void setupEntities() {
		var babySprite = new BabySprite(new Coordinate2D(0, 0));
		addEntity(babySprite);
	}

}

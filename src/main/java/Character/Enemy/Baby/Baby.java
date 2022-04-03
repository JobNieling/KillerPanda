package Character.Enemy.Baby;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;

import Character.Enemy.Enemy;
import Character.Panda.PandaSprite;

public class Baby extends Enemy{

	protected Baby(Coordinate2D initialLocation) {
		super(initialLocation);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void action() {
		distraction();
	}
	
	public void distraction() {
		
	}

	@Override
	protected void setupEntities() {
		var babySprite = new BabySprite(new Coordinate2D(0, 0));
		addEntity(babySprite);
	}

}

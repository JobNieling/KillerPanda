package Character.Animal.Cow;

import com.github.hanyaeger.api.Coordinate2D;

import Character.Animal.Animal;

public class Cow extends Animal{

	public Cow(Coordinate2D initialLocation) {
		super(initialLocation);
		
		setLives(5);
	}

	@Override
	public void action() {
		healing();
	}
	
	public void healing() {
		
	}

	@Override
	protected void setupEntities() {
		var cowSprite = new CowSprite(new Coordinate2D(0, 0));
		addEntity(cowSprite);
		
		var cowHitBox = new CowHitBox(new Coordinate2D(0, 0));
		addEntity(cowHitBox);
	}

}

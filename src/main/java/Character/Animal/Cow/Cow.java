package Character.Animal.Cow;

import com.github.hanyaeger.api.Coordinate2D;

import Character.Animal.Animal;

public class Cow extends Animal{
	
	private int lives = 5;

	public Cow(Coordinate2D initialLocation) {
		super(initialLocation);
		
		setLives(lives);
	}

	@Override
	public void action() {
		healing();
	}
	
	private void healing() {
		if (getLives() < 5) {
			setLives(getLives() + 1);
		}
	}

	@Override
	protected void setupEntities() {
		var cowSprite = new CowSprite(new Coordinate2D(0, 0));
		addEntity(cowSprite);
	}

}

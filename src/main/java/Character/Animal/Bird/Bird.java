package Character.Animal.Bird;

import com.github.hanyaeger.api.Coordinate2D;

import Character.Animal.Animal;

public class Bird extends Animal{

	public Bird(Coordinate2D initialLocation) {
		super(initialLocation);
		
		setLives(1);
	}

	@Override
	public void action() {
		teleport();
	}
	
	public void teleport() {
		
	}

	@Override
	protected void setupEntities() {
		var birdSprite = new BirdSprite(new Coordinate2D(0, 0));
		addEntity(birdSprite);
	}

}

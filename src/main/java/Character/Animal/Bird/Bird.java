package Character.Animal.Bird;

import java.util.Random;

import com.github.hanyaeger.api.Coordinate2D;

import Character.Animal.Animal;

public class Bird extends Animal{
	
	private int lives = 1;

	public Bird(Coordinate2D initialLocation) {
		super(initialLocation);
		
		setLives(lives);
	}

	@Override
	public void action() {
		teleport();
	}
	
	private void teleport() {
		setAnchorLocation(
		        new Coordinate2D(new Random().nextInt((int)(getSceneWidth() - getWidth())),
		        new Random().nextInt((int)(getSceneHeight() - getHeight()))));
	}

	@Override
	protected void setupEntities() {
		var birdSprite = new BirdSprite(new Coordinate2D(0, 0));
		addEntity(birdSprite);
	}

}

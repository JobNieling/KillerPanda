package Character.Animal.Turtle;

import com.github.hanyaeger.api.Coordinate2D;

import Character.Animal.Animal;

public class Turtle extends Animal{
	
	private int lives = 2;
	
	public Turtle(Coordinate2D initialLocation) {
		super(initialLocation);
		
		setLives(lives);
	}

	@Override
	public void action() {
		hide();
	}

	
	public void hide() {
		
	}

	@Override
	protected void setupEntities() {
		var turtleSprite = new TurtleSprite(new Coordinate2D(0, 0));
		addEntity(turtleSprite);
	}

}

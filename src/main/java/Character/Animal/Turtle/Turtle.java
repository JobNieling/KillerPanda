package Character.Animal.Turtle;

import com.github.hanyaeger.api.Coordinate2D;

import Character.Animal.Animal;

public class Turtle extends Animal{
	
	private int lives = 2;
	
	private TurtleSprite turtleSprite;
	
	public Turtle(Coordinate2D initialLocation) {
		super(initialLocation);
		
		setLives(lives);
	}

	@Override
	public void action() {
		if(turtleSprite.getCurrentFrameIndex() == 0) {
		hide();
		} else {
			turtleSprite.setCurrentFrameIndex(0);
			setLives(lives);
		}
	}

	
	private void hide() {
		turtleSprite.setCurrentFrameIndex(1);
		setLives(100);
	}

	@Override
	protected void setupEntities() {
		var turtleSprite = new TurtleSprite(new Coordinate2D(0, 0));
		this.turtleSprite = turtleSprite;
		addEntity(turtleSprite);
		turtleSprite.setCurrentFrameIndex(0);
	}

}

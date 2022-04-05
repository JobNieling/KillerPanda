package Character.Animal.Turtle;

import com.github.hanyaeger.api.Coordinate2D;

import Character.Animal.Animal;

public class Turtle extends Animal{
	
	private int lives = 2;
	
	private TurtleSprite turtleSprite;
	
	/**
	 * Set the initial location of the turtle and the lives
	 * @param initialLocation The initial location of the turtle
	 */
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

	/**
	 * Use this method to make sure the turtle is able to hide as its action
	 */
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

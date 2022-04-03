package Character.Animal.Turtle;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;

import Character.Animal.Animal;
import Character.Panda.PandaSprite;

public class Turtle extends Animal{
	
	public Turtle(Coordinate2D initialLocation) {
		super(initialLocation);
		
		setLives(2);
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

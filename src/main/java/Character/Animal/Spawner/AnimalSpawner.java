package Character.Animal.Spawner;

import java.util.Random;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.EntitySpawner;

import Character.Animal.Bird.Bird;
import Character.Animal.Cow.Cow;
import Character.Animal.Turtle.Turtle;

public class AnimalSpawner extends EntitySpawner{
	
	private final double sceneWidth;
    private final double sceneHeight;

    /**
     * Set the width and height of the screen
     * @param sceneWidth The width of the screen
     * @param sceneHeight The height of the screen
     */
    public AnimalSpawner(double sceneWidth, double sceneHeight) {
        super(7000);
        this.sceneWidth = sceneWidth;
        this.sceneHeight = sceneHeight;
    }

    @Override
    protected void spawnEntities() {
    	if(new Random().nextInt(10) < 3){
            spawn(new Cow(randomLocation()));
            
        } else if(new Random().nextInt(10) > 6) {
            spawn(new Bird(randomLocation()));
            
        } else {
        	spawn(new Turtle(randomLocation()));
        	
        }
    }

    /**
     * Return a random location somewhere on the screen
     * @return The random location
     */
    private Coordinate2D randomLocation() {
        double x = new Random().nextInt((int) sceneWidth - 200);
        double y = new Random().nextInt((int) sceneHeight - 100);
        return new Coordinate2D(x, y);
    }
}

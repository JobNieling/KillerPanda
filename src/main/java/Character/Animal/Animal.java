package Character.Animal;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.UpdateExposer;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.media.SoundClip;
import com.github.hanyaeger.api.scenes.SceneBorder;

import Character.Character;
import Character.Panda.Panda;

public abstract class Animal extends Character implements Collided, Collider, UpdateExposer{ 

	public int lives;
	public long startTime = System.currentTimeMillis();
	public long actionStartTime = System.currentTimeMillis();
	
	/**
	 * Set the initial location of the Animal
	 * @param initialLocation The initial location
	 */
	public Animal(Coordinate2D initialLocation) {
		super(initialLocation);
	}

	@Override
	public void onCollision(Collider collidingObject) {
		if(collidingObject instanceof Panda && (System.currentTimeMillis() - startTime) > 1000) {
				lives--;
				startTime = System.currentTimeMillis();
			}
		if(lives == 0) {
			var stabSound = new SoundClip("audio/stab.mp3");
			stabSound.play();
			
			remove();
		}
	}
	
	/**
	 * Set the lives of the animal
	 * @param health The amount of lives
	 */
	public void setLives(int health) {
		this.lives = health;
	}
	
	/**
	 * Return the amount of lives 
	 * @return The amount of lives
	 */
	public int getLives() {
		return lives;
	}
	
	@Override
	public void explicitUpdate(long timestamp) {
		if((System.currentTimeMillis() - actionStartTime) > 10000) {
			action();
			actionStartTime = System.currentTimeMillis();
		}
	}
	
	/**
	 * Set the action the animal can do
	 */
	public abstract void action() ;

}

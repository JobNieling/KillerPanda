package Character.Animal;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.media.SoundClip;
import com.github.hanyaeger.api.scenes.SceneBorder;

import Character.Character;
import Character.Panda.Knife;
import Character.Panda.Panda;
import Character.Panda.PandaHitBox;

public abstract class Animal extends Character implements Collided, Collider{ 

	public int lives;
	public long startTime = System.currentTimeMillis();
	
	public Animal(Coordinate2D initialLocation) {
		super(initialLocation);
	}

	@Override
	public void onCollision(Collider collidingObject) {
		if(collidingObject instanceof Panda && (System.currentTimeMillis() - startTime) > 1000) {
				lives--;
				startTime = System.currentTimeMillis();
				System.out.println(getLives());
			}
		if(lives == 0) {
			var stabSound = new SoundClip("audio/stab.mp3");
			stabSound.play();
			
			remove();
		}
	}

	@Override
	public void notifyBoundaryTouching(SceneBorder border) {
		setSpeed(0);

	    switch(border){
	        case TOP:
	            setAnchorLocationY(1);
	            break;
	        case BOTTOM:
	            setAnchorLocationY(getSceneHeight() - getHeight() - 1);
	            break;
	        case LEFT:
	            setAnchorLocationX(1);
	            break;
	        case RIGHT:
	            setAnchorLocationX(getSceneWidth() - getWidth() - 1);
	        default:
	            break;
	        }
	}
	
	public void setLives(int health) {
		this.lives = health;
	}
	
	public int getLives() {
		return lives;
	}
	
	public abstract void action() ;

}

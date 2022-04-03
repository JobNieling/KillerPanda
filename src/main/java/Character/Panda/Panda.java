package Character.Panda;

import java.util.Random;
import java.util.Set;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.scenes.SceneBorder;
import com.github.hanyaeger.api.userinput.KeyListener;
import com.github.hanyaeger.tutorial.HealthText;
import com.github.hanyaeger.tutorial.KillerPanda;
import com.github.hanyaeger.tutorial.PointsText;

import Character.Character;
import Character.Animal.Animal;
import Character.Animal.Cow.Cow;
import Character.Enemy.Farmer.FarmerHitBox;
import javafx.scene.input.KeyCode;

public class Panda extends Character implements KeyListener, Collided{
	
	KillerPanda killerPanda;
	
	private HealthText healthText;
	private int health = 9;
	
	private PointsText pointsText;
	private int points = 0;
	
	public long startTime = System.currentTimeMillis();

	public Panda(Coordinate2D initialLocation, HealthText healthText, KillerPanda killerPanda, PointsText pointsText) {
		super(initialLocation);
		
		this.healthText = healthText;
	    healthText.setHealthText(health);
	    
	    this.pointsText = pointsText;
	    pointsText.setText(points);
	    
	    this.killerPanda = killerPanda;
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

	@Override
	public void onCollision(Collider collidingObject) {
		if (collidingObject instanceof Animal && (System.currentTimeMillis() - startTime) > 1000){
	        points++;
	        startTime = System.currentTimeMillis();
	        System.out.println(points);
		}
		if (collidingObject instanceof FarmerHitBox) {
			health--;
			setAnchorLocation(
			        new Coordinate2D(new Random().nextInt((int)(getSceneWidth() - getWidth())),
			        new Random().nextInt((int)(getSceneHeight() - getHeight()))));
		}
		if (health == 0) {
			killerPanda.setActiveScene(2);
		}
		healthText.setHealthText(health);
		pointsText.setText(points);
		
	}

	@Override
	public void onPressedKeysChange(Set<KeyCode> pressedKeys) {
		if(pressedKeys.contains(KeyCode.LEFT)){
	        setMotion(3,270d);
	        //setCurrentFrameIndex(0);
	    } else if(pressedKeys.contains(KeyCode.RIGHT)){
	        setMotion(3,90d);
	        //setCurrentFrameIndex(0);
	    } else if(pressedKeys.contains(KeyCode.UP)){
	        setMotion(3,180d);
	        //setCurrentFrameIndex(1);
	    } else if(pressedKeys.contains(KeyCode.DOWN)){
	        setMotion(3,0d);
	        //setCurrentFrameIndex(2);
	    } 
		
	}

	@Override
	protected void setupEntities() {
		var pandaSprite = new PandaSprite(new Coordinate2D(0, 0));
		addEntity(pandaSprite);
		
		var knife = new Knife(new Coordinate2D(25, 15));
		addEntity(knife);
		
		var hitBox = new PandaHitBox(new Coordinate2D(0, 30));
		addEntity(hitBox);
	}

}

package Character.Panda;

import java.util.Random;
import java.util.Set;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.UpdateExposer;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.scenes.SceneBorder;
import com.github.hanyaeger.api.userinput.KeyListener;
import com.github.hanyaeger.tutorial.KillerPanda;

import Character.Character;
import Character.Animal.Animal;
import Character.Enemy.Baby.Baby;
import Character.Enemy.Farmer.FarmerHitBox;
import Text.HealthText;
import Text.PointsText;
import javafx.scene.input.KeyCode;

public class Panda extends Character implements KeyListener, Collided, Collider, UpdateExposer{
	
	KillerPanda killerPanda;
	
	private HealthText healthText;
	private int health = 9;
	
	private PointsText pointsText;
	private int points = 0;
	
	public long startTime = System.currentTimeMillis();
	public long babyStartTime = 0;
	
	private PandaSprite pandaSprite;
	
	private boolean stunned = false;

	/**
	 * Set the initial location, the text for the health and the text for the points of the panda
	 * @param initialLocation The initial location of the panda
	 * @param healthText The text for the health of the panda
	 * @param killerPanda The main class
	 * @param pointsText The text for the health of the panda
	 */
	public Panda(Coordinate2D initialLocation, HealthText healthText, KillerPanda killerPanda, PointsText pointsText) {
		super(initialLocation);
		
		this.healthText = healthText;
	    healthText.setHealthText(health);
	    
	    this.pointsText = pointsText;
	    pointsText.setText(points);
	    
	    this.killerPanda = killerPanda;
	}

	@Override
	public void onCollision(Collider collidingObject) {
		if (collidingObject instanceof Animal && (System.currentTimeMillis() - startTime) > 1000){
	        points++;
	        startTime = System.currentTimeMillis();
		}
		if (collidingObject instanceof FarmerHitBox) {
			health--;
			setAnchorLocation(
			        new Coordinate2D(new Random().nextInt((int)(getSceneWidth() - getWidth())),
			        new Random().nextInt((int)(getSceneHeight() - getHeight()))));
		}
		if (collidingObject instanceof Baby && (System.currentTimeMillis() - babyStartTime) > 10000){
			setMotion(0, 0d);
	        stunned = true;
	        babyStartTime = System.currentTimeMillis();
		}
		if (health == 0) {
			killerPanda.setActiveScene(2);
		}
		healthText.setHealthText(health);
		pointsText.setText(points);
		
	}

	@Override
	public void onPressedKeysChange(Set<KeyCode> pressedKeys) {
		if (stunned != true){
		if(pressedKeys.contains(KeyCode.LEFT)){
	        setMotion(3,270d);
	        pandaSprite.setCurrentFrameIndex(0);
	    } else if(pressedKeys.contains(KeyCode.RIGHT)){
	        setMotion(3,90d);
	        pandaSprite.setCurrentFrameIndex(0);
	    } else if(pressedKeys.contains(KeyCode.UP)){
	        setMotion(3,180d);
	        pandaSprite.setCurrentFrameIndex(1);
	    } else if(pressedKeys.contains(KeyCode.DOWN)){
	        setMotion(3,0d);
	        pandaSprite.setCurrentFrameIndex(2);
	    } 
		}
		
	}

	@Override
	protected void setupEntities() {
		
		var pandaSprite = new PandaSprite(new Coordinate2D(0, 0));
		this.pandaSprite = pandaSprite;
		addEntity(pandaSprite);
		
		var knife = new Knife(new Coordinate2D(25, 15));
		addEntity(knife);

	}

	@Override
	public void explicitUpdate(long timestamp) {
		if((System.currentTimeMillis() - babyStartTime) > 4000) {
			stunned = false;
		}
	}

}

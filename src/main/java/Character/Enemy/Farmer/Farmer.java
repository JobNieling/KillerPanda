package Character.Enemy.Farmer;

import java.util.Random;
import java.util.Set;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.UpdateExposer;
import com.github.hanyaeger.api.userinput.KeyListener;

import Character.Enemy.Enemy;
import Character.Panda.Panda;
import javafx.scene.input.KeyCode;

public class Farmer extends Enemy implements KeyListener, UpdateExposer{

	public long startTime = 0;
	
	private Panda panda;
	
	public Farmer(Coordinate2D initialLocation, Panda panda) {
		super(initialLocation);
		
		this.panda = panda;
		//setMotion(2, 270d);
		//move();
	}

	@Override
	public void action() {
		damage();
	}
	
	public void damage() {
		
	}

	@Override
	public void onPressedKeysChange(Set<KeyCode> pressedKeys) {
		if(pressedKeys.contains(KeyCode.A)){
	        setMotion(2,270d);
	    } else if(pressedKeys.contains(KeyCode.D)){
	        setMotion(2,90d);
	    } else if(pressedKeys.contains(KeyCode.W)){
	        setMotion(2,180d);
	    } else if(pressedKeys.contains(KeyCode.S)){
	        setMotion(2,0d);
	    } 
	}

	@Override
	protected void setupEntities() {
		var farmerSprite = new FarmerSprite(new Coordinate2D(0, 0));
		addEntity(farmerSprite);
		
		var hitBox = new FarmerHitBox(new Coordinate2D(0, 30));
		addEntity(hitBox);
		
		var hitBox2 = new FarmerHitBox(new Coordinate2D(52, 20));
		addEntity(hitBox2);
	}
	
	public void move() {
		if((System.currentTimeMillis() - startTime) > 1000) {
		if(new Random().nextInt(20) < 5){
	        setMotion(2,270d);
	    } else if(new Random().nextInt(20) > 4 && new Random().nextInt(20) <= 10){
	        setMotion(2,90d);
	    } else if(new Random().nextInt(20) > 10 && new Random().nextInt(20) <= 15){
	        setMotion(2,180d);
	    } else if(new Random().nextInt(20) > 15){
	        setMotion(2,0d);
	    } 
		startTime = System.currentTimeMillis();
		}		
	}

	@Override
	public void explicitUpdate(long timestamp) {
		move();
	}

}

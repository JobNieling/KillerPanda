package Screen;

import java.util.Random;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.EntitySpawnerContainer;
import com.github.hanyaeger.tutorial.KillerPanda;

import Character.Animal.Spawner.AnimalSpawner;
import Character.Enemy.Baby.Baby;
import Character.Enemy.Farmer.MultiplayerFarmer;
import Character.Panda.Panda;
import Text.HealthText;
import Text.PointsText;

public class MultiplayerFarm extends GameScreen implements EntitySpawnerContainer{
	
	public MultiplayerFarm(KillerPanda killerPanda) {
		super(killerPanda);
	}

	@Override
	public void setupScene() {
		setBackgroundAudio("audio/Kim7.m4a");
		setBackgroundImage("backgrounds/panda_world_xl.png");
	}

	@Override
	public void setupEntities() {
		
		var multiplayerFarmer = new MultiplayerFarmer(new Coordinate2D(new Random().nextInt((int) getWidth() - 81), new Random().nextInt((int) getHeight()- 81)));
		addEntity(multiplayerFarmer);
		
		var baby = new Baby(new Coordinate2D(new Random().nextInt((int) getWidth() - 81), new Random().nextInt((int) getHeight()- 81)));
		addEntity(baby);
		
		var healthText = new HealthText(new Coordinate2D(0, 0));
		healthText.setAnchorPoint(AnchorPoint.TOP_LEFT);
		addEntity(healthText);
		
		var pointsText = new PointsText(new Coordinate2D(getWidth() / 2, 0));
		pointsText.setAnchorPoint(AnchorPoint.TOP_RIGHT);
		addEntity(pointsText);
		
		var Sebastian = new Panda(new Coordinate2D(0, 0), healthText, killerPanda, pointsText);
		addEntity(Sebastian);
		
	}

	@Override
	public void setupEntitySpawners() {
		addEntitySpawner(new AnimalSpawner(getWidth(), getHeight()));
	}

}

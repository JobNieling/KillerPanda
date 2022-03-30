package com.github.hanyaeger.tutorial;

import com.github.hanyaeger.api.scenes.DynamicScene;

public abstract class GameScreen extends DynamicScene{
	
	KillerPanda killerPanda;
	
	GameScreen(KillerPanda killerPanda) {
		this.killerPanda = killerPanda;
	}

	@Override
	public abstract void setupScene() ;

	@Override
	public abstract void setupEntities();

}

package com.github.hanyaeger.tutorial;

import com.github.hanyaeger.api.scenes.DynamicScene;

public abstract class GameScreen extends DynamicScene{
	
	KillerPanda killerPanda;
	
	/**
	 * Set the main class in the Game Screen
	 * @param killerPanda The main class
	 */
	GameScreen(KillerPanda killerPanda) {
		this.killerPanda = killerPanda;
	}

	@Override
	public abstract void setupScene() ;

	@Override
	public abstract void setupEntities();

}

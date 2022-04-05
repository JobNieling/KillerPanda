package Screen;

import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.tutorial.KillerPanda;

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

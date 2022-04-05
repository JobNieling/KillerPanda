package Screen;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.scenes.StaticScene;
import com.github.hanyaeger.tutorial.KillerPanda;

import Button.QuitButton;
import Button.ReplayButton;
import Character.Panda.DeadPanda;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class EndScreen extends StaticScene{
	
	KillerPanda killerPanda;
	
	public EndScreen(KillerPanda killerPanda) {
		this.killerPanda = killerPanda;
	}

	@Override
	public void setupScene() {
		setBackgroundImage("backgrounds/bloodSplatter2.jpg");
	}

	@Override
	public void setupEntities() {
		var gameOverText = new TextEntity(
				new Coordinate2D((getWidth() / 3), getHeight() / 8),
				"Game Over"
		);
		gameOverText.setAnchorPoint(AnchorPoint.CENTER_CENTER);
		gameOverText.setFill(Color.WHITE);
		gameOverText.setFont(Font.font("Roboto", FontWeight.SEMI_BOLD, 80));
		addEntity(gameOverText);
		
		var playAgainButton = new ReplayButton(
				new Coordinate2D((getWidth() / 3), (getHeight() / 2) + 120),
				killerPanda
		);
		playAgainButton.setAnchorPoint(AnchorPoint.TOP_CENTER);
		addEntity(playAgainButton);
		
		var QuitButton = new QuitButton(
				new Coordinate2D((getWidth() / 3), (getHeight() / 2) + 160),
				killerPanda
		);
		QuitButton.setAnchorPoint(AnchorPoint.TOP_CENTER);
		addEntity(QuitButton);
		
		var deadPanda = new DeadPanda(new Coordinate2D(getWidth() / 2, getHeight() / 3));
		addEntity(deadPanda);
	}

}

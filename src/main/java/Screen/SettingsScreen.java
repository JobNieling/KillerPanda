package Screen;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.scenes.StaticScene;

import Button.MultiplayerButton;
import Button.SingleplayerButton;
import KillerPanda.KillerPanda;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class SettingsScreen extends StaticScene{
	
	KillerPanda killerPanda;

	public SettingsScreen(KillerPanda killerPanda) {
		this.killerPanda = killerPanda;
	}
	
	@Override
	public void setupScene() {
		setBackgroundImage("backgrounds/farm.jpg");
	}

	@Override
	public void setupEntities() {
		var settingsText = new TextEntity(
				new Coordinate2D(getWidth() / 2, 0),
				"Settings"
		);
		settingsText.setAnchorPoint(AnchorPoint.TOP_CENTER);
		settingsText.setFill(Color.BLACK);
		settingsText.setFont(Font.font("Roboto", FontWeight.BOLD, 60));
		addEntity(settingsText);
		
		var playersText = new TextEntity(
				new Coordinate2D(25, getHeight() / 5),
				"Players:"
		);
		playersText.setAnchorPoint(AnchorPoint.TOP_LEFT);
		playersText.setFill(Color.BLACK);
		playersText.setFont(Font.font("Roboto", FontWeight.SEMI_BOLD, 30));
		addEntity(playersText);
		
		var singleplayerButton = new SingleplayerButton(
				new Coordinate2D((getWidth() / 5) * 2 ,getHeight() / 5),
				killerPanda
		);
		singleplayerButton.setAnchorPoint(AnchorPoint.TOP_CENTER);
		addEntity(singleplayerButton);
		
		var slashText = new TextEntity(
				new Coordinate2D((getWidth() / 5) * 3, getHeight() / 5),
				"/"
		);
		slashText.setAnchorPoint(AnchorPoint.TOP_CENTER);
		slashText.setFill(Color.BLACK);
		slashText.setFont(Font.font("Roboto", FontWeight.SEMI_BOLD, 30));
		addEntity(slashText);
		
		var multiplayerButton = new MultiplayerButton(
				new Coordinate2D((getWidth() / 5) * 4 ,getHeight() / 5),
				killerPanda
		);
		multiplayerButton.setAnchorPoint(AnchorPoint.TOP_CENTER);
		addEntity(multiplayerButton);
	}

}

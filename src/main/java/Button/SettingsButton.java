package Button;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.tutorial.KillerPanda;

import javafx.scene.Cursor;
import javafx.scene.input.MouseButton;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class SettingsButton extends Button{

	/**
	 * Set the location and text for the settings button
	 * @param initialLocation The location where the settings button is placed
	 * @param killerPanda The main class
	 */
	public SettingsButton(Coordinate2D initialLocation, KillerPanda killerPanda) {
		super(initialLocation, "Settings", killerPanda);
		setFill(Color.DARKRED);
		setFont(Font.font("Roboto", FontWeight.BOLD, 30));
	}

	@Override
	public void onMouseButtonPressed(MouseButton button, Coordinate2D coordinate2d) {
		killerPanda.setActiveScene(3);
	}

	@Override
	public void onMouseExited() {
		setFill(Color.DARKRED);
		setCursor(Cursor.DEFAULT);
	}

	@Override
	public void onMouseEntered() {
		setFill(Color.RED);
		setCursor(Cursor.HAND);
	}

}

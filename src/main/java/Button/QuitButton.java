package Button;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.tutorial.KillerPanda;

import javafx.scene.Cursor;
import javafx.scene.input.MouseButton;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class QuitButton extends Button{

	/**
	 * Set the location and text for the quit button
	 * @param initialLocation The location where the quit button is placed
	 * @param killerPanda The main class
	 */
	public QuitButton(Coordinate2D initialLocation, KillerPanda killerPanda) {
		super(initialLocation, "Quit", killerPanda);
		setFill(Color.WHITE);
		setFont(Font.font("Roboto", FontWeight.BOLD, 30));
	}

	@Override
	public void onMouseButtonPressed(MouseButton button, Coordinate2D coordinate2d) {
		killerPanda.quit();
	}

	@Override
	public void onMouseExited() {
		setFill(Color.WHITE);
		setCursor(Cursor.DEFAULT);
	}

	@Override
	public void onMouseEntered() {
		setFill(Color.RED);
		setCursor(Cursor.HAND);
	}

}

package Text;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;

import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class HealthText extends TextEntity{

	/**
	 * Set the location of the text with the health
	 * @param initialLocation the location of the text
	 */
	public HealthText(Coordinate2D initialLocation) {
		super(initialLocation);
		
		setFont(Font.font("Roboto", FontWeight.NORMAL, 30));
		setFill(Color.DARKRED);
	}
	
	/**
	 * Set the amount of health
	 * @param health The amount of health
	 */
	public void setHealthText(int health) {
		setText("Health: " + health);
	}

}

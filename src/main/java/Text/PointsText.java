package Text;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;

import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class PointsText extends TextEntity{

	public PointsText(Coordinate2D initialLocation) {
		super(initialLocation);

		setFont(Font.font("Roboto", FontWeight.NORMAL, 30));
		setFill(Color.BLACK);
	}
	
	public void setText(int points) {
		setText("Points: " + points);
	}

}

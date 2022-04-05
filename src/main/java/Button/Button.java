package Button;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.userinput.MouseButtonPressedListener;
import com.github.hanyaeger.api.userinput.MouseEnterListener;
import com.github.hanyaeger.api.userinput.MouseExitListener;
import com.github.hanyaeger.tutorial.KillerPanda;

import javafx.scene.input.MouseButton;

public abstract class Button extends TextEntity implements MouseExitListener, MouseButtonPressedListener, MouseEnterListener{

	KillerPanda killerPanda;
	
	/**
	 * Set the location and text for the button
	 * @param initialLocation The location where the button is placed
	 * @param text The text that will be displayed in the button
	 * @param killerPanda The main class
	 */
	public Button(Coordinate2D initialLocation, String text, KillerPanda killerPanda) {
		super(initialLocation, text);
		this.killerPanda = killerPanda;
	}

	@Override
	public abstract void onMouseButtonPressed(MouseButton button, Coordinate2D coordinate2d) ;

	@Override
	public abstract void onMouseExited() ;

	@Override
	public abstract void onMouseEntered() ;

}

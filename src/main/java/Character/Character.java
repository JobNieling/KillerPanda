package Character;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.DynamicCompositeEntity;
import com.github.hanyaeger.api.entities.SceneBorderTouchingWatcher;
import com.github.hanyaeger.api.scenes.SceneBorder;

public abstract class Character extends DynamicCompositeEntity implements SceneBorderTouchingWatcher{

	/**
	 * Set the initial location of the character
	 * @param initialLocation The initial location
	 */
	public Character(Coordinate2D initialLocation) {
		super(initialLocation);
	}

	@Override
	public abstract void notifyBoundaryTouching(SceneBorder border) ;

	@Override
	protected abstract void setupEntities() ;

}
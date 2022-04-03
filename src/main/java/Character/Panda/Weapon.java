package Character.Panda;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;

public abstract class Weapon extends SpriteEntity{

	protected Weapon(String resource, Coordinate2D location, Size size, int rows, int columns) {
		super(resource, location, size, rows, columns);
		// TODO Auto-generated constructor stub
	}
	
	public abstract void setDamage();

}

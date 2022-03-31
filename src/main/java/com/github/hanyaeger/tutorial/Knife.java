package com.github.hanyaeger.tutorial;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;

public class Knife extends Weapon{

	protected Knife(Coordinate2D location) {
		super("sprites/bloodyKnife.png", location, new Size(40, 80), 1, 1);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setDamage() {
		// TODO Auto-generated method stub
		
	}

}

package com.alice.program;

import com.badlogic.gdx.Game;

public class RabbitHole extends Game {
	
	
	//Getting into the Dollhouse
	@Override
	public void create () {
		setScreen(new Dollhouse());
	}
}

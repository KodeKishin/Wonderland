package com.alice.program;

import com.badlogic.gdx.Screen;

public class Dollhouse implements Screen {
	
	private static Room thatwhereiam;
	
	public Dollhouse() {
	
		if(thatwhereiam != null)
			thatwhereiam.Enter();
		
	}

	@Override
	public void show() {

	}

	@Override
	public void render(float delta) {
		if(thatwhereiam != null) {
			thatwhereiam.LookAround();
			thatwhereiam.SeeAround();
		}
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub

	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub

	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub

	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}
	
	public static void EnterToARoom(Room thatwhereiwillbe) {
		if(thatwhereiwillbe != null) {
			if(thatwhereiam != null)
				thatwhereiam.Exit();
			
			thatwhereiam = thatwhereiwillbe;
			
			
		}else
			System.out.println("I can't be in a room that does not exist :c");
	}
	
	public static class Rooms{
		
	}
	

}

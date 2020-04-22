package com.alice.program;

import java.util.HashSet;
import java.util.Set;

public abstract class Room {

	protected Set<LookingGlass> mirrors = new HashSet<LookingGlass>();
	
	
	public Room() {
	
	}
	
	
	
	public abstract void Enter();
	public abstract void LookAround();
	public abstract void SeeAround();
	public abstract void Exit();
	
	

}

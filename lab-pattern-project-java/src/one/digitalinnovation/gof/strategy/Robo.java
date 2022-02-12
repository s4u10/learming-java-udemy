package one.digitalinnovation.gof.strategy;

public class Robo {

	private Behavior behavior;

	public void setBehavior(Behavior behavior) {
		this.behavior = behavior;
	}
	
	public void move() {
		behavior.move();
	}
	
}

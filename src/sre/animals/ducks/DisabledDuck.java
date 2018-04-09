package sre.animals.ducks;

public class DisabledDuck implements Duck {

	public void quack() {
		System.out.println("Disabled ducks don't quack.");
	}

	public void fly() {
		System.out.println("Disabled ducks don't fly.");	
	}
 
}

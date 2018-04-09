package sre.ducks;

import sre.ducks.behaviors.fly.FlyWithWings;
import sre.ducks.behaviors.quack.Quack;

public class GenericDuck extends Duck {

	public GenericDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}

	public void display() {
		// TODO Auto-generated method stub
		
	}
}

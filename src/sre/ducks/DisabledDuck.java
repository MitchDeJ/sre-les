package sre.ducks;

import sre.ducks.behaviors.fly.FlyNoWay;
import sre.ducks.behaviors.quack.MuteQuack;

public class DisabledDuck extends Duck {
 
	public DisabledDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new MuteQuack();
	}

	public void display() {
		// TODO Auto-generated method stub
		
	}
}

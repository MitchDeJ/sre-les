package sre.ducks;

import sre.ducks.behaviors.fly.FlyBehavior;
import sre.ducks.behaviors.quack.QuackBehavior;

public abstract class Duck {
	
	public FlyBehavior flyBehavior;
	public QuackBehavior quackBehavior;
	
	public Duck() {
		
	}
	
	public abstract void display();
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void swim() {
		System.out.println("All ducks float, even decoyss");
	}
}

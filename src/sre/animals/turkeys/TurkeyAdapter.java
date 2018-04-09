package sre.animals.turkeys;

import sre.animals.ducks.Duck;

public class TurkeyAdapter implements Duck {
	
	private Turkey turkey;
	
	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}

	public void quack() {
		turkey.gobble();
	}

	public void fly() {
		turkey.fly();
	}

}

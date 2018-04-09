package sre;

import java.util.ArrayList;
import java.util.List;

import sre.ducks.DisabledDuck;
import sre.ducks.Duck;
import sre.ducks.GenericDuck;

public class DuckSimulator {
	public static void main(String[] args) {
		
		Duck gehandicapt = new DisabledDuck();
		Duck eend = new GenericDuck();
		
		List<Duck> duckList = new ArrayList<Duck>();
		duckList.add(gehandicapt);
		duckList.add(eend);
		
		for (Duck duck : duckList) {
			duck.performFly();
			duck.performQuack();
		}
	}
}

package sre;

import java.util.ArrayList;
import java.util.List;

import sre.animals.ducks.DisabledDuck;
import sre.animals.ducks.Duck;
import sre.animals.ducks.GenericDuck;
import sre.animals.turkeys.Turkey;
import sre.animals.turkeys.TurkeyAdapter;
import sre.animals.turkeys.WildTurkey;

public class DuckSimulator {
	public static void main(String[] args) {
		
		Duck gehandicapt = new DisabledDuck();
		Duck eend = new GenericDuck();
		Turkey turkey = new WildTurkey();
		
		List<Duck> duckList = new ArrayList<Duck>();
		duckList.add(gehandicapt);
		duckList.add(eend);
		duckList.add(new TurkeyAdapter(turkey));
		
		for (Duck duck : duckList) {
			duck.fly();
			duck.quack();
		}
	}
}

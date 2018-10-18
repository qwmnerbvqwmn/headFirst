package duckFactory;

import duck.Duck;
import duck.GreenDuck;
import duck.RedDuck;
import duck.ToyDuck;

public class DuckFactorySource implements DuckFactory {

	@Override
	public Duck createRedDuck() {
		// TODO Auto-generated method stub
		return new RedDuck();
	}

	@Override
	public Duck createGreenDuck() {
		// TODO Auto-generated method stub
		return new GreenDuck();
	}

	@Override
	public Duck createToyDuck() {
		// TODO Auto-generated method stub
		return new ToyDuck();
	}

}

package duckFactory;

import duck.Duck;
import duck.GreenDuck;
import duck.RedDuck;
import duck.ToyDuck;
import quack.Jiji;
import quack.Quaqua;
import quackCount.QuackCount;

public class DuckFactoryWithQuackCount implements DuckFactory {

	@Override
	public Duck createRedDuck() {
		// TODO Auto-generated method stub
		return new RedDuck(new QuackCount(new Quaqua()));
	}

	@Override
	public Duck createGreenDuck() {
		// TODO Auto-generated method stub
		return new GreenDuck(new QuackCount(new Quaqua()));
	}

	@Override
	public Duck createToyDuck() {
		// TODO Auto-generated method stub
		return new ToyDuck(new QuackCount(new Jiji()));
	}

}

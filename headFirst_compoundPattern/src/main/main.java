package main;

import java.util.ArrayList;
import java.util.Iterator;

import adapt.AdaptDuckGoose;
import duck.Duck;
import duck.DuckInterface;
import duck.GreenDuck;
import duck.RedDuck;
import duck.ToyDuck;
import duckComponent.DuckComponent;
import duckComponent.Ducks;
import duckComponent.GreenDuckOne;
import duckComponent.RedDuckOne;
import duckComponent.ToyDuckOne;
import duckFactory.DuckFactory;
import duckFactory.DuckFactoryWithQuackCount;
import goose.Goose;
import humanObserver.HumanObserver;
import quack.Jiji;
import quack.Quaqua;
import quackCount.QuackCount;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList al = getAllDuck();
//		ArrayList al = getAllDuckByFactory();
//		playAllDuck(al);	
//		printCount();
		
		testDuckComponent();
	}




	private static void testDuckComponent() {
		// TODO Auto-generated method stub
		DuckComponent greenDuckOne = new GreenDuckOne();
		DuckComponent redDuckOne = new RedDuckOne();
		DuckComponent toyDuckOne = new ToyDuckOne();
		DuckComponent ducks = new Ducks();
		ducks.addChild(greenDuckOne);
		ducks.addChild(redDuckOne);
		ducks.addChild(toyDuckOne);
		
		HumanObserver ho = new HumanObserver();
		((Ducks)ducks).register(ho);
		((GreenDuckOne)greenDuckOne).register(ho);
		
		ducks.quack();
		
	}




	private static ArrayList getAllDuckByFactory() {
		ArrayList al = new ArrayList();
		DuckFactory df = new DuckFactoryWithQuackCount();
//		al.add(new RedDuck(new QuackCount(new Quaqua())));
//		al.add(new GreenDuck(new QuackCount(new Quaqua())));
//		al.add(new ToyDuck(new QuackCount(new Jiji())));		
		registDucks(al, df);
		al.add(new AdaptDuckGoose(new Goose()));
		
		return al;
	}


	


	private static void registDucks(ArrayList al, DuckFactory df) {
		// TODO Auto-generated method stub
		al.add(df.createRedDuck());
		al.add(df.createGreenDuck());
		al.add(df.createToyDuck());
	}




	public static ArrayList getAllDuck() {
		ArrayList al = new ArrayList();
//		al.add(new RedDuck());
//		al.add(new GreenDuck());
//		al.add(new ToyDuck());
//		al.add(new AdaptDuckGoose(new Goose()));
//		Duck d = new RedDuck()
		al.add(new RedDuck(new QuackCount(new Quaqua())));
		al.add(new GreenDuck(new QuackCount(new Quaqua())));
		al.add(new ToyDuck(new QuackCount(new Jiji())));
		al.add(new AdaptDuckGoose(new Goose()));
		
		return al;
	}
	
	
	public static void playAllDuck(ArrayList al) {
		Iterator<DuckInterface> iter = al.iterator();
		while (iter.hasNext()) {
			iter.next().quack();
		}
	}
	
	
	private static void printCount() {
		// TODO Auto-generated method stub
		System.out.println("had quacked times: " + QuackCount.getQuackCount());
	}
	
}

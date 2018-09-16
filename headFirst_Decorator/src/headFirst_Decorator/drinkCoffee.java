package headFirst_Decorator;

public class drinkCoffee {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Beverage drink = new HouseBlend();
		drink = new Milk(drink);
		System.out.println(drink.getDescription());
		drink = new Mocha(drink);
		System.out.println(drink.getDescription());
		drink = new Soy(new DarkRoast());
		System.out.println(drink.getDescription());
		
	}

}

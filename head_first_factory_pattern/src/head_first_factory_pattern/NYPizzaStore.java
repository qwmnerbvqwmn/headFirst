package head_first_factory_pattern;

public class NYPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		// TODO 自动生成的方法存根
		if (type.equals("cheese")) {
			return new CheesePizza(new NYPizzaIngredientFactory());			
		} else if (type.equals("veggie")) {
			return new VeggiePizza(new NYPizzaIngredientFactory());
		} else return null;
		
	}

}

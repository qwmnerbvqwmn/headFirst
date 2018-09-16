package head_first_factory_pattern;

public class CheesePizza extends Pizza {

	PizzaIngredientFactory pizzaIngredientFactory;
	
	public CheesePizza(PizzaIngredientFactory factory) {
		name = "new yuck cheese pizza";
		pizzaIngredientFactory = factory;
	}

	@Override
	public void prepare() {
		// TODO 自动生成的方法存根
		System.out.println("preparing.......");
		dough = pizzaIngredientFactory.CreateDough();
		sauce = pizzaIngredientFactory.createSauce();
		
	}

}

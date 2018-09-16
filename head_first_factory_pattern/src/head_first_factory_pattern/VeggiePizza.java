package head_first_factory_pattern;

public class VeggiePizza extends Pizza {
	
	PizzaIngredientFactory pizzaIngredientFactory;
	
	public VeggiePizza(PizzaIngredientFactory factory) {
		name = "new yuck Veggie Pizza";
		pizzaIngredientFactory = factory;
	}

	@Override
	public void prepare() {
		// TODO 自动生成的方法存根
		System.out.println("preparing......");
		dough = pizzaIngredientFactory.CreateDough();
		sauce = pizzaIngredientFactory.createSauce();
	}
}

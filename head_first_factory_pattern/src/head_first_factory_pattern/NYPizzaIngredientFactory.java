package head_first_factory_pattern;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough CreateDough() {
		// TODO 自动生成的方法存根
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		// TODO 自动生成的方法存根
		return new PlumTomatoSauce();
	}

}

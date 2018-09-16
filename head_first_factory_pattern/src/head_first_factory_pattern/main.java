package head_first_factory_pattern;

public class main {
	public static void main(String[] args) {
		PizzaStore store = new NYPizzaStore();
		store.orderPizza("cheese");
		store.orderPizza("veggie");
	}
}

package adapt;

import duck.Duck;
import duck.DuckInterface;
import goose.Goose;

public class AdaptDuckGoose implements DuckInterface {

	Goose goose;
	public AdaptDuckGoose(Goose goose) {
		// TODO Auto-generated constructor stub
		this.goose = goose;
	}
	@Override
	public void quack() {
		// TODO Auto-generated method stub
		this.goose.tweet();
	}
}

package factory;

public class W�oskaPizzeria extends Pizzeria {

	@Override
	protected Pizza utw�rzPizza(String type) {
		if ("serowa".equals(type)){
			return new W�oskaSerowaPizza();
		} else return null;
	}

}

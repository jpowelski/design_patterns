package factory;

public class W³oskaPizzeria extends Pizzeria {

	@Override
	protected Pizza utwórzPizza(String type) {
		if ("serowa".equals(type)){
			return new W³oskaSerowaPizza();
		} else return null;
	}

}

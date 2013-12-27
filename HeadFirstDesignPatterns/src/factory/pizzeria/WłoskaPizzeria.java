package factory.pizzeria;

import factory.pizza.Pizza;
import factory.pizza.W³oskaSerowaPizza;

public class W³oskaPizzeria extends Pizzeria {

	@Override
	protected Pizza utwórzPizza(String type) {
		if ("serowa".equals(type)){
			return new W³oskaSerowaPizza();
		} else return null;
	}

}

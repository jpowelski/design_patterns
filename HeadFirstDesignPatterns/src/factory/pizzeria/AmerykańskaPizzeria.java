package factory.pizzeria;

import factory.pizza.AmerykañskaSerowaPizza;
import factory.pizza.Pizza;

public class AmerykañskaPizzeria extends Pizzeria {

	@Override
	protected Pizza utwórzPizza(String type) {
		if ("serowa".equals(type)){
			return new AmerykañskaSerowaPizza();
		} else return null;
	}

}
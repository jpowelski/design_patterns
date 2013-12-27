package factory.pizzeria;

import factory.ingredients.FabrykaSk³adnikówPizzy;
import factory.ingredients.W³oskaFabrykaSk³adnikówPizzy;
import factory.pizza.OwoceMorzaPizza;
import factory.pizza.Pizza;
import factory.pizza.SerowaPizza;

public class W³oskaPizzeria extends Pizzeria {

	@Override
	protected Pizza utwórzPizza(String type) {
		Pizza pizza = null;
		FabrykaSk³adnikówPizzy fabrykaSk³adników = new W³oskaFabrykaSk³adnikówPizzy();

		if ("serowa".equals(type)) {
			pizza = new SerowaPizza(fabrykaSk³adników);
			pizza.ustawNazwa("W³oska Pizza Serowa");
		} else if ("owoce morza".equals(type)) {
			pizza = new OwoceMorzaPizza(fabrykaSk³adników);
			pizza.ustawNazwa("W³oska Pizza Owoce Morza");
		}
		return pizza;
	}

}

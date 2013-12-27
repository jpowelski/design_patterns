package factory.pizzeria;

import factory.ingredients.FabrykaSk�adnik�wPizzy;
import factory.ingredients.W�oskaFabrykaSk�adnik�wPizzy;
import factory.pizza.OwoceMorzaPizza;
import factory.pizza.Pizza;
import factory.pizza.SerowaPizza;

public class W�oskaPizzeria extends Pizzeria {

	@Override
	protected Pizza utw�rzPizza(String type) {
		Pizza pizza = null;
		FabrykaSk�adnik�wPizzy fabrykaSk�adnik�w = new W�oskaFabrykaSk�adnik�wPizzy();

		if ("serowa".equals(type)) {
			pizza = new SerowaPizza(fabrykaSk�adnik�w);
			pizza.ustawNazwa("W�oska Pizza Serowa");
		} else if ("owoce morza".equals(type)) {
			pizza = new OwoceMorzaPizza(fabrykaSk�adnik�w);
			pizza.ustawNazwa("W�oska Pizza Owoce Morza");
		}
		return pizza;
	}

}

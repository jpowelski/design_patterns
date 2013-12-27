package factory.pizzeria;

import factory.ingredients.AmerykañskaFabrykaSk³adnikówPizzy;
import factory.ingredients.FabrykaSk³adnikówPizzy;
import factory.pizza.OwoceMorzaPizza;
import factory.pizza.Pizza;
import factory.pizza.SerowaPizza;

public class AmerykañskaPizzeria extends Pizzeria {

	@Override
	protected Pizza utwórzPizza(String type) {
		Pizza pizza = null;
		FabrykaSk³adnikówPizzy fabrykaSk³adników = new AmerykañskaFabrykaSk³adnikówPizzy();

		if ("serowa".equals(type)) {
			pizza = new SerowaPizza(fabrykaSk³adników);
			pizza.ustawNazwa("Amerykañska Pizza Serowa");
		} else if ("owoce morza".equals(type)) {
			pizza = new OwoceMorzaPizza(fabrykaSk³adników);
			pizza.ustawNazwa("Amerykañska Pizza Owoce Morza");
		}
		return pizza;
	}

}

package factory.pizzeria;

import factory.ingredients.FabrykaSkładnikówPizzy;
import factory.ingredients.WłoskaFabrykaSkładnikówPizzy;
import factory.pizza.OwoceMorzaPizza;
import factory.pizza.Pizza;
import factory.pizza.SerowaPizza;

public class WłoskaPizzeria extends Pizzeria {

	@Override
	protected Pizza utwórzPizza(String type) {
		Pizza pizza = null;
		FabrykaSkładnikówPizzy fabrykaSkładników = new WłoskaFabrykaSkładnikówPizzy();

		if ("serowa".equals(type)) {
			pizza = new SerowaPizza(fabrykaSkładników);
			pizza.ustawNazwa("włoska Pizza Serowa");
		} else if ("owoce morza".equals(type)) {
			pizza = new OwoceMorzaPizza(fabrykaSkładników);
			pizza.ustawNazwa("włoska Pizza Owoce Morza");
		}
		return pizza;
	}

}

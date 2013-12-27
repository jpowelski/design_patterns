package factory.pizzeria;

import factory.ingredients.AmerykańskaFabrykaSkładnikówPizzy;
import factory.ingredients.FabrykaSkładnikówPizzy;
import factory.pizza.OwoceMorzaPizza;
import factory.pizza.Pizza;
import factory.pizza.SerowaPizza;

public class AmerykańskaPizzeria extends Pizzeria {

	@Override
	protected Pizza utwórzPizza(String type) {
		Pizza pizza = null;
		FabrykaSkładnikówPizzy fabrykaSkładników = new AmerykańskaFabrykaSkładnikówPizzy();

		if ("serowa".equals(type)) {
			pizza = new SerowaPizza(fabrykaSkładników);
			pizza.ustawNazwa("Amerykańska Pizza Serowa");
		} else if ("owoce morza".equals(type)) {
			pizza = new OwoceMorzaPizza(fabrykaSkładników);
			pizza.ustawNazwa("Amerykańska Pizza Owoce Morza");
		}
		return pizza;
	}

}

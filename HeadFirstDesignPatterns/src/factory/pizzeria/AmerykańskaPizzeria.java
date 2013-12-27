package factory.pizzeria;

import factory.ingredients.Ameryka�skaFabrykaSk�adnik�wPizzy;
import factory.ingredients.FabrykaSk�adnik�wPizzy;
import factory.pizza.OwoceMorzaPizza;
import factory.pizza.Pizza;
import factory.pizza.SerowaPizza;

public class Ameryka�skaPizzeria extends Pizzeria {

	@Override
	protected Pizza utw�rzPizza(String type) {
		Pizza pizza = null;
		FabrykaSk�adnik�wPizzy fabrykaSk�adnik�w = new Ameryka�skaFabrykaSk�adnik�wPizzy();

		if ("serowa".equals(type)) {
			pizza = new SerowaPizza(fabrykaSk�adnik�w);
			pizza.ustawNazwa("Ameryka�ska Pizza Serowa");
		} else if ("owoce morza".equals(type)) {
			pizza = new OwoceMorzaPizza(fabrykaSk�adnik�w);
			pizza.ustawNazwa("Ameryka�ska Pizza Owoce Morza");
		}
		return pizza;
	}

}

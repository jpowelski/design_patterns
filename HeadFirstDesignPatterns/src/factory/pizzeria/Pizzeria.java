package factory.pizzeria;

import factory.pizza.Pizza;

public abstract class Pizzeria {

	public Pizza zam�wPizza(String type){
		Pizza pizza;
		
		pizza = utw�rzPizza(type);
		
		pizza.przygotowanie();
		pizza.pieczenie();
		pizza.krojenie();
		pizza.pakowanie();
		
		return pizza;
	}

	protected abstract Pizza utw�rzPizza(String type);
	
}

package factory;

import factory.pizza.Pizza;
import factory.pizzeria.AmerykańskaPizzeria;
import factory.pizzeria.Pizzeria;
import factory.pizzeria.WłoskaPizzeria;

public class PizzaTest {

	public static void main(String[] args) {
		Pizzeria włoska = new WłoskaPizzeria();
		Pizzeria amerykańska = new AmerykańskaPizzeria();
		
		Pizza pizza = włoska.zamówPizza("serowa");
		System.out.println("Eryk zamówił: " + pizza.pobierzNazwa() + "\n");
		
		pizza = amerykańska.zamówPizza("serowa");
		System.out.println("Jacek zamówił: " + pizza.pobierzNazwa() + "\n");
	}

}

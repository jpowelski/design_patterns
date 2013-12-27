package factory;

import factory.pizza.Pizza;
import factory.pizzeria.Ameryka�skaPizzeria;
import factory.pizzeria.Pizzeria;
import factory.pizzeria.W�oskaPizzeria;

public class PizzaTest {

	public static void main(String[] args) {
		Pizzeria w�oska = new W�oskaPizzeria();
		Pizzeria ameryka�ska = new Ameryka�skaPizzeria();
		
		Pizza pizza = w�oska.zam�wPizza("serowa");
		System.out.println("Eryk zam�wi�: " + pizza.pobierzNazwa() + "\n");
		
		pizza = ameryka�ska.zam�wPizza("serowa");
		System.out.println("Jacek zam�wi�: " + pizza.pobierzNazwa() + "\n");
	}

}

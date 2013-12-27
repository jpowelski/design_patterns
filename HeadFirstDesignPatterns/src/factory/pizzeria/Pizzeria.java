package factory.pizzeria;

import factory.pizza.Pizza;

/**
 * <b>Metoda fabrykuj�ca</b>
 * 
 * definuje interfejs pozwalaj�cy na tworzenie obiekt�w, ale pozwala klasom
 * podrz�dnym decydowa�, jakiej klasy obiekt zostanie utworzony. Wzorzec Factory
 * Method przekazuje odpowiedzialno�� za tworzenie obiekt�w do klas podrz�dnych.
 * 
 * @author galica
 * 
 */
public abstract class Pizzeria {

	public Pizza zam�wPizza(String type) {
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

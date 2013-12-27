package factory.pizzeria;

import factory.pizza.Pizza;

/**
 * <b>Metoda fabrykuj¹ca</b>
 * 
 * definuje interfejs pozwalaj¹cy na tworzenie obiektów, ale pozwala klasom
 * podrzêdnym decydowaæ, jakiej klasy obiekt zostanie utworzony. Wzorzec Factory
 * Method przekazuje odpowiedzialnoœæ za tworzenie obiektów do klas podrzêdnych.
 * 
 * @author galica
 * 
 */
public abstract class Pizzeria {

	public Pizza zamówPizza(String type) {
		Pizza pizza;

		pizza = utwórzPizza(type);

		pizza.przygotowanie();
		pizza.pieczenie();
		pizza.krojenie();
		pizza.pakowanie();

		return pizza;
	}

	protected abstract Pizza utwórzPizza(String type);

}

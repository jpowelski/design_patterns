package factory.pizzeria;

import factory.pizza.Pizza;

/**
 * <b>Metoda fabrykująca</b>
 * 
 * definuje interfejs pozwalający na tworzenie obiektów, ale pozwala klasom
 * podrzędnym decydować, jakiej klasy obiekt zostanie utworzony. Wzorzec Factory
 * Method przekazuje odpowiedzialność za tworzenie obiektów do klas podrzędnych.
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

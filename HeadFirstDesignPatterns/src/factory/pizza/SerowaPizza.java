package factory.pizza;

import factory.ingredients.FabrykaSk³adnikówPizzy;

public class SerowaPizza extends Pizza {

	public SerowaPizza(FabrykaSk³adnikówPizzy fabrykaSk³adników) {
		this.fabrykaSk³adników = fabrykaSk³adników;
	}

	@Override
	public void przygotowanie() {
		System.out.println("Przygotowanie: " + nazwa);
		ciasto = fabrykaSk³adników.utwórzCiasto();
		sos = fabrykaSk³adników.utwórzSos();
		ser = fabrykaSk³adników.utwórzSer();
	}

}

package factory.pizza;

import factory.ingredients.FabrykaSk�adnik�wPizzy;

public class SerowaPizza extends Pizza {

	public SerowaPizza(FabrykaSk�adnik�wPizzy fabrykaSk�adnik�w) {
		this.fabrykaSk�adnik�w = fabrykaSk�adnik�w;
	}

	@Override
	public void przygotowanie() {
		System.out.println("Przygotowanie: " + nazwa);
		ciasto = fabrykaSk�adnik�w.utw�rzCiasto();
		sos = fabrykaSk�adnik�w.utw�rzSos();
		ser = fabrykaSk�adnik�w.utw�rzSer();
	}

}

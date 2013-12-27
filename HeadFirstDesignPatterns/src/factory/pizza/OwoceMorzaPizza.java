package factory.pizza;

import factory.ingredients.FabrykaSk�adnik�wPizzy;

public class OwoceMorzaPizza extends Pizza {

	public OwoceMorzaPizza(FabrykaSk�adnik�wPizzy fabrykaSk�adnik�w) {
		this.fabrykaSk�adnik�w = fabrykaSk�adnik�w;
	}

	@Override
	public void przygotowanie() {
		System.out.println("Przygotowanie: " + nazwa);
		ciasto = fabrykaSk�adnik�w.utw�rzCiasto();
		sos = fabrykaSk�adnik�w.utw�rzSos();
		ser = fabrykaSk�adnik�w.utw�rzSer();
		ma��e = fabrykaSk�adnik�w.utw�rzMa��e();
	}

}

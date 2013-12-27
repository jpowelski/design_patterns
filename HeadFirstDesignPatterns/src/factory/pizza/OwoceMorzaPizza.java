package factory.pizza;

import factory.ingredients.FabrykaSk³adnikówPizzy;

public class OwoceMorzaPizza extends Pizza {

	public OwoceMorzaPizza(FabrykaSk³adnikówPizzy fabrykaSk³adników) {
		this.fabrykaSk³adników = fabrykaSk³adników;
	}

	@Override
	public void przygotowanie() {
		System.out.println("Przygotowanie: " + nazwa);
		ciasto = fabrykaSk³adników.utwórzCiasto();
		sos = fabrykaSk³adników.utwórzSos();
		ser = fabrykaSk³adników.utwórzSer();
		ma³¿e = fabrykaSk³adników.utwórzMa³¿e();
	}

}

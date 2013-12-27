package factory.pizza;

import factory.ingredients.FabrykaSkładnikówPizzy;

public class OwoceMorzaPizza extends Pizza {

	public OwoceMorzaPizza(FabrykaSkładnikówPizzy fabrykaSkładników) {
		this.fabrykaSkładników = fabrykaSkładników;
	}

	@Override
	public void przygotowanie() {
		System.out.println("Przygotowanie: " + nazwa);
		ciasto = fabrykaSkładników.utwórzCiasto();
		sos = fabrykaSkładników.utwórzSos();
		ser = fabrykaSkładników.utwórzSer();
		Małże = fabrykaSkładników.utwórzMałże();
	}

}

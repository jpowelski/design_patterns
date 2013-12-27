package factory.pizza;

import factory.ingredients.FabrykaSkładnikówPizzy;

public class OwoceMorzaPizza extends Pizza {

	private FabrykaSkładnikówPizzy fabrykaSkładników;

	public OwoceMorzaPizza(FabrykaSkładnikówPizzy fabrykaSkładników) {
		this.fabrykaSkładników = fabrykaSkładników;
	}

	@Override
	public void przygotowanie() {
		System.out.println("Przygotowanie: " + nazwa);
		ciasto = fabrykaSkładników.utwórzCiasto();
		sos = fabrykaSkładników.utwórzSos();
		ser = fabrykaSkładników.utwórzSer();
		małże = fabrykaSkładników.utwórzMałże();
	}

}
